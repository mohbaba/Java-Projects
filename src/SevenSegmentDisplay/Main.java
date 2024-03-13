package SevenSegmentDisplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter combination you'd like to display: ");
            String input = scanner.next();
            System.out.println(SevenSegmentDisplay.display(input));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
