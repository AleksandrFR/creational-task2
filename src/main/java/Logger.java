import java.util.Date;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + new Date(System.currentTimeMillis()) + " " + num++ + "]  " + msg);
    }

    private static final Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }
}
