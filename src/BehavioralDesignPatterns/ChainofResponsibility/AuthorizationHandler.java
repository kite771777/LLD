package BehavioralDesignPatterns.ChainofResponsibility;

class AuthorizationHandler extends RequestHandler {
    @Override
    public boolean handle(String request) {
        if (!request.contains("ADMIN")) {
            System.out.println("❌ Authz Failed: You are not an Admin!");
            return false;
        }
        System.out.println("✅ Role Check Passed!");
        return passToNext(request);
    }
}
