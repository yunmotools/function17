// **Prime Number Checker**
//    Write a function taking `int` and returning if it's prime using a loop.

public class Main {
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false ;
        }
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                return false ;

            }
        }
        return true ;

    }

    public static void main(String[] args){
        System.out.println(isPrime(9)) ;


    }
}
