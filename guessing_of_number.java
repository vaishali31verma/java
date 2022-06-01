package vishucoding;
import java.util.Random;
import java.util.Scanner;


public class guessing_of_number {
    public static void main(String[] args) {
    Game G=new Game();
    boolean b = false;
    while(!b){
    G.takeUserinput();
    b= G.is_correct_number();
    System.out.println(b);
    }
    }
}
class Game{
    public int number;
    public int inputnumber;
    public int no_of_guesses;
    
    public int get_no_of_guesses(){
        return no_of_guesses;
    }
    public void set_no_of_guesses(int G){
        G=no_of_guesses;
    }
    Game(){
        Random rand =new Random();
        this.number=rand.nextInt(100);

    }
    void takeUserinput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
        

    }
    boolean is_correct_number(){
        if (inputnumber==number){
            System.out.println("yoo u r winner u able to guess the number");
            return true;
        }
        else if(inputnumber<number){
            System.out.println("too low");
            return false;
        }     
        else if(inputnumber>number){
            System.out.println("too high...");
            return false;}
              return false;
    }
}