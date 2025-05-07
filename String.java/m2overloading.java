class area{
    void area(int a){
        System.out.println("Area of Square:-"+a*a);
    }


    void area(int l,int b){
        System.out.println("Area of retangle:-"+l*b);
    }

    void area(int r, double  p){
         System.out.println("Area of circle:-"+p*r*r);
    }
}







public class m2overloading {
    public static void main(String[] args) {
        area obj=new area();
        obj.area(7);
        obj.area(7,6);
        obj.area(5,3.14);
            }
}
