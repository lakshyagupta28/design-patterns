package behavioural.chainOfResponsibility.examples.logger;

public abstract class LogHandler {
    LogHandler nextHandler;
    public abstract boolean shouldHandleLog(LogLevel logLevel);
    public abstract void log(String message);
    public void handle(LogLevel logLevel, String message)
    {
        if(shouldHandleLog(logLevel))
        {
            log(message);
        }
        else if(nextHandler != null)
        {
            nextHandler.handle(logLevel,message);
        }
    }
    public LogHandler setNextHandler(LogHandler nextHandler)
    {
        this.nextHandler=nextHandler;
        return nextHandler;
    }
}
