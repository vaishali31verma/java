package vishucoding;
public class practice_of_oops {
 public static void main(String[] args) {
     //problem 1
//  Employee harry = new Employee();
//  harry.set_name("code with harry");
//  System.out.println(harry.get_name());
//  harry.salary =32000;
//  System.out.println("my salary is "+ harry.get_salary());
// //  problem 2
//  cellphone asus = new cellphone();
//  asus.callfriend();
//  asus.vibrating();
//  asus.ringing();
// problem 3
// Square sq = new Square();
// sq.side = 3;
// System.out.println("area of square is :" +sq.Area());
// System.out.println("area of square is :" +sq.perimeter());
// problem 5
Tommy game= new Tommy();
game.fire();
game.hit();
game.run();

  }   
}
//problem1
// class Employee{
//     int salary;
//     String name;
   
//     public int get_salary(){
//         return salary;
//     }
   
//     public  String get_name() {
//         return name;
//        }
//     public  void set_name(String n){
//         name = n;  
//     }        
    
   
   
//    }
//    //problem 2
// class cellphone{
    


//     public void ringing(){
//         System.out.println("ringing.....");
//     }
//     public void vibrating(){
//         System.out.println("vibrating.....");
//     }
//     public void callfriend(){
//         System.out.println("calling_friend....");
//     }
// }
//problem 3 

// class Square{
//     int side;
//     public int Area(){
//         return side*side;
//     }

//     public int perimeter(){
//         return 4*side;
//     }
// }
// problem 5
class Tommy{
 public void hit(){
     System.out.println("hitting....");
 }
 public void run(){
    System.out.println("running....");

 }
 public void fire(){
    System.out.println("firing....");

 }

}
