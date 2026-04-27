package Oops;

public class BasicClass {
    private String title;
    public BasicClass(String title){
        this.title=title;
    }
    public void watchMovie(){
        String type=this.getClass().getSimpleName();
        System.out.println(type);
    }
    public static void main(String[] args){
        BasicClass b=new BasicClass("Bahubali");
        b.watchMovie();
    }
    
}
