import java.util.*;
public class Num_perfect_Square {

	public static void main(String[] args) {
		System.out.println("Enter number for checking");
		int flag=0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	// TODO Auto-generated method stub
        for(int i=1;i<=num/2;i++)
        {
        	if(num==i*i)
        	{
        		System.out.println(num+ " "+"is perfect square");
        		flag=1;
        	}
        		
        	
        }
        if(flag==0) {
        	System.out.println(num+ " "+"is not a perfect square");
        }
        
        
	}

}
