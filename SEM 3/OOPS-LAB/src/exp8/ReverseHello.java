package exp8;

public class ReverseHello {
	public static void main(String args[]) {
		System.out.println("DineshReddy -> urk23cs1263");
		createThread(1);
	}
	
	public static void createThread(int n) {
		if (n <= 50) {
			Thread t = new Thread(() -> createThread(n + 1));
			t.start();
			try {
				t.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hello - "+n);
		}
		return;
	}

}
