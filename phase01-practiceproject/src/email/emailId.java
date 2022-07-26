package email;
import java.util.regex.*;    
import java.util.*;    
public class emailId{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("example@gmail.co.in");  
        emails.add("abc@gmail.com");  
        emails.add("harsha.name@gmail.com");  
        emails.add("happy@domain.co.in");  
        emails.add("xyz@gmail.com");  
        emails.add("mallikakakollu@gmail.com");  
       //invalid email  
        emails.add("@yahoo.com");  
        emails.add("javaTpoint#gmail.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate email array list  
        for(String email : emails){  
            //Create instance of matcher 
        	Matcher matcher=pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}