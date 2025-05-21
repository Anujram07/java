class employee{
    private int id;
    private int  salary;
    private String name;
    public void setname(String name){
       this.name = name;
    }

    public void setsalary(int salary){
        this.salary=salary;
    }
    public void setid(int id){
        this.id=id;
    }



    public void  getname(){
        System.out.println(name);
    }

    public void getsalary(){
        System.out.println(salary);
    }
    public void getid(){
        System.out.println(id);
    }
public class mainemoloyee {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setname("maharana");
        e1.setid(21554565);
        e1.setsalary(63466);
        e1.getid();
        e1.getname();
        e1.getsalary();
    }

}
}