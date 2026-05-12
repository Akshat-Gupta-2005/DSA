import java.util.ArrayList;

public class Rec6 {
    public static void printSubsequence(int i , int [] arr , ArrayList<Integer> list){
        if (i == arr.length){
            System.out.println(list.toString());
            return;
        }

        list.add(arr[i]);
        printSubsequence(i+1, arr, list);
        list.remove(list.size()-1);
        printSubsequence(i+1, arr, list);

    }
    public static void main(String [] args){
        int [] arr = {3,1,2};
        ArrayList <Integer> list = new ArrayList<>(); 
        printSubsequence(0,arr,list);
    }
}
