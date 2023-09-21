public class ClassWithException {       // Задание 11
    public static void getException() throws MyException {
//        System.out.println(CallerInfo.getCaller());
        throw new MyException("Test message");
    }
}
