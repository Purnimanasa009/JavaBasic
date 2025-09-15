public class Table {
    public static void main(String[] args)
    {
        int a = 108;
        int i;
        int mult;

        System.out.println("Table of " +a);
        for (i = 1; i <= 10; i++) {
            mult = a * i;
            System.out.println(a + "*" +i + "=" +mult);
        }
    }
}