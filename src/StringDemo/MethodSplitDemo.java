package StringDemo;

import java.util.Arrays;

public class MethodSplitDemo {
    public static void main(String[] args) {
        String str = "This is my home";
        String[] strArr = str.split(" ");
        for (int i =0; i<strArr.length;i++)
        System.out.println(strArr[i]);
    }
}
