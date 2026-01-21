import java.util.ArrayList;
import java.util.List;


public class CarRadio implements Radio
{
    private boolean isOn;
    private String band1;
    private double currentStation;
    private List<Double> savedStations;
    
    public CarRadio()
    {
        this.isOn = false;
        this.band1 = "FM";
        this.currentStation = 87.9;
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
            this.band1 = "AM";
        }
        else
        {
            this.band1 = "FM";
        }
    }

    public String getBand()
    {
        return this.band1;
    }

    public void saveStation(String station)
    {
        double stationSelected = Double.parseDouble(station); //hacer metodo de validacion
        this.savedStations.add(stationSelected);
    }

    public void selectStation(String station)
    {
       //arreglar esto
    }

    public void nextStation()
    {
        if (this.band1.equals("FM"))
        {
            this.currentStation += 0.2;
            if (this.currentStation > 107.9)
                {
                    this.currentStation = 87.9;
                }
            
        }
        else
        {
            this.currentStation += 10;
            if (this.currentStation > 1610)
            {
                this.currentStation = 530;
            }
        }
    }

    public double getCurrentStation()
    {
        return this.currentStation;
    }

    

}