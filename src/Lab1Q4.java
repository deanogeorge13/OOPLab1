import java.util.Scanner;

public class Lab1Q4 {
    public static void main(String[] args) {
        int  total=0, entries=0, number=0;
        String numberEntered="";

        Scanner input = new Scanner(System.in);

        while(!numberEntered.equals("q"))
        {
            if(!numberEntered.equals("q")) {
                System.out.print("Grand total: " + total + "\n\nNumber of entries: " + entries);
            }

            System.out.print("Enter a number: ");
            numberEntered = input.nextLine();
            //number = Integer.parseInt(numberEntered);

            entries++;
        }








    }
}
