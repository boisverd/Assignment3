public class warmup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coordinates[] = {1,9,2,9,3,9,4,9,5,9,6,9,7,9,8,9,9,9};
		System.out.println("^"); //print top arrowhead
		
		for(int y=0;y<9;y++) {
			System.out.print("|"); //vertical line
			for(int i=0;i<18;i++)
				if(i%2 == 0)
					System.out.print("("+coordinates[i]+",");
				else
					if(y!=0) {
						coordinates[i]=coordinates[i]-1;
						System.out.print(coordinates[i]+")");}
					else
						System.out.print(coordinates[i]+")");
			System.out.println("");
		}
		System.out.println("+--------------------------------------------->");
	}

}