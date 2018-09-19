import javax.swing.*;

public class Lab1Q5 {
    public static void main(String[] args) {
        String choice;
        double n1, n2, result=0;

        choice = JOptionPane.showInputDialog("Choose desired operation (A-Addition, S-Subtraction, M-Multiplication, D-Division): ");
        char ch = choice.charAt(0);

        String num1 = JOptionPane.showInputDialog("Enter a number");
        n1 = Double.parseDouble(num1);

        String num2 = JOptionPane.showInputDialog("Enter a second number");
        n2 = Double.parseDouble(num2);

        switch (ch){
            case 'A':
                result = n1+n2;
                break;

            case 'S':
                result = n1-n2;
                break;

            case 'M':
                result = n1*n2;
                break;

            case 'D':
                result = n1/n2;
                break;

            default:
                break;
        }

        JOptionPane.showMessageDialog(null,"Answer: " + result,"output", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
