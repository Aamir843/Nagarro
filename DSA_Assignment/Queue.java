package com.nagarro.linkedlist.assignment;

public class Queue {
	static int size=10;
	int arr[]=new int[size];
	int rear=-1;
	int front=-1;
	

	public void enqueue(int item)
	{
		if(isFull())
		{
			System.out.println("The queuue is full");
		}
		else
		{
			arr[++rear]=item;
		}
	}
	
	public void dequeue()
	{
		//front=arr[0];
		if(isEmpty())
		{
			System.out.println("The queue is empty.");
		}
		else
		{
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
		}
		rear--;
		
	}
	public void rear()
	{
		System.out.println("\nThe last element of the queue is :"+arr[rear]);
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("The queue is empty.");
		}
		System.out.println("\nThe first element of the queue is :"+arr[0]);
	}
	
	public void print()
	{
		for(int i=0;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public boolean isEmpty()
	{
		return rear==front;
	}
	public boolean isFull()
	{
		return rear==size-1;
		
	}
	
	public void contains(int item)
	{
		for(int i=0;i<rear;i++)
		{
			if(arr[i]==item)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	
	public void size()
	{
		System.out.println("\nThe size of the queue is: "+(rear+1));
	}
	
	public void Centre()
	{
		if(rear%2==0)
		{
			System.out.println("\nThe middle element is :"+arr[rear/2+1]);
		}
		else
			System.out.println("\nThe middle element is :"+arr[rear/2]);
			
	}
	
	public void reverse()
	{
		System.out.println("\n=========Reversed Queue==========\n");
		for(int i=rear;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Queue queue=new Queue();
		queue.enqueue(15);
		queue.enqueue(25);
		queue.enqueue(35);
		queue.enqueue(45);
		queue.enqueue(55);
		queue.enqueue(65);
		queue.enqueue(75);
		queue.enqueue(85);
		queue.enqueue(95);
		queue.dequeue();
		queue.print();
		queue.Centre();
		queue.size();
		queue.rear();
	    queue.peek();
	    queue.reverse();

	}

}
