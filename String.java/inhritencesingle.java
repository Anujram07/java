class animal{
    void eat(){
        System.out.println("Eating");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("bow bow");
    }
}

class puppy extends dog{
    void cute(){
        System.out.println("cutieeee");
    }
}




public class inhritencesingle {
    public static void main(String[] args) {
        puppy obj = new puppy();
        obj.eat();
        obj.bark();
        obj.cute();

    }
}
