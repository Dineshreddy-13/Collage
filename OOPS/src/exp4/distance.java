package exp4;

public class distance {
	
	public float feet,inches;
	
	distance(){
		feet = 0;
		inches = 0;
	}
	distance(float f, float i){
		feet = f;
		inches = i;
	}
	
	public void Display() {
		System.out.printf("Distance : %.2f",feet + inches);
	}
	
	public static distance add(distance a, distance b) {
		return new distance(a.feet+b.feet,a.inches+b.inches);
		
	}
	
	public static void main(String args[]) {
		distance d1 = new distance(10,20);
		distance d2 = new distance(10,20);
		distance d3 = add(d1, d2);
		d3.Display();	
	}
}
