package Oops;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;
    public Customer(){
        this("ram","ram123gl5@gmail.com");
    }
    public Customer(String name, String email){
        this("mohan",200.00,"ramv@gmai.com");
    }
    public Customer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }
    public static void main(String[]args){
        Customer c1=new Customer();
        System.out.println(c1.name);
        Customer c2=new Customer("shyam","s2456@gmail.com");
        System.out.println(c2.name);
        Customer c3=new Customer("vansh",50,"v12345@gmail.com");
        System.out.println(c3.name);

    }
    
    
}
