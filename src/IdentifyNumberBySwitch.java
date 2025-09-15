public class IdentifyNumberBySwitch {
    public static void main(String[] args) {
        int a = 102;
        int b = 217;
        boolean result;
        String operation = "greater";

        switch (operation) {
            case "greater": if(result = a > b)
                    System.out.println("I m greater then B, I am A = " + a);
                else
                    System.out.println("I am greater then A, I am B = " + b);
                break;
            case "equal": if(a==b)
                System.out.println("We are equal");
                    else
                        System.out.println("We are not equal");
                break;
          case "type": if(a%2 ==0)
                    System.out.println("I am odd number " + a);
                else
                    System.out.println("I am even number " + a);
                break;

        }

    }
}

