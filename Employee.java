public class Employee
{
    String name;
    int age;
    String city;
    void display(String name,int age,String city)
    {
        System.out.println("The name is " +name);
        System.out.println("The age is " +age);
        System.out.println("The city is " +city);
    }
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.display("Saurab",23,"Chennai");
        e2.display("Indu",26,"Pune");
    }
}
