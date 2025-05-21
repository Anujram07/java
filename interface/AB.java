interface A{
    void display();
    }


interface B{
    void display();
}

class Demo implements A,B{
    public void display(){
        System.out.println("dispaying");
    }
    
}

public class AB{
    public static void main(String[] args) {
        Demo b1 = new Demo();
        b1.display();
    }
}


