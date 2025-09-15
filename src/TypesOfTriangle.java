public class TypesOfTriangle {
    public static void main(String[] args) {
        int angleA = 50;
        int angleB = 70;
        int angleC = 60;
        if (angleA + angleB + angleC == 180)
        {
            if (angleA == angleB && angleB == angleC)
                System.out.println("It is a Equilateral Triangle: All 3 angles are equal");

            if (angleA == angleB && angleB != angleC || angleB == angleC && angleC != angleA || angleC == angleA && angleC != angleB)
                System.out.println("It is a Isosceles Triangle: Two angles are equal");

            if (angleA != angleB && angleB != angleC && angleC != angleA)
                System.out.println("It is a Scalene Triangle: None of its angles have same degree");

            if (angleA == 90 || angleB == 90 || angleC == 90)
                System.out.println("It is a Right Angle Triangle: One of its angels is of 90 degree");
        }
        else
            System.out.println("It is not a Triangle");
    }
}
