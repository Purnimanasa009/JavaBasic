package StringDemo;

public class SubStringPatternDemo {
    public static void main(String[]args)
    {
        String str = "I am intelligent and i am learning things faster";

    //Printing pattern

        for (int j = 0; j<str.length(); j++)
        {
            System.out.println(str.substring(j) + str.substring(0, j));
            System.out.println();
    }

}
}