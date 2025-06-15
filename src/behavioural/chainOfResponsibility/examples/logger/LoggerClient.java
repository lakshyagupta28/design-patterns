package behavioural.chainOfResponsibility.examples.logger;

public class LoggerClient {
    public static void main(String[] args) {

        LogHandler loggerChain =new InfoLogger();
        loggerChain.setNextHandler(new DebugLogger())
                .setNextHandler(new WarnLogger())
                .setNextHandler(new ErrorLogger());
        loggerChain.handle(LogLevel.INFO,"This is an info log");
        loggerChain.handle(LogLevel.DEBUG,"This is a debug log");
        loggerChain.handle(LogLevel.WARN,"This is a warn log");
        loggerChain.handle(LogLevel.ERROR,"This is an error log");

    }
}

/*
UML Diagram

LOGGER CLIENT            LOG HANDLER <abstract class>
             --------->  # nextHandler  (stores the reference to the next handler)
+LOG HANDLER             + setNextHandler(LogHandler)  (sets nextHandler)
                         + handle(loglevel,message)    (executes log handling)
                         # shouldHandleLog             (determines we are at correct log level)
                         # log                         (actually prints the log with correct formatting)


LOG LEVEL:

info log
debug log
error log
warn log

 */