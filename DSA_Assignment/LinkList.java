package com.nagarro.linkedlist.assignment;

public class LinkList {
    Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	//INSERT AT FIRST POSITION
	
	public void insertFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	//INSERT AT LAST POSITION
	
	public void insertLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node currentNode=head; 
		while(currentNode.next!=null)
		{
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	}
	
	//INSERT AT ANY GIVEN POSITION
	
	public void insertAtPosition(int pos,int data)
	{
		Node newNode=new Node(data);
		Node previous=head;
		int count=1;
		while(count<pos-1)
		{
			previous=previous.next;
			count++;
		}
		Node current=previous.next;
		newNode.next=current;
		previous.next=newNode;
		
	}
	
	//DELETE THE FIRST ELEMENT
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("The list is empty");
			return;
		}
		head=head.next;
	}
	
	//DELETE THE AST ELELEMNT
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("The list is empty");
			return;
		}
		
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		Node secondLast=head;
		Node lastNode=head.next;
		while(lastNode.next!=null)
		{
			lastNode=lastNode.next;
			secondLast=secondLast.next;
			
		}
		secondLast.next=null;
	}
	
	//DELETE ELEMNT FROM ANY GIVEN POSISTION
	
	public void deleteAtPosition(int pos)
	{
		if(pos==1)
		{
			head=head.next;
		}
		else
		{
			Node previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Node current=previous.next;
			previous.next=current.next;
		}
	}
	
	//SIZE OF THE LIST
	
	public void size()
	{
		int count=0;
		Node currentNode=head;
		while(currentNode!=null)
		{
			count++;
			currentNode=currentNode.next;
		}
		
		System.out.println(count);
		
	}
	
	//TO GET THE MIDDLE ELEMNT IN THE LIST
	
	public void centre()
	{
		Node slowPtr=head;
		Node fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		System.out.println("The middle node is: "+slowPtr.data);
	}
	
	//REVERSE THE LIST
	
    public void reverse()
	{
		if(head==null ||head.next==null)
		{
			return;
		}
		
		Node prev=head;
		Node curr=head.next;
		
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=next;
		}
		head.next=null;
		head=prev;
	}
    
    //DISPLAY THE LIST
	
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is empty.");
			return;
		}
		Node currentNode=head; 
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+" -->");
			currentNode=currentNode.next;
		}
		
		System.out.println("null");
		
	}
	
	
	
	public static void main(String[] args) 
	{
				
		LinkList list=new LinkList();
		list.insertFirst(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(5);
		list.printList();
		
		
		
	    list.reverse();
		
	    list.printList();
	
	}
	
}