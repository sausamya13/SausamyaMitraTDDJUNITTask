package tddjunittask;

public class DeleteFirst2Chars 
{

	public String delete(String string)
{
		String result=string;
		int stringLength=string.length();
		//char firstChar=string.charAt(stringLength-(stringLength-1));
		//char secondChar=string.charAt(stringLength-(stringLength-2));
		String remainingChars=string.substring(2,stringLength);
		if(string.charAt(stringLength-(stringLength-1))==string.charAt(stringLength-(stringLength-2)) && stringLength >= 2)
		{
			result=remainingChars;	
		}
		else 
		{
			result= string;
		}
		return result;
	}

}
 