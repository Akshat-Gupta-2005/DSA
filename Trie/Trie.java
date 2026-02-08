
class Node{
    Node links[] = new Node[26];
    boolean flag = false;

    public Node(){

    }

    boolean containgsKey(char ch){
        return (links[ch-'a'] != null);
    }

    Node get(char ch){
        return links[ch-'a'];
    }

    void put(char ch, Node node){
        links[ch-'a'] = node;
    }

    void setEnt(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

public class Trie{
    private static Node root;

    Trie(){
        root = new Node();
    }

    public static void insert(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containgsKey(word.charAt(i))){
                temp.put(word.charAt(i) , new Node());
            }
            temp = temp.get(word.charAt(i));
        }

        temp.setEnt();
    }

    public static boolean search(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containgsKey(word.charAt(i))){
                return false;
            }

            temp = temp.get(word.charAt(i));
        }

        if (temp.isEnd()){
            return true;
        }

        return false;
    }


    public static boolean startsWith(String word){
        Node temp = root;

        for (int i = 0 ; i < word.length() ; i++){
            if (!temp.containgsKey(word.charAt(i))){
                return  false;
            }
            temp =temp.get(word.charAt(i));
        }

        return true;

    }


    public static void main(String[] args){
        new Trie();

        insert("akshat");
        insert("aksha");
        insert("aksh");

        System.out.println(search("akshat"));
        System.out.println(search("aksh"));
        System.out.println(search("aksha"));
        System.out.println(search("akshatas"));
        System.out.println(startsWith("aks"));
    }
}