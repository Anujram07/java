class car{


    void  name(){
        String c_name  = "jaguar";
        System.out.println(c_name);
    }

    void model(){
        String modlname = "BMW";
        System.out.println(modlname);
    }

    void price (){
        String pricee =  "1000000$";
        System.out.println(pricee);
    }
    public static void main(String[] args) {
        car c1 = new car();
        c1.name();
        c1.model();
        c1.price();   }
}
