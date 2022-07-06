package lesson6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

double result = Calculator.calculate(6,3, null);
logger.info("result: " + result);

//        System.out.println("The result is: " + result);

//        result = Calculator.calculate(4,3, Calculator.Type.SUBTRACTION);
//        System.out.println("The result is: " + result);

//       try {
//        result = Calculator.calculate(6,3, null);
//           System.out.println("The result is: " + result);
 //      }
//       catch (Exception error) {
//           System.out.println("Something bad has happened");
////       }

        result = Calculator.calculate(10,5, Calculator.Type.MULTIPLICATION);
        logger.info("result: " + result);
//        System.out.println("The result is: " + result);
}
}