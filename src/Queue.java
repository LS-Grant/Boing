
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by LinkedListElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author Luc Saunders-Grant
 *
 */

import java.util.NoSuchElementException;

public class Queue 
{
	//Start of the Queue
	private QueueElement head;
	//Last element of the Queue
	private QueueElement tail;
	//Error message
	private final String ERR_MESSAGE = "The queue is empty";
	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () 
	{
		head = null;
		tail = null;
	}
	
	/**
	 * @return Returns True if the queue is empty and False if not
	 */
	public boolean isEmpty() 
	{
		if ((head == null) && (tail == null))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	/**
	 * @return Returns the head element if the queue is not empty
	 */
	public Object peek () throws NoSuchElementException 
	{
		if(isEmpty())
		{
			//Incase the user tries to peek at an empty Queue
			throw new NoSuchElementException(ERR_MESSAGE);
		}
		else 
		{
			return head.getElement(); 
		}
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException 
	{
		if(isEmpty())
		{
			//incase the user tries to dequeue an empty queue
			throw new NoSuchElementException(ERR_MESSAGE);
		}
		else if(head.getNext() == null)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.getNext();
		}

	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (Object element) 
	{
		QueueElement newElement = new QueueElement (element,null);
		if(isEmpty())
		{
			tail = newElement;
			head = newElement;
		}
		else
		{
		tail.setNext(newElement);
		tail = newElement;
		}
	
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () 
	{
		if(isEmpty())
		{
			//Incase there is an empty queue
			System.out.println(ERR_MESSAGE);
		}
		else 
		{
			QueueElement temp = head;
			while (temp != null) 
			{
				System.out.print(temp.getElement() + " ");
				temp = temp.getNext();
			}
		}
	}
}