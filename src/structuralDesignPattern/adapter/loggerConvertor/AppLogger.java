package structuralDesignPattern.adapter.loggerConvertor;

interface AppLogger {
    void info(String message);
    void error(String message, Throwable t);
}
