import java.util.ArrayList;
import java.util.List;


public class CarRadio implements Radio
{
    private boolean isOn;
    private String band;
    private double currentStation;
    private List<Double> savedStations;
    
    public CarRadio()
    {
        this.isOn = false;
        this.band = "FM";
        this.currentStation = 101.1;
        this.savedStations = new ArrayList<>();
    }

    public void turnOn()
    {
        this.isOn = true;
    }

    public void turnOff()
    {
        this.isOn = false;
    }

    public boolean isOn()
    {
        return this.isOn;
    }

    public void switchBand(String band)
    {
        if (band.equals("FM"))
        {
            this.band = "AM";
        }
        else
        {
            this.band = "FM";
        }
    }

    public String getBand()
    {
        return this.band;
    }

    public void saveStation(String station)
    {
        double stationSelected = Double.parseDouble(station); //hacer metodo de validacion
        this.savedStations.add(stationSelected);
    }


    

}