public class Student1 {

        int a;
     Student1(int a) {
            this.a=a;
      }
    void sum(){
        System.out.println(a);
    }
        
}

class Student{
    public static void main(String[] args) {
        Student1 obj  = new Student1(20);
        System.out.println(obj);
        obj.sum();
    }

}