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

    public void selectStation(String station)
    {
        double stationSelected = Double.parseDouble(station);
        if (this.savedStations.contains(stationSelected))
        {
            if (this.band.equals("FM") && stationSelected >= 87.9 && stationSelected <= 107.9 || this.band.equals("AM") && stationSelected >= 530 && stationSelected <= 1610)
            {
                this.currentStation = stationSelected;
            }
            else if (this.band.equals("FM")) 
            {
                this.band = "AM";
            }
            else
            {
                this.band = "FM";
            }
        }
        else
        {
            System.out.println("Station not saved");
        }
    }

    public void nextStation()
    {
        if (this.band .equals("FM"))
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

    

}