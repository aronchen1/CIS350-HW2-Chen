import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import sun.java2d.pipe.SpanShapeRenderer;

public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.add(1, 1), 2);
    }
    @Test
    public void testSub() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.sub(1, 1), 0);
    }
    @Test
    public void testMul() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.mul(3, 5), 15);
    }
    @Test
    public void testDiv() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.div(8, 2), 4);
    }

    //modulo
    @Test
    public void testMod() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.mod(5,2),1);
    }

    @Test
    public void testSqaureRoot(){
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.squareRoot(9),3);
    }


}
