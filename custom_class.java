package vishucoding;
public class custom_class {

    public static void main(String[] args) {
       System.out.println("this is our custom class");
        Employee harry= new Employee(); //intanting a new employee object
        Employee john= new Employee(); 
        harry.id = 12;
        harry.name= "code with harry";
        harry.salary= 35;
        john.id = 13;
        john.name= "mera naam john haii";
        john.salary=34;
        int payment =john.get_salary();
        System.out.println("my salary is :" + payment);
        harry.print_Detail();
        john.print_Detail();
   
    }
    
}
class Employee{
    int id ;
    String name;
    int salary;


    public void print_Detail(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
    public int get_salary() {
        return salary;
        
    }    
     
}
