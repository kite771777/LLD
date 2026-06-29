package BehavioralDesignPatterns.ChainofResponsibility;

class AuthenticationHandler extends RequestHandler {
    @Override
    public boolean handle(String request) {
        if (request.contains("NO_TOKEN")) {
            System.out.println("❌ Auth Failed: Token missing!");
            return false; // Chain yahan ruk jayegi (Short-circuit)
        }
        System.out.println("✅ Auth Passed!");
        return passToNext(request); // Aage bhej do
    }
}