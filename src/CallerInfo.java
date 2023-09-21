public class CallerInfo {
    public static String getCaller() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 3) {
            StackTraceElement caller = stackTrace[2];
            return caller.getClassName() + "." + caller.getMethodName();
        }
        return null;
    }
}
