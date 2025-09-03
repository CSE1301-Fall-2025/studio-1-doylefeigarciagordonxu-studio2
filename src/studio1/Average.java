package studio1;

import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value: ");
        Integer number1 = in.nextInt();
        System.out.print("Enter another value: ");
        Integer number2 = in.nextInt();
        Double average = (number1 + number2) / 2.0;
        System.out.println("The average is: " + average);
    }
}
