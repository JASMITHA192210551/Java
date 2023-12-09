import java.util.*;

class Prime_And_Composite
{
    Scanner k = new Scanner(System.in);
    void array_list()
    {
        int count = 0, number, no_of_composite_numbers = 0, no_of_prime_numbers = 0;
        System.out.print("Enetr number of elements to be checked : ");
        int n = k.nextInt();
        for(int i = 0;i < n;i++)
        {
            number = k.nextInt();
            for(int j = 2;j < number;j++)
            {
                if(number % j == 0)
                {
                    count += 1;
                }
            }
            if(count == 0)
            {
                no_of_prime_numbers += 1;
            }
            else
            {
                no_of_composite_numbers += 1;
            }
            count = 0;
        }
        System.out.println("No of Prime numbers is : " + no_of_prime_numbers);
        System.out.println("No of Composite numbers is : " + no_of_composite_numbers);
    }
    public static void main(String args[])
    {
        Prime_And_Composite object1 = new Prime_And_Composite();
        object1.array_list();
    }
} 