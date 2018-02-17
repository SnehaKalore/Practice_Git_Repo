public class Palin
{

	public static void main(String args[])
	{

		String reverse = "Sneha";
	
		int length = str.length();
		
		for(int i=length-1; i>-1; i--)
		  reverse += str.charAt(i);
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse))
		  System.out.println(str + " is a palindrom");
		else
		  System.out.println(str + " is not a palindroom");
	}
}	
