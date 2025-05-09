class student{
    private String name;
    private int  marks;
    public void setname(String name){
       this.name = name;
    }

    public void setmarks(int marks){
        this.marks=marks;
    }

    public void  getname(){
        System.out.println(name);
    }

    public void getmarks(){
        System.out.println(marks);
    }
    

}

public class mainstudent {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setname("anuj");
        s1.setmarks(450);
        s1.getname();
        s1.getmarks();
    }
}
