package Polymorphism;

import java.awt.image.SampleModel;

class samsang extends showroom{
void channels()
    {
System.out.println("Method channels from class Samsang");
    }
    void volumeControl()
    {
        System.out.println("Method volumeControl from class Samsang");
    }
    void settings()
    {
        System.out.println("Method settings from class Samsang");
    }
}

class lg extends showroom{
    void channels()
    {
        System.out.println("Method channels from class LG");
    }
    void volumeControl()
    {
        System.out.println("Method volumeControl from class LG");
    }
    void settings()
    {
        System.out.println("Method settings from class LG");
    }
}

class onida extends showroom{
    void channels()
    {
        System.out.println("Method channels from class Onida");
    }
    void volumeControl()
    {
        System.out.println("Method volumeControl from class Onida");
    }
    void settings()
    {
        System.out.println("Method settings from class Onida");
    }

    void display()
    {   channels();
        super.volumeControl();
        super.settings();
    }
}
public class showroom {
    void channels()
    {
        System.out.println("Method channels from class Showroom");
    }
    void volumeControl()
    {
        System.out.println("Method volumeControl from class Showroom");
    }
    void settings()
    {
        System.out.println("Method settings from class Showroom");
    }
    public static void main(String[]args)
    {
        onida o = new onida();
        o.display();



    }
}
