public class main3 {
    main3(){
        System.out.println("mai hoon na!!!");
    }

    main3(int a){
        System.out.println(a);
        
    }

    main3(int a,int b){
        this(5);
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        main3 obj = new main3(7,5);
    }
}
