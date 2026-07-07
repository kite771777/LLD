package AdditionalPattern;

class LoggerFactory {
    public static Logger getLogger(boolean enableLogging) {
        if (enableLogging) {
            return new ConsoleLogger();
        }
        // ❌ RETURN NULL MAT KARO
        // return null;

        // ✅ RETURN NULL OBJECT
        return new NullLogger();
    }
}

