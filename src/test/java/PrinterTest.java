
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    Printer printer2;

    @Before
    public void before(){
        printer = new Printer(50, 100);
        printer2 = new Printer(6, 10);
    }

    @Test
    public void reducePages(){
        printer.print(2, 1);
        assertEquals(48, printer.getPaper());
    }

    @Test
    public void notEnoughPaper(){
        printer2.print(4, 2);
        assertEquals(6, printer2.getPaper());
    }

    @Test
    public void reduceToner(){
        printer.print(10, 2);
        assertEquals(80, printer.getTonerVolume());

    }







}
