import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "56789";
        int sum = 0;
        while (true) {
            System.out.print("Enter a 5 digit secret code: ");
            String guess = scanner.next();
            if (guess.equals(number)) {
                System.out.println("Great, all digits correct");
                break;
            } else {
                if (guess.charAt(0) == '5') {
                    System.out.println("position 0, Correct");
                    sum += Character.getNumericValue(guess.charAt(0));
                }
                if (guess.charAt(1) == '6') {
                    System.out.println("position 1, Correct");
                    sum += Character.getNumericValue(guess.charAt(1));
                }
                if (guess.charAt(2) == '7') {
                    System.out.println("position 2, Correct");
                    sum += Character.getNumericValue(guess.charAt(2));
                }
                if (guess.charAt(3) == '8') {
                    System.out.println("position 3, Correct");
                    sum += Character.getNumericValue(guess.charAt(3));
                }
                if (guess.charAt(4) == '9') {
                    System.out.println("position 4, Correct");
                    sum += Character.getNumericValue(guess.charAt(4));
                }
                if (!guess.contains("5") && !guess.contains("6") && !guess.contains("7") && !guess.contains("8") && !guess.contains("9")) {
                    System.out.println("no digits correct");
                }
            }
        }
        System.out.println("Your sum is " + sum);
    }
}
