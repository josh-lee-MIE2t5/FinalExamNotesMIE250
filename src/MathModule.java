import java.lang.Math;

public class MathModule {
    public static void main(String[] args) {
        Math.max(5, 10);
        // output: 10

        Math.min(5, 10);
        // output: 5

        Math.sqrt(64);
        // Output: 8

        Math.abs(-4.7);
        // Output: 4.7

        Math.random();
        // Output: a random number between 0.0 (inclusive), and 1.0 (exclusive)

        int randomNum = (int) (Math.random() * 101); // 0 to 100

        Math.floor(2.8);
        // Output: 2

        Math.ceil(1.3);
        // Output: 2

        Math.round(1.5);
        // Output: 2

        Math.pow(2, 3);
        // Output: 8
    }
}
