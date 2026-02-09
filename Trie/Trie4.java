
class Node{
    Node [] links = new Node[26];
    boolean flag = false;

    boolean containsKey(char ch){
        return (links[ch-'a'] != null);
    }

    Node get(char ch){
        return links[ch-'a'];
    }

    void put(char ch , Node node){
        links[ch-'a'] = node;
    }

    boolean getFlag(){
        return flag;
    }

    public void setFlag() {
        this.flag = true;
    }
}

public class Trie4 {
    public static Node root;

    Trie4(){
        root = new Node();
    }

    public static int distinctSubstrings(String word){
        int count = 0;

        for (int j = 0 ; j < word.length() ;j++){

            Node temp = root;
            
            for (int i = j ; i < word.length() ; i++){
                if (!temp.containsKey(word.charAt(i))){
                    temp.put(word.charAt(i), new Node());
                    count++;
                }
                
                temp = temp.get(word.charAt(i));
            }
        }
            
        return count+1;
    }

    public static void main(String [] args){
        new Trie4();

        System.out.println(distinctSubstrings("abab"));
    }
    
}
