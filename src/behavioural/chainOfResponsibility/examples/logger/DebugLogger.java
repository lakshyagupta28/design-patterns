package behavioural.chainOfResponsibility.examples.logger;

public class DebugLogger extends LogHandler{
    @Override
    public boolean shouldHandleLog(LogLevel logLevel) {
        return logLevel==LogLevel.DEBUG;
    }
    @Override
    public void log(String message) {
        System.out.println("DEBUG:"+message);
    }
}
