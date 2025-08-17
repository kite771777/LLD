package BehavioralDesignPatterns.LoggingSystem;

public class Client {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "error happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this");
        logObject.log(LogProcessor.INFO, "just for info");
    }
}

/*
when call logObject.log(...), the request goes like this:

        If INFO → handled by InfoLogProcessor.

        If not, passed to DebugLogProcessor.

        If not, passed to ErrorLogProcessor.

        If none can handle, request dies (since last handler has null).


         ┌───────────────────┐      ┌─────────────────────┐      ┌────────────────────┐
         │ InfoLogProcessor  │ ───▶ │ DebugLogProcessor   │ ───▶ │ ErrorLogProcessor  │
         └───────────────────┘      └─────────────────────┘      └────────────────────┘
                 │                          │                           │
            Handles INFO                Handles DEBUG               Handles ERROR
                 │                          │                           │
                 ▼                          ▼                           ▼
           Prints INFO msg            Prints DEBUG msg            Prints ERROR msg
*/