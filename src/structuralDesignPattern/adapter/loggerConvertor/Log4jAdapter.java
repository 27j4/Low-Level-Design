package structuralDesignPattern.adapter.loggerConvertor;

class Log4jAdapter implements AppLogger {

    private Log4jLogger log4j;

    public Log4jAdapter(Log4jLogger log4j) {
        this.log4j = log4j;
    }

    @Override
    public void info(String message) {
        log4j.logInfo("[APP] " + message);
    }

    @Override
    public void error(String message, Throwable t) {
        log4j.logError("[APP] " + message, t);
    }
}
