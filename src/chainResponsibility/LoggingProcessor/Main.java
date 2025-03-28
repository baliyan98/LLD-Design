package chainResponsibility.LoggingProcessor;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log("Info Received", LogProcessor.INFO);
        logProcessor.log("Debug Received", LogProcessor.DEBUG);
        logProcessor.log("Error Received", LogProcessor.ERROR);
    }
}
