import java.util.Scanner;

public class OOPLab1 {
    public static void main(String[] args) {
        String name, className;
        int noOfSnacks;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your class name: ");
        className = input.nextLine();

        System.out.print("Please enter the amount of snacks: ");
        noOfSnacks = input.nextInt();

        System.out.print("\n\nName: " + name + "\nClass: " + className + "\nNumber of snacks: " +
                noOfSnacks + "\nThe price is: " + noOfSnacks*2);
    }
}
