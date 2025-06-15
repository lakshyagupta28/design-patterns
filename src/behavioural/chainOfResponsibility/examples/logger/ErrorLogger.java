package behavioural.chainOfResponsibility.examples.logger;

public class ErrorLogger extends LogHandler{
    @Override
    public boolean shouldHandleLog(LogLevel logLevel) {
        return logLevel==LogLevel.ERROR;
    }

    @Override
    public void log(String message) {
        System.out.println("ERROR:"+message);

    }
}
