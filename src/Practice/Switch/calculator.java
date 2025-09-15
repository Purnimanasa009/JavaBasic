package Practice.Switch;

public class calculator {
    public static void main(String[] args) {
        int number1 = 14;
        int number2 = 3;
        int result;
        String operation = "add";

        switch (operation) {
            case "add": result = number1 + number2;
                System.out.println("Sum of 2 numbers = " + result);
                break;
            case "sub": result = number1 - number2;
                System.out.println("Difference of 2 numbers = " + result);
                break;
            case "div":
                result = number1 / number2;
                System.out.println("Division of 2 numbers = " + result);
                break;
            case "mult":
                result = number1 * number2;
                System.out.println("Multiplication of 2 numbers = " + result);
                break;
            case "mod":
                result = number1 % number2;
                System.out.println("Mod of 2 numbers = " + result);
                break;
            default:
                System.out.println("Invalid opration");
        }
    }
}