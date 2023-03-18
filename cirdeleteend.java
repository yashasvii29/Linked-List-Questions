import java.util.Scanner;
public class cirdeleteend {
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
    Node head=null;
    Node tail=null;
    void creation()
    {
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
                tail=new_node;
                new_node.next=head;
            }
            else
            {
                tail.next=new_node;
                tail=new_node;
                new_node.next=head;
            }
            System.out.println("Do you want to add more data.If yes Enter 1");
            n=sc.nextInt();
        }
        while(n==1);   
    }
    void delete()
    {
        if(head==null)
        {
            System.out.println("LL does not exist");
        }
        else
        {
            Node temp=head;
            Node ptr=temp.next;
            while(ptr.next!=head)
            {
                temp=ptr;
                ptr=ptr.next;
            }
             temp.next=head;
             tail=temp;

        }
    }
    void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Linked list does not exist");
        }
        else
        {
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
        }
    }
    public static void main(String[] args)
    {
        cirdeleteend ll=new cirdeleteend();
        ll.creation();
        ll.delete();
        ll.traverse();
    }
} 
