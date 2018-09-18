import java.util.Scanner;

public class Lab1Q2 {
    public static void main(String[] args) {
        String forename, initials, lastname;
        int distance;
        double cost;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        forename = input.nextLine();

        System.out.print("Please enter your initials: ");
        initials = input.nextLine();

        System.out.print("Please enter your last name: ");
        lastname = input.nextLine();

        System.out.print("Please enter the distance you travelled: ");
        distance = input.nextInt();

        if(distance>10)
            cost = (10*0.07) + ((distance-10)*(0.10));

        else
            cost = distance*0.07;

        System.out.println("\n\n\nFirst Name: " + forename + "\nInitials: " + initials + "\nLast " +
                "name: " + lastname + "\nDistance Travelled: " + distance + " km" + "\nAmount due: " + cost);
    }
}
