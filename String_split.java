package p1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String_split {
	 
    public static void main(String args[]) {
 
    	String[] input = new String[3];
    	input[0]="50000 credit 21-12-2018";
    	input[1]="4000 debit 02-10-2010";
    	input[2]="100 debit 28-02-2003";
        String temp = "50000 credit 23-12-2018";
        String[][] final_words=new String[3][3];
        
        final_words=split(input);
        final_words=date(final_words);
        
        for(int i=0;i<3;i++)
        	for(int j=0;j<3;j++)
        		System.out.println(final_words[i][j]);
        
 
        
 
         
    }
    public static String[][] split(String[] input)
    {	String[][] final_words=new String[3][3];
    	String[] tempArray;
    	for(int i=0;i<3;i++)
        {
        	tempArray=input[i].split(" ");
        	for(int j=0;j<3;j++)
        	{
        		if(tempArray[j].equals("credit"))
        			{final_words[i][j]="credited to";}
        		else if(tempArray[j].equals("debit"))
    			{final_words[i][j]="debited from";}
        		else
        		{final_words[i][j]=tempArray[j];}
        		
        		//System.out.println(final_words[i][j]);
        	}
        }
    	return final_words;
    }
    public static String[][] date(String[][] input)
    {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
    	Date date;
    	String suffix;
    	
    	for(int i=0;i<3;i++)
    	{
    		
			try {
				date = formatter.parse(input[i][2]);
				suffix=new SimpleDateFormat("d").format(date);
				int n=Integer.parseInt(suffix)%10;
				switch(n%10){
				case 1:suffix="st";
					break;
				case 2:suffix="nd";
					break;
				case 3:suffix="rd";
					break;
				default:suffix="th";
				}
	            input[i][2]=(new SimpleDateFormat("MMMM").format(date))+" "
	            		+(new SimpleDateFormat("d").format(date))
	            		+suffix+" "
	            		+(new SimpleDateFormat("YYYY").format(date));
	            //System.out.println(input[i][2]);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            

    	}
    	return input;
    }
 
}