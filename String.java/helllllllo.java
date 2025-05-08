abstract class Payment{
    abstract void pay(int a);
    void print(){
        System.out.println("pay");
    }
}


class UpiPayment extends Payment{
void pay(int a){
    System.out.println("payment done via  upi"+a);
}




}



public class helllllllo {
    public static void main(String[] args) {
        Payment obj = new UpiPayment(); 
            obj.pay(5000);
            obj.print();
    }
}
