class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;

    }
}
public class evenlinkedlist {
    public static void main(String[] args) {
        node head=new node(40);
        head.next=new node (1);
        head.next.next=new node (4);

        node temp=head;

        while (temp!=null){
            if (temp.data%2==0){

              System.out.println("even number :"  +temp.data);
              
              temp=temp.next;
 
            }
            else{
                System.out.println("odd :"+temp.data);
               temp=temp.next;
            }
 
        }
    }
}
