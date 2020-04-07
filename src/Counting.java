import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner input = new Scanner(System.in);
		System.out.print("When should I stop counting to? ");
		num = input.nextInt();
		
		Counting(num);
		
		input.close();
	}
static void Counting(int num) {
	int arr[] = new int[num];
	for(int i=0;i<arr.length;i++)
		arr[i] = i+1;
	System.out.print("I am counting until "+num+":");
	for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]);
}
}
