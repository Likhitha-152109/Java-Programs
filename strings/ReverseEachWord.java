import java.util.*;
public class ReverseEachWord
{
	public static void main(String[] args)
	{
		String s="Hello World java";
		String words[]=s.split(" ");
		String result="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reversed="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reversed=reversed+word.charAt(j);
			}
			result=result+reversed+" ";
		}
		System.out.println("Output:"+result.trim());
	}
}
			