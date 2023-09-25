public class CallerInfo {
    public static String getCaller() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            StackTraceElement callerElement = stackTrace[2];
            return "Class: " + callerElement.getClassName() + ", Method: " + callerElement.getMethodName();
        }
        else {
            return null;
        }
    }
}
