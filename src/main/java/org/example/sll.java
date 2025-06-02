package org.example;

class Node{
    int data;
    Node next;
    Node(int data,Node naxt){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
    }
    Node(){}
}
class sll{
    Node head,tail;
    void addtohead(int el){
        Node new_Node=new Node(el );
        if(head==null){tail=head=new_Node;}
        else{
            new_Node.next=head;
            head=new_Node;
        }
    }
    void addtotail(int el){
        Node new_Node=new Node(el );
        if((tail==null)&&(head==null)){tail=head=new_Node;}
        else{

            tail.next=new_Node;
            tail=new_Node;
        }
    }
    void show(){
        if(head!=null) {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.data + " ,");
                cur = cur.next;
            }
        }
    }
    void deletefromhead(){
        if(head==tail){
            tail=head=null;
        }
        else if((head==null)&&(tail==null)){
            System.out.println("nothing");
        }
        else{

            head=head.next;

        }
    }
    void deletenode(int el){
        if(isexist(el)) {
            if ((head == null) && (tail == null)) {
                System.out.println("nothing");
            } else {
                Node n = new Node(el);
                Node cur = head;
                while (cur.next.data != n.data) {
                    cur = cur.next;
                }
                cur.next = cur.next.next;
            }
        }
    }
    boolean isexist(int el){
        boolean b=false;
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur.data==el)
                return !b;
        }
        return b;
    }
    void isertafter(int el,int index){
        int count=0;
        Node cur;
        for(cur=head;cur!=null;cur=cur.next){
            count++;
            if(count==index){
                break;
            }
        }
        Node n=new Node(el);
        n.next=cur.next;
        cur.next=n;
    }

}
class main{
    public static void main(String[]args){
        sll s=new sll();
        s.addtohead(3);
        s.addtohead(2);
        s.addtotail(4);
        s.addtotail(6);
        s.show();
        System.out.println();

        s.show();
        System.out.println();
        s.isertafter(7,3);
        s.show();
        System.out.println();

    }
}