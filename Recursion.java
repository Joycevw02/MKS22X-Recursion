public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return help(n,5.5,tolerance);
    }
    private static double sqrthelp(double n, double guess, double tolerance){
      //If guess squared is less than 1.000001 times n, return guess
      if ((n *(1 + (tolerance / 100))) > (guess * guess)){
        return guess;
      }
      //Else, return help with n and a modified guess value
      else{
        return help(n,(( n / guess + guess) / 2),tolerance);
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 1;
    }
    private static int fibhelp(int n, int num){
      
    }
    /*As Per classwork*/
    public static Arraylist<Integer> makeAllSums(){
    }

}
