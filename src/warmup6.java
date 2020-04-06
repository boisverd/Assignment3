
public class warmup6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1, 3, 5, -4, 9, 88, 72, 0, 22};
		int arr[] = {1, 5, -3, 15, 4};
		System.out.print("Array elements: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println("");
		getSum(arr);
	}

static void getSum(int arr[]) {
	int sum=0;
	for(int i=0;i<arr.length;i++)
		sum = sum + arr[i];
	
	System.out.println("Sum of each array elements: "+sum);
}
}
