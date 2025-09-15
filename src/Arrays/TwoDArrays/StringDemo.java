package Arrays.TwoDArrays;

public class StringDemo {
    public static void main(String[] args) {
        String[][] name =
                {
                        {"Purnima", "Neha", "Seema"},
                        {"Nisha", "Meera", "Meena"},
                        {"Savita", "Sunita", "Poonam"},
                        {"Amisha", "Lalita", "Kavita"}

                };
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[0].length; j++) {
                System.out.print(name[i][j] + "\t");
            }
            System.out.println();
        }
    }
}