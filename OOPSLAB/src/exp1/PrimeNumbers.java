package exp1;
public class PrimeNumbers {
            public static void main(String[] args) {
        System.out.println("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n");

			int count = 0;
			int number = 2;
	
			System.out.println("The first 10 prime numbers are:");
			
			while (count < 10) {
				if (isPrime(number)) {
					System.out.print(number + " ");
					count++;
				}
				number++;
			}
		}
		public static boolean isPrime(int number) {
			if (number <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
        
	}

    
}
