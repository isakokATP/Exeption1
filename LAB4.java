public class LAB4 {
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            System.out.println(1 / 0);
            System.out.println("statement 3");
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        catch (ArithmeticException e) {
            throw new StringIndexOutOfBoundsException();
        }
        finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
