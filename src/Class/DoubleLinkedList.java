package Class;

public class DoubleLinkedList<T> {
    NodeDouble headNode;

    public DoubleLinkedList(){
        headNode=null;
    }

    public void add(Object val){
        NodeDouble newNode = new NodeDouble(val,null,null);
        if(headNode==null){  // // Olusturulan yeni Class.Node'un değeri alınır ve Next ve previous kısmına null değer atanır. Çünkü henüz işaret edeceği bir node yoktur.
            headNode=newNode;
        }
        else{// yeni node'un next kısmı bir önceki node işaret edecek.
            newNode.next=headNode;
            headNode.previous=newNode; // Bir önceki node'un previus kısmı yeni node'u işaret edecek.
            headNode=newNode; // Yeni oluşan node artık baş kısmımız olacak.
        }
    }
    public void delete(){
        headNode=headNode.next;
        headNode.previous=null;
    }

    public void display(){
        NodeDouble n= headNode;
        while(n!=null){
            System.out.println((T)n.value);
            n=n.next;
        }
    }
}
