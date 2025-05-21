interface walkable{
    void walk();
    }


interface runnable{
    void runn();
}

class human implements walkable,runnable{
    public void walk(){
        System.out.println("walking");
    }
    public void runn(){
        System.out.println("running");
    }
}

public class runner{
    public static void main(String[] args) {
        human b1 = new human();
        b1.walk();
        b1.runn();
    }
}


   

