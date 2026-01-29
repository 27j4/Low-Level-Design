package structuralDesignPattern.adapter.loggerConvertor;

class Log4jLogger {

    public void logInfo(String msg) {
        System.out.println("LOG4J INFO: " + msg);
    }

    public void logError(String msg, Throwable t) {
        System.out.println("LOG4J ERROR: " + msg);
//        t.printStackTrace();
    }
}
