package Problems;

import java.util.Stack;
public class InfixToPostfix {
    String exp;
    Stack <Character> stack,result;
    InfixToPostfix(String exp){
        this.exp = exp;
        stack = new Stack<>(); 
        result = new Stack<>();
    }

    public int precedence(char c){
        if (c == '^'){
            return 3;
        }
        else if (c == '*' || c == '/'){
            return 2;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }else{
            return -1;
        }
    }

    public char associativity(char c){
        if (c == '^'){
            return 'R';
        }
        return 'L';
    }

    public void postfix(){
        for (int i = 0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result.push(c);
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while( stack.peek() != '(' ){
                    result.push(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && ((precedence(c) < precedence(stack.peek()) ) || (precedence(c) == precedence(stack.peek()) && associativity(c) == 'L'))){
                    result.push(stack.pop());
                }                
                stack.push(c);
            } 
        }
        while(!stack.isEmpty()){
            result.push(stack.pop());
        }
        System.out.println("element : "+  result);
    }

    public static void main(String args[]){
        InfixToPostfix a = new InfixToPostfix("A+B*(C-D/E)-F");
        a.postfix();
        // PostfixEvaluation b = new PostfixEvaluation("23*");
        // System.out.println(b.evaluate());

    }

}






