import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTestMain {

    public static void main(String[] args) {

        Logger logger =  LoggerFactory.getLogger(LogTestMain.class);
        logger.info("start");
    }

}
