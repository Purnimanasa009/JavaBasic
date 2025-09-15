package Arrays;
public class ArrayCharDemo {
    public static void main(String[] args) {
        char[] c = new char[5];
        c[0] = 'J';
        c[1] = 'a';
        c[2] = 'v';
        c[3] = 'a';
        c[4] = '!';

        for (int i=0; i< c.length; i ++) {
            System.out.print(c[i]);
        }
    }
}