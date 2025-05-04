public class employee {
    void work(){
        System.out.println("corporate mazdoor kaam kar raha hai");
    }


}


class manager extends employee{
    void attendMeeting(){
        System.out.println("Manager meeting mai hai");
    }
}

public class Main {
    public static void main(String[] args) {
        manager m = new manager();
        m.work();
        m.attendMeeting();
    }
 }
