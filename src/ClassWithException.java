public class ClassWithException {
    public static void getException() throws MyException {
        throw new MyException("Test message");
    }
}
