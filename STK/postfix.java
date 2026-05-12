import java.util.*;
class postfix{

    public static int precedence(char ch){
        switch (ch) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            default:
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();

        StringBuilder postfix = new StringBuilder();

        Stack<Character> stk = new Stack<>();

        for (char ch: infix.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }else if (ch=='('){
                stk.push(ch);
            }else if(ch==')'){
                while(!stk.isEmpty() && stk.peek() != '('){
                    postfix.append(stk.pop());
                }
                stk.pop();
            }else{
                while(!stk.isEmpty() && precedence(stk.peek()) >= precedence(ch)){
                    postfix.append(stk.pop());
                }
                stk.push(ch);
            }
        }

        while(!stk.isEmpty()){
            postfix.append(stk.pop());
        }

        System.out.println(postfix.toString());
    }
}