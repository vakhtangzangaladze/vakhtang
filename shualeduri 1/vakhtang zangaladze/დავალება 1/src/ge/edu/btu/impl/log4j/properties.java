package ge.edu.btu.impl.log4j;

import ge.edu.btu.impl.CurrencyServiceImpl;

import java.util.logging.Logger;

public class properties {

    public static class Log4J extends CurrencyServiceImpl {
        private final System.Logger logger = (System.Logger) Logger.getLogger(String.valueOf(Log4J.class));

        @Override
        protected void beforeTransfer(long amount) {
            logger.log(System.Logger.Level.valueOf("იცვლება  " + amount + "₾\n."));
        }

        @Override
        protected void afterTransfer(long amount, boolean outcome) {
            logger.log(
                    System.Logger.Level.valueOf("გადაიცვალა " + amount + "₾\n დასრულდა წარმატებით ! " + outcome + "."));
        }
    }
}
