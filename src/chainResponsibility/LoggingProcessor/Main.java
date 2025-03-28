package chainResponsibility.LoggingProcessor;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log("Info Received", 1);
        logProcessor.log("Debug Received", 2);
        logProcessor.log("Error Received", 3);
    }
}
