interface animal1{
    void makesound();
}

class Dog implements animal1{
    public void makesound(){
        System.out.println("bark");
    }
    
}

public class animal{
    public static void main(String[] args) {
        Dog b1 = new Dog();
        b1.makesound();
    }
}


