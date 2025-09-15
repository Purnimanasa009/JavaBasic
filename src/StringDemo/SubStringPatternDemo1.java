package StringDemo;

public class SubStringPatternDemo1 {
    public static void main(String[]args)
    {
        String str = "Purnima";

    //Printing pattern
        for (int i = 0; i<str.length(); i++)
        {
            System.out.println(str.substring(i) + str.substring(0, i));
            System.out.println();
    }

}
}