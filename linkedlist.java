import java.util.Scanner;
public class linkedlist {
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
    void creation()
    {
        int data,n,m,p;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
            }
            else{
                
                        Node temp=head;
                        while(temp.next!=null)
                        {
                            temp=temp.next;
                        }
                        temp.next=new_node;
                    
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

        
            int p;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter position of node to be deleted");
            p=sc.nextInt();
            Node temp=head;
            Node ptr=temp.next;
            for(int i=0;i<p-2;i++)
            {
                temp=ptr;
                ptr=ptr.next;
            }
            temp.next=ptr.next;
        }

    }
    
    void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Linked list does not exist");
        }
        else{
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        linkedlist ll=new linkedlist();
        ll.creation();
        ll.delete();
        ll.traverse();
        
    }
}

