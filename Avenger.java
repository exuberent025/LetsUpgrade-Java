import java.util.Scanner;

public class Avenger
{
    int age;
    String name, power, weapon, planet;
    Scanner myobj = new Scanner(System.in);
    public void getDetails()
    {
        System.out.print("Enter Avenger's Name : ");
        name = myobj.nextLine();
        System.out.print("Enter " +name+ " Power : ");
        power = myobj.nextLine();
        System.out.print("Enter " +name+ " Weapon : ");
        weapon = myobj.nextLine();
        System.out.print("Enter " +name+ " Planet : ");
        planet = myobj.nextLine();
        System.out.print("Enter " +name+ " Age : ");
        age = myobj.nextInt();
    }
    public void displayDetails()
    {
        System.out.println("Avenger's Name : " +name);
        System.out.println(name+ " Power : " +power);
        System.out.println(name+ " Age : " +age);
        System.out.println(name+ " Weapon : " +weapon);
        System.out.println(name+ " Planet : " +planet);
    }
    public static void main(String[] args)
    {
        Avenger[] avenger = new Avenger[5];
        for(int i = 0; i < 5; i++)
        {
            avenger[i] = new Avenger();
            avenger[i].getDetails();
        }
        for(int i = 0; i < 5; i++)
        {
            avenger[i].displayDetails();
        }
    }
}
