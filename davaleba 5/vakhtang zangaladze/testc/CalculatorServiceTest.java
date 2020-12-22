import org.testng.annotations.Test;
import test.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    @Test
    public void sumTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(8.00, calculatorService.sum(4,2.00), 0);
    }

    @Test
    public void prodTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(8.00, calculatorService.prod(4,2.00), 0);
    }

    }

}
