import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void testCanPrint(){
        assertEquals("Success! You have 50 pages left! Your toner levels are at: 50", printer.print(25, 2));
    }

    @Test
    public void testCannotPrint(){
        assertEquals("Add more paper to the paper tray or replace your toner!", printer.print(200, 1));
    }
}
