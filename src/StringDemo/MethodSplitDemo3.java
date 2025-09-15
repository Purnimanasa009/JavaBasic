package StringDemo;
public class MethodSplitDemo3 {
    public static void main(String[] args) {
        String str = "Hey baby you are so lovely";
        //Print only the word that ends with y

        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            String tempstr = strArr[i];
                if (tempstr.charAt(tempstr.length() - 1) == 'y')

                    System.out.println(tempstr);


        }
    }
}