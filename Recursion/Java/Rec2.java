
public class Rec2{
    static int count = 0;
    public static void print5Times(String s){
        if (count<5){
            System.out.println(s);
            count++;
            print5Times(s);
        }
    }

    public static void printNTimes(String s , int n){
        if (n == 0){
            return ;
        }

        System.out.println(s);
        printNTimes(s, n-1);
    }

    public static void print1toN(int i , int n){
        if (i == n){
            return;
        }

        System.out.println(i+1);
        print1toN(i+1, n);
    }

    public static void printNto1(int i){
        if (i<=0){
            return;
        }

        System.out.println(i);
        printNto1(i-1);
    }

    public static void print1toNBacktrack(int n){
        if (n<=0){
            return;
        }
        print1toNBacktrack(n-1);
        System.out.println(n);
    }

    public static void printNto1Backtrack(int i ,int n){
        if (i >= n){
            return;
        }

        printNto1Backtrack(i+1,n);
        System.out.println(i+1);
    }

    public static void main(String [] args){
        // printNTimes("Akshat",10);
        // print1toN(0, 5);
        // printNto1(5);
        // print1toNBacktrack(5);
        // printNto1Backtrack(0,6);
    }
} 