public class main2 {



    void sum(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        main2 obj = new main2();
        System.out.println(obj);
        obj.sum();
    }




}
