interface Client{
    void print();
    void show();
}

class Dev implements Client{
    public void print(){
        System.out.println("Bill");
    }

    public void show(){
        System.out.println("Biryaaaniii");
    }
}



public class inter {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
        obj.show();
    }
}
