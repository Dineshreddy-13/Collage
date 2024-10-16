package exp8;

import java.util.Scanner;

public class MatrixOperation {
	public static void main(String args[]) {
        System.out.println("DineshReddy -> URK23CS1263");
		Scanner sc = new Scanner(System.in);
		int[][] num1 = new int[3][3];
		int[][] num2 = new int[3][3];
		System.out.println("enter matrix 1:");
		for(int i = 0; i< num1.length; i++) {
			for(int j = 0; j< num1.length; j++ ) {
				num1[i][j] = sc.nextInt();
			}
	}
		System.out.println("enter matrix 2:");
		for(int i = 0; i< num2.length; i++) {
			for(int j = 0; j< num2.length; j++ ) {
				num2[i][j] = sc.nextInt();
			}
		}
		
		Addition a = new Addition(num1, num2);
		Subtraction s = new Subtraction(num1, num2);
		Multiplication m = new Multiplication(num1,num2);

        try {
            a.start();
            a.join(); 
            
            s.start();
            s.join(); 
            
            m.start();
            m.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		sc.close();
}}

class Addition extends Thread {
	int[][] num1,num2;
    
    Addition(int[][] num1, int[][] num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void run() {
        System.out.println("<-- Addition -->");
        int[][] result = new int[3][3];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                result[i][j] = num1[i][j] + num2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Subtraction extends Thread{
	int[][] num1,num2;
	Subtraction(int num1[][], int num2[][]){
		this.num1 = num1;
		this.num2 = num2;
	}
    public void run() {
        System.out.println("<-- Subtraction -->");
        int[][] result = new int[3][3];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                result[i][j] = num1[i][j] - num2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class Multiplication extends Thread {
    int[][] num1,num2;
    
    Multiplication(int[][] num1, int[][] num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void run() {
        System.out.println("<-- Multiplication -->");
        int[][] result = new int[3][3];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                result[i][j] = 0; // Initialize the cell to zero
                for (int k = 0; k < num1.length; k++) {
                    result[i][j] += num1[i][k] * num2[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
