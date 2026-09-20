class node{
    int data ;
    node next;
    node (int data){
        this.data= data;
        this.next=null;
    }
}
public class countlinkedlist{
    public static void main(String[] args) {
        
        node head=new node(10);
        head.next=new node(20);
        head.next.next= new node(30);

        node temp =head;
        int i = 0;
        while (temp !=null){
            System.out.println(temp.data);
            
            i++;
            temp=temp.next;


        }


        System.out.println("count is :"+ i );
        // int i= 0;
        // for (; temp!=null;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;

        // }

    }
}