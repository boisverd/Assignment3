import java.util.Scanner;

public class warmup4 {

	public static void main(String[] args) {
		int size=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter size of random array: ");
		size = input.nextInt();
		double randArray[] = new double[size];
		int maxRandom=5;
		double total = 0.0;
		double Average = 0.0;
		//Generate random doubles between 0 and 4.999...
		generateRandomArray(size, randArray, maxRandom);
		for(int i=0;i<size;i++) {
			total = total+randArray[i];
		}
		Average = total / size;
		for(int i=0;i<size;i++) 
			System.out.println("Array element "+i+" is: "+randArray[i]);
		
		System.out.println("Total of all numbers generated: "+total);
		System.out.println("Average of all numbers generated: "+Average);
		input.close();
	}
static void generateRandomArray(int size, double randArray[], int maxRandom) {
	for(int i=0;i<size;i++) 
		randArray[i] = (double) (Math.random()*maxRandom);

}
}
