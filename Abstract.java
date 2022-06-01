package vishucoding;
public class Abstract {
  public static void main(String[] args) {

      
  }  
}
abstract class parent{
    public parent(){
        System.out.println("main base ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
        class child1 extends parent{
        @Override
        public void greet(){
            System.out.println("good morning");
        }
    }
}
}