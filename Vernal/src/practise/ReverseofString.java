package practise;

public class ReverseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghijklmnopqrstuuvwxyz";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
				
	}

}
