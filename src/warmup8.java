
public class warmup8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "didgeridoo";
		
		System.out.print("String s: "+s+" contains: ");
		getVowels(s);
		System.out.print("vowels.");
		
		}
	static void getVowels(String s) {
	int count=0;
	char arr[] = s.toCharArray();
	char[] vowels = new char[100];
	for(int i=0;i<arr.length;i++)
		if( arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ) {
			vowels[count] = arr[i];
			count++;
			}
	
	for(int i=0;i<count;i++)
			System.out.print(vowels[i]+" ");
	}
}
