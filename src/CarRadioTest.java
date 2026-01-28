
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.*;


public class CarRadioTest 
{
    private RadioInterface radio;

    @Before
    public void setUp()
    {
        radio = new CarRadio(); 
        radio.turnOn();
    }

    @Test
    public void testTurnOn()
    {
        assertTrue(radio.isOn());
    }

    @Test
    public void testTurnOff()
    {
        radio.turnOff();
        assertFalse(radio.isOn());
    }

    @Test
    public void testSwitchBand(){
        radio.switchBand("FM");
        assertEquals("AM", radio.getBand());
    }

    @Test
    public void testNextStation(){
        double initial = radio.getCurrentStation();
        radio.nextStation();   
        assertEquals(initial + 0.2, radio.getCurrentStation(), 0.2);
    }

    @Test
    public void testSaveAndSelectStation(){
        radio.saveStation("102.5");
        radio.selectStation("1");
        assertEquals(102.5, radio.getCurrentStation(), 0.01);
    }
}