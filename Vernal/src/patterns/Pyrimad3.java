package patterns;

public class Pyrimad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			
				if(i+j>n)
				{
					
					System.out.print("* ");
			}
			
				else 
				{
					System.out.print("  ");
				}
			System.out.println();
		}
/*for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*  ");
	}
System.out.println();
}*/
	}

}
