public class LinkedList {
    public class Node{
        // It has two pointer head and tail
        // head-> Starting pointer(Address of 1st node)
        // tail-> end pointer(Address of last node)
        int val;
        Node next;
        // next ka type node hai bcz it contain the address of next node
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
                Node nn=new Node();
                nn.val=item;
                tail.next=nn;
                tail=nn; 
                size++;
            }
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
        public void ADDatIndex(int item,int K) throws Exception{
            if(K<0 || K>=size){
                throw new Exception("K is not in range");
            }
            if(K==0){
                AddFirst(item);
            }
            else if(K==size){
                AddLast(item);
            }
            else{
                Node nn=new Node();
                nn.val=item;
                Node k_1th =GetNode(K-1);
                Node kth = k_1th.next;
                k_1th.next=nn;
                nn.next=kth;
                size++;
                

            }

        }
        public int getFirst(){
            return head.val;
        }
        public int getLast(){
            return tail.val;
        }
        public int getatIndex(int K) throws Exception{
            if(K<0 || K>=size){
                throw new Exception("K is not in range");
            }
            return GetNode(K).val;
        }
        public int removeFirst() throws Exception{
            if(size==0){
                throw new Exception("Linkedlist is Empty");
            }
            int rv=head.val;
            if(size==1){
                head=null;
                tail=null;
                size--;
            }
            else{
                Node temp=head;
                head=head.next;
                temp.next=null;
                size--;
            }
            return rv;
        }
        public int removeLast() throws Exception{
            if(size==0){
                throw new Exception("Linkedlist is Empty");
            }
            if(size==1){
                return removeFirst();
            }
            else{
                int rv=tail.val;
                Node n=GetNode(size-2);
                tail=n;
                tail.next=null;
                size--;
                return rv;
            }
        }
        public int removeatIndex(int  k) throws Exception
    {
        if(size==0){
            throw new Exception("Linkedlist is Empty");
        }
        if(size==1){
            return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node K_1th=GetNode(k-1);
            Node Kth=K_1th.next;
            K_1th.next=Kth.next;
            Kth.next=null;
            size--;
            return Kth.val;

        }
    }
    
    public static void main(String[] args) throws Exception{
        LinkedList ll=new LinkedList();
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(5);
        ll.AddFirst(7);
        ll.AddFirst(1);
        ll.Display();
        ll.AddLast(34);
        ll.Display();
        ll.ADDatIndex(9, 0);
        ll.Display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getatIndex(2));
        System.out.println(ll.removeFirst());
        ll.Display();
        System.out.println(ll.removeLast());
        ll.Display();1` 

    }
}
