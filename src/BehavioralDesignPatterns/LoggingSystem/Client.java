package BehavioralDesignPatterns.LoggingSystem;

public class Client {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "error happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this");
        logObject.log(LogProcessor.INFO, "just for info");
    }
}
