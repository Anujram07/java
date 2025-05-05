class Student{
    String name = "rahul";
    int age = 14;
Student(String name, int age){
 
        name = name ;
        age = age ;
        System.out.println(name+age );
}


void eat(){
    System.out.println("i eat");
}


 
}

public class cons {
    public static void main(String[] args) {
        Student obj = new Student("sharma", 17);

       obj.eat();
    
    }
}
