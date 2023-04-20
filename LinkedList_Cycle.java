public class LinkedList_Cycle {
    public class Node{
        // It has two pointer head and tail
        // head-> Starting pointer(Address of 1st node)
        // tail-> end pointer(Address of last node)
        int val;
        Node next;
        // next ka type node hai bcz it contain the address of next node
        // 11 functions of linked list in this code
    }
    private Node head;
    private int size;
    private Node tail;
    public void AddFirst(int item){
        Node nn=new Node();
        // every node ke liye new address banega
        nn.val=item;
        if(size==0){
            this.head=nn;
            this.tail=nn;
            this.size++; 
        }
        else{ // else m node ko next node se connect krne ka code 
            nn.next=head;
            head=nn;
            this.size++;
     }
    }
        public void Display(){
            Node temp=head;  // temp ka type node because it will contain address
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println(".");
        }
        public void AddLast(int item){
            if(size==0){
                AddFirst(item);

            }
            else{
                Node nn=new Node();  // new node banayenge
                nn.val=item;
                tail.next=nn;
                tail=nn; 
                size++;
            }
        }
        public void CreateCycle() throws Exception{
            Node nn=GetNode(2);
            this.tail.next=nn;

        }
        public Node GetNode(int K) throws Exception{
            if(K<0 || K>=size){
                throw new Exception("K is not in range");
            }
            Node temp=head;
            for(int i=1;i<=K;i++){
                temp=temp.next;
            }
            return temp;
        }
        public Node hasCycle(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return slow;
                }
                
            }
        return null;
        }
        public void CycleRemoval1(){
            Node meet=hasCycle(head); 
            if(meet==null){
                return ;
            }
            Node curr=head;
            while(curr!=head){
                Node temp=meet;
                while(temp.next!=meet){  // Cycle m move krna
                    if(temp.next==curr){
                        temp.next=null;
                        return;
                    }
                    temp=temp.next;
                }
                curr=curr.next;
            }
        }
        public void CycleRemoval2(){
            Node meet=hasCycle(head);
            if(meet==null){
                return;
            }
            //Cycle ka count 
            Node temp=meet;
            int count=1;while(temp.next!=meet){
                count++;
                temp=temp.next;
            }
            // m length aage jaayega
            Node fast=head;
            for(int i=1;i<=count;i++){
                fast=fast.next;
            }
            Node slow=head;
            while(slow.next!=fast.next){
                fast=fast.next;
                slow=slow.next;
            }
            fast.next=null;
        }
        public void floyedCycleRemoval(){   // floyed cycle removal algorithm
            Node meet=hasCycle(head);
            if(meet==null){
                return;
            }
            Node fast=meet;
            Node slow=head;
            while(slow.next!=fast.next){
                fast=fast.next;
                slow=slow.next;
            }
            fast.next=null;
        }
            public static void main(String[] args) throws Exception {
                LinkedList_Cycle ll=new LinkedList_Cycle();
                ll.AddLast(1);
                ll.AddLast(2);
                ll.AddLast(3);
                ll.AddLast(4);
                ll.AddLast(5);
                ll.AddLast(6);
                ll.AddLast(7);
                ll.AddLast(8);
                ll.CreateCycle();
                ll.floyedCycleRemoval();
                ll.Display();

            }
    
}
