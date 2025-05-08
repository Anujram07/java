abstract class shape{
    abstract void area(int a,int b);
   // abstract void area1 (int a,int b);
    void print(){
        System.out.println("AREA");
    }
}
class circle extends shape{
    void area(int a,int b){
       System.out.println("circle = "+3.14*a*a);
    }
}

class rectangle  extends shape{
    void area(int a,int b){
        System.out.println("rectangle = "+a*b);
    }
}
public class shapes {
    public static void main(String[] args) {
        shape obj = new circle() ;
        obj.print();
      //  obj.area(4);
        shape obj1 = new rectangle();
        obj.area(5,4);
        
            
        
    }
}
