package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LoopThoughList1{
public static void main(String[]args) {
    List<String> fruit = new ArrayList<>();
    fruit.add("Apple");
    fruit.add("Banana");
    fruit.add("Guava");
    fruit.add("Pineapple");
    fruit.add("Plum");
   for(String f : fruit)
    {
        System.out.println(f);
    }
}}