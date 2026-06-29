package BehavioralDesignPatterns.ChainofResponsibility;

class ValidationHandler extends RequestHandler {
    @Override
    public boolean handle(String request) {
        if (request.contains("INVALID_DATA")) {
            System.out.println("❌ Validation Failed: Bad Payload!");
            return false;
        }
        System.out.println("✅ Validation Passed! Payload is clean.");
        return passToNext(request);
    }
}
