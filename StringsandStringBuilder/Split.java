package StringsandStringBuilder;

public class Split {
   public static void main(String[]args){
    String str="abc,def,ghi,jkl";
    String [] text=str.split(",");
    for(String t:text){
        System.out.println(t);
    }

   }
}
