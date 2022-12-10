public class TryCatch {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4 };
        try {
            System.out.println(x[4]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Index 4 can't be done for length 4 its 3 you idiot");
        }
    }
}
