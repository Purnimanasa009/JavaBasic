package Inheritance;

    class bird {
    void fly() {

        System.out.println("Bird Flies");
    }
}
    class sparrow extends bird {
        void sparrowColor() {

            System.out.println("Sparrow color is Brown");
        }
    }
    class crow extends bird {
            void crowColor() {

                System.out.println("Crow color is Black");

            }
        }
        public class inheritanceTest {
            public static void main(String[] args) {
                bird b = new bird();
                b.fly();

                sparrow s = new sparrow();
                s.fly();
                s.sparrowColor();

                crow c = new crow();
                c.fly();
                c.crowColor();
            }

        }
