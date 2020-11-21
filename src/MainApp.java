public class MainApp {
    public static void main(String[] args) {

        // Application to check if sum of a nd b is odd or even, sum of c and d is odd or even.
        // Application check if all sums are even or odd
        int a = 324;
        int b = 2342;
        int c = 2652;
        int d = 9876;

        if ((a + b) % 2 == 0) {
            System.out.println("Sum of a and b is even");
        } else {
            System.out.println("Sum of a and b is odd");
        }
        if ((c + d) % 2 == 0) {
            System.out.println("Sum of c and d is even");
        } else {
            System.out.println("Sum of c and d is odd");
        }

        if ((a + b) % 2 == 0 && (c + d) % 2 == 0) {
            System.out.println("Sum of a and b is even and sum of c and d is even");
        } else {
            System.out.println("Sum of a and b or sum of c and d is odd");
        }
    }
}
