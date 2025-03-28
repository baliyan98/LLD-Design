package chainResponsibility.LoggingProcessor;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String message, int logLevel) {
        if (logLevel == INFO) {
            System.out.println("Info message is " + message);
        } else {
            super.log(message, logLevel);
        }
    }
}
