class student{
    String sname ;
    int age;

    void setDetails(String name,int age){
        sname = name;
        age=age;
    }

    void display(){
        System.out.println("the name is :"+sname );
        System.out.println("the name is :"+age);
    }
}

public class studentDemo{
    public static void main(String [] args){
        student S1=new student();
        S1.setDetails("tigin",20);
        S1.display();
    }
}