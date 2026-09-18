package StringsandStringBuilder;

public class allCharacterInTwoString {
    public static void main(String args[]){
        boolean res=isValid("ab","abba");
        System.out.println(res);
        
    }
    public static  boolean isValid(String a,String s){
        int i=0;
        int j=0;
        while(i<a.length()&&j<s.length()){
            if(a.charAt(i)==s.charAt(j)){
                    i++;
            }
            j++;
        }
        if(i==a.length()){
            return true;
        }
        return false;
    }
    
}
/*
                int num=ch-'0';
                char ch1=s.charAt(i-1); previous character
                int ascii=(int)ch1;      char to ascii
                int newAscii=ascii+num;
                char ch2=(char)newAscii; ascii to char
                */