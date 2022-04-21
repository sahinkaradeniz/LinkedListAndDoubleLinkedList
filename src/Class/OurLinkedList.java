package Class;

public class OurLinkedList<T> {
    Node headNode;

    public OurLinkedList(){
        headNode=null;
    }

    public void add(Object val){
      Node newNode=new Node(val,null); // Olusturulan yeni Class.Node'un değeri alınır ve Next kısmına null değer atanır.
        if(headNode==null){  // ilk node olabileceğine karşın kontrol yapılır eğer öyleyse Next kısmı null olarak kalır ve bir sonraki node'nun next kısmının göstermesi için headNode içerisinde saklanır.
            headNode=newNode;
        }
        else{     // Eğer next değeri null değilse ilk node olmadığı anlaşılıp next kısmına bir önceki node değeri eklenir ve yeni node'nın değeri bir sonraki node'un next kısmına atılmak için saklanır.
            newNode.next=headNode;
            headNode=newNode;
        }
    }
    public void delete(){
        headNode=headNode.next; // HeadNode'u yapımızın liderlik eden kısmıydı onun içerisine next değerini atarak yok ediyoruz.
    }

    public void display(){
       Node n= headNode;
        while(n!=null){
            System.out.println((T)n.value);
            n=n.next;
        }
    }
}
