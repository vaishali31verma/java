package vishucoding;
public class fiboonacci {
    static int fibbonacci_series(int count){ 
    if(count<=0){
        return count;
    }
    else {
        return fibbonacci_series(count-1)+fibbonacci_series(count+1);

            }
    
    }  
        
        
        

    
    public static void main(String[] args) {
        int x=4;
        System.out.println(fibbonacci_series(x));
        
    }
    
}

