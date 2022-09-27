import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //creates a scanner called in

        int favNum = 0;
        double salary = 0;
        String name = "";
        int age = 0;
        String trash = "";

        System.out.print("Enter your name: ");
        name= in.nextLine();
        System.out.println("You said your name is: " + name);

        //This is an unprotected read of a number value which will fail if it is not a valid number (ex. t18).
        /*System.out.print("\nEnter your age: ");//\n adds a new line
        //age = in.nextInt();
        System.out.println("You said you are " + age + " years old.");
         */

        System.out.print("\nEnter your age: ");//\n adds a new line
        if(in.hasNextInt())
        {
           age = in.nextInt();
           in.nextLine(); //clears buffer
           System.out.println("You said you are " + age + " years old.");
        }
        else
        {
         trash = in.nextLine();
            System.out.print(trash + "is not a valid number.");
        }
        System.out.print("Enter your salary: ");

        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // have to clear the buffer after reading a number
            System.out.println("\nYou said your salary is: " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.print(trash + " is bad input.");
        }


        //Favorite number 1 - 10
        System.out.print("Enter your fav num [1-10]: ");
        if(in.hasNextInt());
        {
            favNum = in.nextInt();
            in.nextLine();
            if(favNum >= 1 && favNum <= 10)
            {
                System.out.println("You said your favorite number is " + favNum);
            }
            else
            {
                System.out.println("You said your fav num is " + favNum + " but the number you entered is not between 1 and 10.");
            }
        }



    }

}