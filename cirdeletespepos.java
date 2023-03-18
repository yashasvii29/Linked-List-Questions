import java.util.Scanner;
public class cirdeletespepos {
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
        cirdeletespepos ll=new cirdeletespepos();
        ll.creation();
        ll.delete();
        ll.traverse();
    }
}
