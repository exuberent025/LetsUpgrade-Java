import java.util.Scanner;

public class Student
{
    public static void main(String[] args)
    {
        int english, hindi, maths, science, computer;
        float total = 0, avg;
        char grade;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter english marks : ");
        english = myobj.nextInt();
        System.out.println("Enter hindi marks : ");
        hindi = myobj.nextInt();
        System.out.println("Enter maths marks : ");
        maths = myobj.nextInt();
        System.out.println("Enter science marks : ");
        science = myobj.nextInt();
        System.out.println("Enter computer marks : ");
        computer = myobj.nextInt();
        total = english + hindi + maths + science + computer;
        avg = total/5;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
