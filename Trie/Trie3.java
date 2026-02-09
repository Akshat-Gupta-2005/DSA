
class Node{
    Node [] links = new Node[26];
    boolean flag = false;

    boolean containsKey(char ch){
        return (links[ch - 'a'] != null);
    }

    Node get(char ch){
        return links[ch - 'a'];
    }

    void put(char ch , Node node){
        links[ch - 'a'] = node;
    }

    void setFlag(){
        flag = true;
    }

    boolean getFlag(){
        return flag;
    }
}

public class Trie3 {
    public static Node root;

    Trie3(){
        root = new Node();
    }

    public static void insert(String word){
        Node temp = root;

        for(int i = 0 ; i< word.length() ; i++){
            if (!temp.containsKey(word.charAt(i))){
                temp.put(word.charAt(i), new Node());
            }

            temp = temp.get(word.charAt(i));
        }

        temp.setFlag();
    }

    public static boolean checkPrefix(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containsKey(word.charAt(i))){
                return false;
            }
            temp = temp.get(word.charAt(i));
            if (temp.getFlag() == false){
                return false;
            }
        }

        return true;
    }

    public static String completeString(int n, String [] arr){
        new Trie3();

        for(int i = 0 ; i < n ; i++ ){
            insert(arr[i]);
        }

        String longest = "";

        for (int i = 0 ; i < n ; i++){  
            if (checkPrefix(arr[i])){
                if (arr[i].length() > longest.length()){
                    longest = arr[i];
                }else if (arr[i].length() == longest.length() && arr[i].compareTo(longest)<0){
                    longest = arr[i];
                }
            }
        }
        
        return longest;
    }


    public static void main(String [] args){
        String [] words = {"a","ak", "aks","aksh" , "aksha" , "akshat" , "b" , "bc" , "bcdefgh" , "bcd" , "bcde" , "bcdef", "bcdefg"};

        System.out.println(completeString(words.length,words));
    }
}
