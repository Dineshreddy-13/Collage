package exp7;
import java.util.Scanner;

public class Student {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("DineshReddy -> urk23cs1263");
        System.out.println("enter student name : ");
        try{
            if(sc.nextLine().length() > 7){
                throw new LengthException("length exceeded");
            }
        }catch(LengthException e){
            System.out.println(e);
        }
        System.out.println("enter the marks of three subjects : ");
        float avg = (sc.nextInt() + sc.nextInt() + sc.nextInt())/3;
        try{
            if (avg < 50){
                throw new FailedException("failed");
            }
            else if(avg>50 && avg<75){
                throw new NotFirstClassExecption("not a first class");
            }
            else if(avg>75){
                throw new FirstClassException("first class");
            }
        }catch(FailedException | NotFirstClassExecption | FirstClassException e){
            System.out.println(e);
        }

        sc.close();
    }
}

class LengthException extends Exception{
    
    public LengthException(String msg){
        super(msg);
    }

}

class FailedException extends Exception{
    public FailedException(String msg){
        super(msg);
    }
}

class NotFirstClassExecption extends Exception{
    public NotFirstClassExecption(String msg){
        super(msg);
    }
}

class FirstClassException extends Exception{
    public FirstClassException(String msg){
        super(msg);
    }
}
