package behavioural.chainOfResponsibility.examples.logger;

public class InfoLogger extends LogHandler{
    @Override
    public boolean shouldHandleLog(LogLevel logLevel) {
        if(logLevel==LogLevel.INFO)
        {
            return true;
        }
        return false;
    }

    @Override
    public void log(String message) {
        System.out.println("INFO:"+message);
    }
}
