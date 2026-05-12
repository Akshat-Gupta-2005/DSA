public class Rec3 {
    public static int sumNNumbersFunctional(int n){
        if (n == 0) return 0;
        return n + sumNNumbersFunctional(n-1);
    }
    
    public static void sumNNumbersParameterised(int n , int sum){
        if (n == 0){
            System.out.println(sum);
            return ;
        }

        sumNNumbersParameterised(n-1, sum +n);
    } 

    public static void main(String [] args){
        System.out.println(sumNNumbersFunctional(5));
        sumNNumbersParameterised( 6 , 0);
    }
}
