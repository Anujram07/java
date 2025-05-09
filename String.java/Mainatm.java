class atm{
    private int a;
    public void setmoney(int a){
        this.a=a; 
    }
    
    public int getmoney(){
        return a;
    }
}
public class Mainatm {
    public static void main(String[] args) {
        atm c1 = new atm();
        c1.setmoney(5000);
       System.out.println(c1.getmoney()); 
    }
}
