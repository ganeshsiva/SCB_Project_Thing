 package test_stuff;
 
public class HashMap {
	static int count =0;
	public static void main(String[] args) { 
        String str_Sample = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        //String contains method is case sensitive  
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));
    }
	public static void flow(String s1)
	{	
		String s = s1.toLowerCase();
		if(
				(s.contains("saving") && s.contains("credit") && s.contains("loan"))
				||(s.contains("saving") && s.contains("credit"))
				||(s.contains("credit") && s.contains("loan"))
				||(s.contains("saving") && s.contains("loan"))
		  )
		{
			/*error stuff*/
			errorfunc();
		}
		else if(s.contains("saving"))
		{saving(s);}
		else if(s.contains("credit"))
		{credit(s);}
		else if(s.contains("loan"))
		{loan(s);}
		
		else
		{
			/*error stuff*/
			errorfunc();
		}
		
		
	}
	public static void saving(String s)
	{
		if(s.contains("balance"))
		{}
		else if(s.contains("interest"))
		{}
		else if(s.contains("transaction"))
		{}
		else
		{count++;
		
		
		if(count<3)
		{/*tts and stt*//*try again tts message*/
		saving(s);
		}
		else
		{count =0; errorfunc();}
		}
	}
	public static void credit(String s)
	{
		if(s.contains("outstanding"))
		{}
		else if(s.contains("due")||s.contains("date"))
		{}
		else if(s.contains("transaction"))
		{}
		else
		{count++;
		if(count<3)
		{/*try again tts message*/
		saving(s);
		}
		else
		{count =0; errorfunc();}
		}
	}
	public static void loan(String s)
	{if(s.contains("principle"))
	{}
	else if(s.contains("interest"))
	{}
	else if(s.contains("pending"))
	{}
	else if(s.contains("emi"))
	{}
	else
	{count++;
	if(count<3)
	{/*try again tts message*/
	saving(s);
	}
	else
	{count =0; errorfunc();}
	}}
	public static void errorfunc()
	{/*relevant error function*/
		/*call flow() again*/
	}

}
