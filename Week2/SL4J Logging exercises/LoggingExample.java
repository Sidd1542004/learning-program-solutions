import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class PaymentProcessor{
    private static final Logger logger=LoggerFactory.getLogger(PaymentProcessor.class);
    public static void main(String[] args){
        logger.info("Payment processing started...");
        logger.debug("Connecting to payment gateway...");
        logger.warn("Transaction taking longer than expected.");
        logger.error("Payment failed due to insufficient balance.");
    }
}
