
class Node{
    Node [] links = new Node[26];
    int cp = 0;
    int ew = 0;

    Node(){

    }

    boolean containsKey(char ch){
        return (links[ch-'a'] != null);
    }

    Node get(char ch){
        return links[ch - 'a'];
    }

    void put(char ch , Node node){
        links[ch-'a'] = node;
    }

    void iCP(){
        cp++;
    }

    void iEW(){
        ew++;
    }

    void dCP(){
        cp--;
    }

    void dEW(){
        ew--;
    }

    int rCP(){
        return cp;
    }
    int rEW(){
        return ew;
    }
}

public class Trie2 {
    private static Node root;

    Trie2(){
        root = new Node();
    }

    public static void insert(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containsKey(word.charAt(i))){
                temp.put(word.charAt(i), new Node());
            }

            temp = temp.get(word.charAt(i));
            temp.iCP();
        }

        temp.iEW();
    }

    public static int countWordsEqualTo(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containsKey(word.charAt(i))){
                return 0;
            }

            temp = temp.get(word.charAt(i));
        }   

        return temp.rEW();
    }

    public static int countWordsStartingWith(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containsKey(word.charAt(i))){
                return 0;
            }

            temp = temp.get(word.charAt(i));
        }   

        return temp.rCP();
    }

    public static void erase(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containsKey(word.charAt(i))){
                return;
            }
            temp = temp.get(word.charAt(i));
            temp.dCP();
        }

        temp.dEW();
    }

    public static void main(String [] args){
        new Trie2();

        insert("akshat");
        insert("akshat");
        insert("akshat");
        insert("aksh");

        System.out.println(countWordsStartingWith("aksh"));
        System.out.println(countWordsEqualTo("aksh"));
        System.out.println(countWordsEqualTo("akshat"));
    }


}
