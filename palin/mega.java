import java.util.Arrays;
import java.util.Scanner;

public class beer_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tc=sc.nextInt();
		for(int i=0;i<tc;i++)
		{ int count=0;
			int bottel=sc.nextInt();
			for(int j=1;j<=bottel;j++)
			{
				
				if((bottel % j) == 0)
				{
					count++;
				}
			}
			if(count >= 4)
				System.out.println("yes");
			else
				System.out.println("No");
		}
	}

}
