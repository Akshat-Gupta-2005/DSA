
class Node{
    Node [] links = new Node[2];

    boolean containsKey(int n){
        return (links[n] != null);
    }

    Node get(int n){
        return links[n];
    }

    void put(int n , Node node){
        links[n] = node;
    }

}

public class Trie5 {
    public static Node root;

    Trie5(){
        root = new Node();
    }

    public static void insert(int num){
        Node temp = root;

        for (int i = 31 ; i>=0 ; i--){
            int bit = (num>>i) & 1;

            if (!temp.containsKey(bit)){
                temp.put(bit, new Node());
            }

            temp = temp.get(bit);
        }
    }

    public static int getMaxXOR(int n){
        Node temp = root;
        int num = 0;

        for (int i = 31 ; i >= 0 ;i--){
            int bit = (n>>i) & 1;

            if (temp.containsKey(1-bit)){
                num = num | (1-bit)<<i;
                temp = temp.get(1-bit);
            }else{
                temp = temp.get(bit);
            }
        }

        return num;
    }

    public static void main(String [] args){
        new Trie5();
        int [] nums = {9,8,7,5,4};

        for (int i = 0 ; i < nums.length; i++){
            insert(nums[i]);
        }

        System.out.println(getMaxXOR(8));
    }

}
