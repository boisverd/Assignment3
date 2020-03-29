
import java.util.Scanner;

public class warmup1 {

	public static void main(String[] args) {
		// print image
		int length=0; int width = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of sides: ");
		length = in.nextInt();
		System.out.print("Enter width of sides: ");
		width = in.nextInt();
		for(int y=0;y<length;y++) {
			for(int i=0;i<width;i++)  //horizontal
			{	
				if( y % 2 == 0 ) 
					if( i < width - 1 )
						System.out.print("*");
					else 
						System.out.println("*");	
				else
					if(i==0)
						System.out.print("*");
					else if( i < width - 1 )
						System.out.print(" ");
					else
						System.out.println("*");
			}
		}
		in.close();
	}
}