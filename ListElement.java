public class ListElement											//Class declaration for ListElement
{
    int data;
    ListElement next;
    ListElement previous;

    ListElement()													//Default constructor
    {
        this.data = 0;
        this.next = null;
        this.previous = null;
    }

    public ListElement(int data)									//Constructor
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    	
    public int getData()											//Getter-functions
    {
        return this.data;
    }
	public ListElement getNext()
    {
        return this.next;
    }
	public ListElement getPrevious()
    {
        return this.previous;
	}
	
	public void setData(int data)									//Setter-functions
    {
        this.data = data;
    }
	public void setNext(ListElement next)
    {
		this.next = next;
	}
	public void setPrevious(ListElement previous)
    {
        this.previous = previous;
    }
}