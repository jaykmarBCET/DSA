package dsa;
class Array{
    int capacity=-1;
    int lastIndex =-1;
    public int getCapacity(){
        return capacity;
    }
    Array(int capacity){
        this.capacity = capacity;
    }
    boolean isFull(){
        return lastIndex == capacity-1;
    }
    boolean isEmpty(){
        return lastIndex ==-1;
    }
   class Node{
       int data;
       Node next;

       Node(int data){
           this.data = data;
           next = null;
       }
   }
   Node head = null;
    // add data in array
   public void addFirst(int data) throws Exception{
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            lastIndex++;
            return;
        }
        if(isFull()){
            throw new Exception("ArrayOutOfBound");
        }
        newNode.next = head;
        head= newNode;
        lastIndex++;
   }
   int size(){
       return lastIndex;
   }
   void add(int data) throws Exception{
       try{
          addLast(data);
       }catch(Exception e){
           throw new Exception(e.getMessage());
       }
   }
   void add(int index , int data) throws  Exception{
       if(index >= capacity || index <=-1){
           throw new Exception("Invilid Array Index");
       }
       Node newNode = new Node(data);
       if(index==0){
           addFirst(data);
           return;
       }
       if(index ==lastIndex){
           addLast(data);
           return;
       }
       Node temp = head;
       Node temp1 = head.next;
       while(index!=1){
          temp = temp.next;
          temp1 = temp1.next;
          index--;
       }
       newNode.next = temp1;
       temp.next = newNode;
       lastIndex++;
   }
   public void addLast(int data) throws Exception{
       if(isFull()){
           throw  new ArrayIndexOutOfBoundsException("ArrayOutOfBound");
       }
       if(isEmpty()){
           addFirst(data);
       }
       Node lastNode = head.next;
       Node secondLast = head;

       while(lastNode!=null){
           lastNode = lastNode.next;
           secondLast = secondLast.next;
       }

       secondLast.next = new Node(data);
       lastIndex++;
   }
   // delete data in array

    int deleteFirst() throws Exception{
       if(isEmpty()){
           throw new Exception("null pointer");
       }
       int data = head.data;
       head = head.next;
       lastIndex--;
       return data;
    }
    int deleteLast() throws Exception {
       if(isEmpty()){
           throw new Exception("null pointer");
       }
       if(head.next==null){
           return deleteFirst();
       }

       Node temp2 = head;
       Node temp1 = head.next.next;

       while(temp1!=null){
           temp1 = temp1.next;
           temp2 = temp2.next;
       }
       int data = temp2.next.data;
       temp2.next = null;
       temp2 = temp2.next;
       lastIndex--;
       return  data;
    }

    int delete()throws Exception{
       int data = deleteLast();
       return data;
    }

    int delete(int position)throws Exception{
       if(position > lastIndex || position <0){
           throw new Exception("Invilid index");
       }
       if(position==0){
           int data = deleteFirst();
           return data;
       }
       if(position ==lastIndex){
           int data = deleteLast();
           return data;
       }


       Node temp1 = head;
       Node temp2= head.next;
       while (position!=1){
           temp1  = temp1.next;
           temp2 = temp2.next;
           position--;
       }

       int data = temp2.next.data;
       temp1.next = temp2.next.next;
       return data;

    }

   public void view(){
       if(isEmpty()){
           return;
       }

       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }

       System.out.println("null");
   }

}
public class OwnArray {

    public static void main(String[] args) {
        Array arr = new Array(10);
        try {
            arr.add(56);
            arr.addLast(57);
            arr.addFirst(55);
            arr.addLast(58);
            System.out.println();
           int data =  arr.delete(1);
           int dat1 = arr.delete(2);

            System.out.println(data);
            System.out.println(dat1);
            arr.view();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
