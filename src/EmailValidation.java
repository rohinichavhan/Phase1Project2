  //As a developer, WAP to search a string entered by a user from the array of strings.
       import java.util.regex.*;    
       import java.util.*;    
       public class EmailValidation
      {  
       public static void main(String args[])
      {  
        ArrayList<String> emails = new ArrayList<String>();  
       
          //Add valid email in lists
       
        emails.add("rohinichavhan289@gmail.com");  
        emails.add("rohinichavhan27@gmail.com");  
        emails.add("rohinichavhan1998@gmail.com");
        emails.add("rohinichavhan24@gmail.com");  

        //Add invalid email in lists
       
        emails.add("$yahoo.com");  
        emails.add("90969599g%mail.com");  
        emails.add("Rohini$outlook.com");  

        //Regular Expression  
       
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";  
       
        //Compile regular expression to get the pattern  
       
        Pattern pattern = Pattern.compile(regex);  
       
        //Iterate email array list  
       
        for(String email : emails)
        {  
            //Create instance of matcher  
       
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}

