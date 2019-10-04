import java.util.*;
public class LinkedList													//Class LinkedList declaration
{
    ListElement front;
    ListElement back;
    int size;
	
    LinkedList()														//Default Constructor
    {
        front = null;
        back = null;
        size = 0;
    }

    public void addElement(ListElement ListE1)							//Function to add elements to list
    {
        ListElement LE = new ListElement(ListE1.getData());
        LE.setNext(front);
		
        if(front != null)
		{   
			front.setPrevious(LE);
		}
        
		front = LE;

        if(back == null)
		{
            back = LE;
		}      
        size++;
    }
	
    public ListElement getElement(int index)							//Function to retrieve elements from the list
    {
        if (index < 0 || index >= size)
		{
            System.out.println("Invalid element position!!!");
		}
        else
        {
            int x = 1;
            ListElement trav = front;
	
            while(x < index)
			{
				trav = trav.getNext();
				x++;
			}
			return trav;
        }
    }
	
    public ListElement deleteElement(int index)							//Function to retrieve elements from the list
    {
        if (index < 0 || index >= size)
		{
            System.out.println("Invalid element position!!!");
		}
        else
        {  
            if(index == 0)
            {
                ListElement lisEl = front;
                front = front.getNext();
				
                if(front != null)
				{
					front.setPrevious(null);
				}
                size--;
                return lisEl;
            }

            ListElement trav = front;

            int y = 1;

            while(y < index)
			{
                trav = trav.getNext();
				y++;
				
			}
			
            ListElement lisEl = trav.getNext();
            trav.setNext(trav.getNext().getNext());
			
            if(trav.getNext() != null)
			{
                trav.getNext().setPrevious(trav);
			}
            size--;
			
            return lisEl;
        }
    }
	
    public void printLinkedListHead()										//Function to print the linked list head-traversed
    {
        ListElement trav = front;
		
        while(trav != null)
        {
            System.out.print(trav.getData() + " ");
            trav = trav.getNext();
        }
        System.out.println();
    }

    public void printLinkedListTail()										//Function to print the linked list tail-traversed
    {
        ListElement trav = back;
        while(trav != null)
        {
            System.out.print(trav.getData() + " ");
            trav = trav.getPrevious();
        }     
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedList ob = new LinkedList();	
		int a;
		System.out.println("Enter your desired size of linked list: ");
		Scanner S=new Scanner(System.in);
		a=S.nextInt();
		
		for (int i = 0; i < a; i++)
		{
			System.out.println("Enter value " +(i+1)+ " for linked list: ");
			int b;
			Scanner D = new Scanner(System.in);
			b=D.nextInt();
			ob.addElement(new ListElement(b));
		}
      
        System.out.print("\nList Traversal from Head: ");
        ob.printLinkedListHead();
		
        System.out.print("\nList Traversal from Tail: ");
        ob.printLinkedListTail();

		System.out.println("Enter position (starts from 0) of value to delete from the list: ");
		int c;
		Scanner E = new Scanner(System.in);
		c=E.nextInt();
		
        ob.deleteElement(c);

        System.out.print("\nList after deleting element at index " +c+ ": ");
        ob.printLinkedListHead();
    }
}