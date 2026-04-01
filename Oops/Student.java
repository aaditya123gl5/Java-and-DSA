package Oops;

    public record Student(String name, String id, String dob, String list){
         
    public static void main(String[]args){
        Student s1=new Student("aadi","123","01/03/2004","3");
        System.out.println(s1);
    }
}

