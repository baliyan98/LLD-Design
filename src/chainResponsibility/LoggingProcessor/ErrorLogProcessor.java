package chainResponsibility.LoggingProcessor;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String message, int logLevel) {
        if (logLevel == ERROR) {
            System.out.println("Error message is " + message);
        } else {
            super.log(message, logLevel);
        }
    }
}
