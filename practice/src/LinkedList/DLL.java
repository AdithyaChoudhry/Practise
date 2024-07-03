package LinkedList;

public class DLL {

    Node head;

   public void insertfirst(int val){
       Node node = new Node(val);
       node.next=head;
       node.prev=null;
       if(head!=null){
           head.prev=node;
       }
       head=node;
   }

   public void insertlast(int val){
       Node node = new Node(val);
       Node last = head;
       node.next=null;
       if(head==null){
           node.prev=null;
           head=node;
           return;
       }

       while(last!=null){
           last=last.next;
       }
       last.next=node;
       node.prev=last;
   }

   public void display(){
       Node node = head;
       while (node!=null){
           System.out.println(node.value+"->");
           node=node.next;
       }
   }

   public Node find(int val){
       Node node=head;
       while(node!=null){
           if(node.value==val){
               return node;
           }
           node =node.next;
       }
       return null;
   }


   public void insertaft(int aft , int val) {
       Node p = find(val);

       if(p==null){
           System.out.println("not exist");
           return;
       }

       Node node = new Node(val);
       node.next=p.next;
       p.next=node;
       node.prev=p;
       if(node.next==null){
           node.next.prev=node;
       }

   }
   public void displayrev(){
       Node node = head;
       Node last = null;
//       while (node!=null){
//           System.out.println(node.value+"->");
//           last=node;
//           node=node.next;
//       }

       while(last!=null){
           System.out.println(last.value+"->");
           last=last.prev;
       }
   }

   private class Node{
       private int value;
       private Node next;
       private Node prev;

       public Node(int val , Node next ,Node prev){
           this.next=next;
           this.prev=prev;
           this.value=val;
       }

       public Node(int value){
           this.value=value;
       }
   }
}
