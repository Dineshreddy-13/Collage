package Problems;
import java.util.Stack;

public class PostfixEvaluation{
    Stack<Integer> stack;
    String exp;
    PostfixEvaluation(String exp){
        stack = new Stack<>();
        this.exp = exp;
    }

    public int evaluate(){
        for(int i = 0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if (Character.isDigit(c)){
                int num = c - '0';
                stack.push(num);
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();

                switch(c){
                    case '+' -> stack.push(num1 + num2);
                    case '-' -> stack.push(num1 - num2);
                    case '*' -> stack.push(num1 * num2);
                    case '/' -> stack.push(num1 / num2);
                    case '^' -> stack.push((int)Math.pow(num1, num2));
                }
            }
        }
        return stack.pop();
    }

    public static void main (String args[]){
        PostfixEvaluation p = new PostfixEvaluation("23*");
        System.out.println(p.evaluate());
    }

}
