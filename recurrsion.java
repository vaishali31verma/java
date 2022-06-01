package vishucoding;
public class recurrsion{

    static int factorial(int n){

        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_itrative(int n){

        if (n==0 || n==1){
            return 1;
        }
        else {
        int fac=1; 
        
        for (int i=1;i<=n;i++){
           fac*=i;
        
        }
         return fac;
        }
    }

    public static void main(String[] args) {
        // int n=6;
        // int fac=1; 
        
        // for (int i=1;i<=n;i++){
        //     fac*=i;
           

        // }
    // }
        // System.out.println(fac);
        int x = 8;
        System.out.println("the factorial is "+ factorial(x));
        System.out.println("the factorial is "+ factorial_itrative(x));
    }
}