import java.util.*;
public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrthelp(n,5.5,tolerance);
    }
    private static double sqrthelp(double n, double guess, double tolerance){
      //If guess squared is less than 1.000001 times n, return guess
      if ((n *(1 + (tolerance / 100))) > (guess * guess)){
        return guess;
      }
      //Else, return help with n and a modified guess value
      else{
        return sqrthelp(n,(( n / guess + guess) / 2),tolerance);
      }
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibhelp(n,0,1);
    }
    private static int fibhelp(int n, int ans, int prev){
      //If n is 0, return ans
      if (n == 0){
        return ans;
      }
      //Else, return the fib help of n - 1 (counting down), the ans plus the
      //previous (for the new ans for the next term), and the current answer as
      //the new previous answer
      else{
        return fibhelp(n - 1, ans + prev, ans);
      }
    }
    /*As Per classwork*/
   public static ArrayList<Integer> makeAllSums(int n){
     ArrayList<Integer> ans = new ArrayList<Integer>();
     //If n is positive or 0, call the helper function for positive numbers
     if (n >= 0){
       sumHelperPositve(n,0,ans);
     }
     //If n is negative, call the helper function for negative numbers
     else{
       sumHelperNegative(n,0,ans);
     }
     return ans;
   }
   //Helper functions edit the array list
   private static void sumHelperPositve(int n,int sum,ArrayList<Integer> list){
    //Base if : if n is 0, the sum is the greatest it will ever be for this run,
    //so you add it to the list
    if (n == 0){
      list.add(sum);
    }
    //Else, call the function twice, once adding the number and once not
    else{
      sumHelperPositve(n - 1, sum + n,list);
      sumHelperPositve(n - 1, sum, list);
    }
   }
   private static void sumHelperNegative(int n,int sum,ArrayList<Integer> list){
     //Base if : if n is 0, the sum is the least it will ever be for this run,
     //so you add it to the list
    if (n == 0){
      list.add(-sum);
    }
    //Else, call the function twice, once subtracting the value (same as adding
    //a negative) and once not doing anything
    else{
      sumHelperNegative(n + 1, sum - n,list);
      sumHelperNegative(n + 1, sum, list);
    }
   }
   public static void main(String[] args){
      //System.out.println(sqrt(4.0,0.001));
      //System.out.println(fib(0));
      //System.out.println(fib(1));
      //System.out.println(fib(2));
      //System.out.println(fib(3));
      //System.out.println(fib(4));
      //System.out.println(fib(5));
      //System.out.println(fib(6));
      //System.out.println(fib(7));
      //System.out.println(fib(8));
      //System.out.println(fib(9));
      //System.out.println(fib(10));
      //System.out.println(makeAllSums(3));
      //System.out.println(makeAllSums(-3));
    }

}
