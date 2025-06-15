package behavioural.chainOfResponsibility.examples.logger;

public class WarnLogger extends LogHandler{
    @Override
    public boolean shouldHandleLog(LogLevel logLevel) {
        return logLevel==LogLevel.WARN;
    }
    @Override
    public void log(String message) {
        System.out.println("WARN:"+message);
    }
}
