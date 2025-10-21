class employee{
    String name ;
    int id ;

    //constructor

    employee (String ename,int eid){
        name = ename;
        id=eid;
    }
    void show(){
        System.out.println(" the employee id is :"+id+  "   and the employee name is : "+name);
    }




}


public class object {
    public static void main (String [] args){
        employee e = new employee("advaith",24);
        e.show();

    }

}
