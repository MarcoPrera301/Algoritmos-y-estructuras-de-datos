
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CarRadioTest 
{
    private RadioInterface radio;

    @BeforeEach
    void setUp()
    {
        radio = new CarRadio(); 
        radio.turnOn();
    }

    @Test
    void testTurnOn()
    {
        assertTrue(radio.isOn());
    }

    @Test
    void testTurnOff()
    {
        radio.turnOff();
        assertFalse(radio.isOn());
    }

    @Test
    void testSwitchBand(){
        radio.switchBand("FM");
        assertEquals("AM", radio.getBand());
    }

    @Test
    void testNextStation(){
        double initial = radio.getCurrentStation();
        radio.nextStation();   
        assertEquals(initial + 0.2, radio.getCurrentStation());
    }

    @Test
    void testSaveAndSelectStation(){
        radio.saveStation("102.5");
        radio.selectStation("1");
        assertEquals(102.5, radio.getCurrentStation(), 0.01);
    }
}