package Loops;

public class SumofFirst10NaturalNumbers {
    public static void main(String[]args)
    {
        int i = 0;
        int no = 1;
        do {
            no=no+i;
            i++;
        }
        while (i<=9);
        System.out.println(no);


    }
}
