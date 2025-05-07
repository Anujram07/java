class parent{
      void sum(int a , int b ){
        System.out.println(a+b);
    }

    void sum(int a , int b , int c ){
        System.out.println(a+b+c);
    }
    
}

public class moverloading {
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.sum(5,5,1);
    }
}
