package vishucoding;
public class getter_and_setter {
    public static void main(String[] args) {
        // circle radius = new circle();
        // radius.set_radius(3);
        // System.out.println("radius of circle"+radius.get_radius());
        // circle area = new circle();
        // area.set_area(3);
        // System.out.println("Area of circle"+area.get_area());
        circle radius = new circle(4);
        System.out.println("radius of circle "+ radius.get_radius());
        System.out.println("Area of circle"+radius.get_area());


      
    }
}
class circle{
  private int r;
  
  public circle(int r){
    this.r=r;
  

  }
  



  public void set_radius(int R){
      r = R;
      
  }
  public int get_radius() {
    return r;
      
  }
  public void set_area(int A){
    r = A;
    
}
public double get_area() {
  return 3.14*r*r;
    
}
 
}