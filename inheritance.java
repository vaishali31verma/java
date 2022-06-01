package vishucoding;
public class inheritance {
    public static void main(String[] args) {
        // Base b=new Base();
        // b.setX(4);
        // System.out.println(" the value of x is "+b.getX());
        derived d = new derived();
        d.setk(34);
        d.setX(90);
        System.out.println(d.getk());
        System.out.println(d.getX());
    }
}
class Base{
    int x;
    public int getX(){ 
        
        return x;
    }
    public void setX(int y){
        x=y;
    }
}

class derived extends Base{
    int k;
    public int getk(){ 
        
        return k;
    }
    public void setk(int y){
        k=y;
    }

}