import java.util.*;
public class Greatest_One_Among_3_Num {

	public static void main(String[] args) {
		System.out.println("Enter three number for checking greatest one");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a +" "+ "will be greater");
		}else if(b>c)
		{
			System.out.println(b +" "+ "will be greater");
		}else {
			System.out.println(c +" "+"will be greater");
		}
		
		// TODO Auto-generated method stub

	}

}
