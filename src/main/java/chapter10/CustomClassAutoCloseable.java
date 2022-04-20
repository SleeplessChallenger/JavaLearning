package chapter10;

public class CustomClassAutoCloseable implements AutoCloseable {
    private final int num;

    public CustomClassAutoCloseable(int num) {
        this.num = num;
    }

    public void close() {
        System.out.println("Closing: " + num);
    }

    public static void main(String... unused) {
        try (CustomClassAutoCloseable a1 = new CustomClassAutoCloseable(1);
            CustomClassAutoCloseable a2 = new CustomClassAutoCloseable(2)) {
            // FIXME: in the scope of try or not?
            throw new RuntimeException();
        } // all below are out of `AutoCloseable` scope
        catch (Exception e) {
            // FIXME: why we don't define exception in the signature? We throw it
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
}
