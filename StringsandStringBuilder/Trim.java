package StringsandStringBuilder;

public class Trim {
    public static void main(String[]args){
        String str=" Ram and Shyam ";
        //System.out.println(str);
        //System.out.println(str.trim());
        System.out.println(str.strip());
        System.out.println(str.replace(" ",""));
         //s=s.replaceAll("[^a-zA-Z0-9]", "");
         //to remove everything form string other than alphanumeric character
    }

    
}
