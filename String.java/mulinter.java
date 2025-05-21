// multiple inheritence using interface
interface client1{
    void show();
}

interface client2{
    void show();
    void print();
}

class hello implements client1,client2{
    public void show(){
        System.out.println("for both ");
    }
    public void print(){
        System.out.println("for tommorow");
    }
}

public class mulinter{
    public static void main(String[] args) {
        hello b1 = new hello();
        b1.show();
        b1.print();
    }
}