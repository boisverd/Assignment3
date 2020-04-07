import java.util.Scanner;

public class CountingStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int step=0;
		Scanner input = new Scanner(System.in);
		System.out.print("When should I stop counting to? ");
		num = input.nextInt();
		System.out.print("Which step should I use? ");
		step = input.nextInt();
		CountingStep(num,step);
		
		input.close();
	}
static void CountingStep(int num, int step) {
	int count=1;
	int i=0;
	int arr[] = new int[num];
	arr[i] = count;
	System.out.print("I am counting to "+num+" with a step of "+step+":");
		do {
			//System.out.print(" "+count);
			i++;
			arr[i] = count+=step;
		}while(count+step<=num);
	for(int x=0;x<arr.length;x++)
		if(arr[x] == 0)
			continue;
		else
			System.out.print(" "+arr[x]);
}
}
