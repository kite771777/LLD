package BehavioralDesignPatterns.ChainofResponsibility;

// 1️⃣ HANDLER ABSTRACT CLASS (Chain ka base)
abstract class RequestHandler {
    protected RequestHandler nextHandler;

    // Chain banane ke liye method (Return type this rakhna achha hai chaining ke liye)
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Ye method sab implement karenge
    public abstract boolean handle(String request);

    // Helper method to pass the request to the next guy in chain
    protected boolean passToNext(String request) {
        if (nextHandler != null) {
            return nextHandler.handle(request);
        }
        // Agar chain khatam ho gayi aur yahan tak aa gaye, matlab sab paas ho gaya!
        return true;
    }
}