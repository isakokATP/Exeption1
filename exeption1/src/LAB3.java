public class LAB3 {
    //exeption 1
    public static void main(String[] args) {
        try {
            int[] list = new int[5];
            System.out.println(list[5]);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    //exeption 2
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    //exeption 3
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("divisor ca");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
