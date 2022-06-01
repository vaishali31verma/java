package vishucoding;
public class constructor {
   public static void main(String[] args) {
      //  myemployee vishu = new myemployee();
      //  vishu.set_id(5);
      //  System.out.println(vishu.getid());
      //  vishu.set_name("vaishali");
      //   System.out.println(vishu.getname());
    // constructor
    myemployee vishu = new myemployee("karan",7);
    System.out.println(vishu.getid());
    System.out.println(vishu.getname());

      

   } 
}
class myemployee{

 
  
  private int id;
  private String name;
  //  // constructor method 1
  //  public myemployee(){
  //    id=45;
  //    name ="vaishali";

  //  }
  //  // constructor method 2
  public myemployee(String myname, int idd){
    id = idd;
    name = myname;
  }
  



  public String getname(){return name;}
  public void set_name(String n){name=n;}
  public int getid(){return id;}
  public void set_id(int s){id=s;}



}