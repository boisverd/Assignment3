
public class warmup5 {

	public static void main(String[] args) {
		int arr[] = {1,5,-3,15,4,20,99,-6,98,23,11,0,45,42,3,10};
		System.out.println("Array elements before sorting: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
			System.out.println("");
		getLargestElement(arr);
			
		
		

	}
static void getLargestElement(int arr[]) {
		int a = arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i]>a)
				a = arr[i];
		System.out.println("Largest element: "+a);
}
}
