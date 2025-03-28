package chainResponsibility.LoggingProcessor;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String message, int logLevel) {
        if (logLevel == DEBUG) {
            System.out.println("Debug message is " + message);
        } else {
            super.log(message, logLevel);
        }
    }
}
