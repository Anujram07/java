class Student{
    void fullname(){
    String firstName="ANUJ";
    String secondName ="RAMRAIKA";
    System.out.println(firstName+" "+secondName);
}


void rollNumber(){
    String rollno = "0246cs231047";
    System.out.println("Roll Number:-"+rollno);
}


void marks(){
    int  mark = 98;
    System.out.println("Marks="+mark);
}

}




public class object {
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.fullname();
      s1.rollNumber();
      s1.marks();

}
}