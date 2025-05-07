class parent {
    void  eat(){
        System.out.println("poha");
    }
}
class child extends parent{
    void eat(){
        System.out.println("jalebi");
       
    }
}

public class overriding {
    public static void main(String[] args) {
        parent obj = new child();
        obj.eat();
    }
}

