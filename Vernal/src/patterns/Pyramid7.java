package patterns;

public class Pyramid7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<n-1-i;space++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i*2;j++)
			{
				if(j==0||i==2*i-2)
				System.out.print("* ");
			}
		
		System.out.println();
		}
		/*for(int i=n-2;i>=0;i--)
		{
			for(int space=0;space<n-1-i;space++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("* ");
			}
		
		System.out.println();
		
		}*/
	}

}
