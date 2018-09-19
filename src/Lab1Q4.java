import java.util.Scanner;

public class Lab1Q4 {
    public static void main(String[] args) {
        int  total=0, entries=0, number;
        String numberEntered;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: (q to quit)");
        numberEntered = input.nextLine();

        while(!numberEntered.equals("q"))
        {
            number = Integer.parseInt(numberEntered);
            entries++;

            total+=number;

            System.out.print("Enter a number: (q to quit)");
            numberEntered = input.nextLine();




        }



        System.out.print("\nGrand total: " + total + "\n\nNumber of entries: " + entries);







    }
}
