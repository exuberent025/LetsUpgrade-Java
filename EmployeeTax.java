import java.util.Scanner;
public class EmployeeTax
{
    String name;
    int date, month, year;
    double salary, annual, tax = 0.0;
    Scanner myobj = new Scanner(System.in);
    static void findAge(int current_date, int current_month,
                        int current_year, int birth_date,
                        int birth_month, int birth_year)
    {
        int month[] = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};
        if (birth_date > current_date) {
            current_month = current_month - 1;
            current_date = current_date + month[birth_month - 1];
        }
        if (birth_month > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }
        int calculated_date = current_date - birth_date;
        int calculated_month = current_month - birth_month;
        int calculated_year = current_year - birth_year;
        System.out.println("Present Age : " + calculated_year + " Years " + calculated_month + " Months " +
                calculated_date + " Days");
    }

    public double getdetails()
    {
        System.out.print("Enter Employee name :");
        name = myobj.nextLine();
        System.out.print("Enter Employee birth date : ");
        date = myobj.nextInt();
        System.out.print("Enter Employee month : ");
        month = myobj.nextInt();
        System.out.print("Enter Employee year : ");
        year = myobj.nextInt();
        System.out.print("Enter monthly salary : ");
        salary = myobj.nextInt();

        annual = salary * 12;
        if (annual >= 500000)
        {
            tax = (annual * 20) / 100;
        }
        else if (annual >= 400000 && annual < 500000)
        {
            tax = (annual * 15) / 100;
        }
        else if (annual >= 300000 && annual < 400000)
        {
            tax = (annual * 10) / 100;
        }
        else if (annual >= 200000 && annual < 300000)
        {
            tax = (annual * 5) / 100;
        }
        else
        {
            tax = 0.0;
        }
        return tax;
    }
    public void displaydetails()
    {
        System.out.println("Employee Name : " +name);
        int current_date = 16;
        int current_month = 10;
        int current_year = 2020;

        int birth_date = date;
        int birth_month = month;
        int birth_year = year;

        findAge(current_date, current_month, current_year,
                birth_date, birth_month, birth_year);
        System.out.println("Annual Salary : " +annual);
        System.out.println("Tax Amount : " +tax);
    }
    public static void main(String[] args)
    {
        EmployeeTax e1 = new EmployeeTax();
        e1.getdetails();
        e1.displaydetails();
    }
}
