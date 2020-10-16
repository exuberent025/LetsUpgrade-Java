import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 5; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
