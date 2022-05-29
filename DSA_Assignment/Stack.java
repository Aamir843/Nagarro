package com.nagarro.linkedlist.assignment;

public class Stack {
	int size=11;
	int arr[]=new int[size];
	int top;
	
	
	Stack()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		return(top==-1);
	}
	
	boolean isFull()
	{
		return(top==size);
	}
	
	public void push(int element)
	{
		if(isFull())
		{
			System.out.println("Stack overflow.");
		}
	
		
		else
			try
		{
		
			arr[++top]=element;
			//System.out.println("Pushed");
			
		}
		catch(Exception e)
		{
			System.out.println("Stack overflow");
		}
	}
	
	
	
	public void pop()
	{
		if(isEmpty()) 
		{
			System.out.println("Stack is empty.");
		}
		else
		{
			top--;
		}
	}
	
	public void size()
	{
		System.out.println("The size of stack is :"+(top+1));
	}
	
	public void peek()
	{
		System.out.println("The first element of the stack is :"+arr[top]);
	}
	
	public void centre()
	{
		if(top%2==0)
		{
			System.out.println("The middle element of the stack is :"+arr[top/2]);
		}
		else
		{
			System.out.println("The middle element of the stack is :"+arr[top/2+1]);
		}
		
	}
	
	public void printStack()
	{
		for(int i=top-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void contains(int item)
	{
		for(int i=top-1;i>=0;i--)
		{
			if(item==arr[i])
			{
				System.out.println("YES");
				break;
			}
				
		}
		System.out.println("NO");
	}
	
	public void reverse()
	{
		System.out.println("==========Reversed Stack==========");
		for(int i=0;i<top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
	    stack.push(7);
	    stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
	//    stack.pop();
		stack.printStack();
	//	System.out.println(stack.top);
		//stack.size();
		
		//stack.peek();
		//stack.centre();
		stack.contains(6);
		
		System.out.println("Top elemnt"+stack.top);
		stack.reverse();

	}

}
