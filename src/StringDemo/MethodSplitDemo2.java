package StringDemo;
public class MethodSplitDemo2 {
    public static void main(String[]args) {
        String str = "Hey baby you are so lovely";
        //Print only the word that ends with y

        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++)
        {
            if (strArr[i].endsWith("y"))

                System.out.println(strArr[i]);

        }
    }
}
