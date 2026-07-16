public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d x %d = %d", i, j, i * j);
                if (j < 10) {
                    System.out.print(" ; ");
                }
            }
            System.out.println(); 
        }
    }
}
