import java.util.*;
public class Count_no_of_digit {

	public static void main(String[] args) {
		System.out.println("Enter the number for counting the digits");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int count=0;
		while(num>0)
		{
			if(num%10>0)
			{
				count=count+1;
			}
			num=num/10;
		}
		System.out.println("The total digits in a Number will be"+" "+ count);
		
		// TODO Auto-generated method stub

	}

}
