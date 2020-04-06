
public class warmup7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, -3, 15, -13};
		System.out.print("Array elements: ");
		for(int i=0; i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println("");
		countNegatives(arr);
	}

	static void countNegatives(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				count+=1;}
		System.out.println("Number of negative elements in array: "+count);			
	}
}
