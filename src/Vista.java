
import java.util.Scanner;

public class Vista 
{
    private Scanner sc;
    private CarRadio carRadio;

    public Vista(CarRadio carRadio)
    {
        this.sc = new Scanner(System.in);
        this.carRadio = carRadio;
    }

    public void showRadioOff()
    {
            System.out.println("+------+----------------------+");
            System.out.println("| :::: |  [                 ] |");
            System.out.println("| :::: |----------------------|");
            System.out.println("| :::: |     Next station     |");
            System.out.println("| :::: |     Status = Off     |");
            System.out.println("+------+----------------------+");
            System.out.println("1)PowerOn");
            System.out.println("2)Change Band");
            System.out.println("3)Next Station");
            System.out.println("4)Save Station");
            System.out.println("5)Select Station");
            System.out.println("6)PowerOff");
            System.out.println(">>>");
    }

    public void showRadioOn()
    {
            System.out.println("+------+----------------------+");
            System.out.println("| :::: |  [     87.9 FM     ] |");
            System.out.println("| :::: |----------------------|");
            System.out.println("| :::: |     Next station     |");
            System.out.println("| :::: |     Status = On      |");
            System.out.println("+------+----------------------+");
            System.out.println("1)PowerOn");
            System.out.println("2)Change Band");
            System.out.println("3)Next Station");
            System.out.println("4)Save Station");
            System.out.println("5)Select Station");
            System.out.println("6)PowerOff");
            System.out.println(">>>");
    }

    public void showRadioGeneral()
    {
            System.out.println("+------+----------------------+");
            System.out.println("| :::: |  [ " + carRadio.getCurrentStation() + " " + carRadio.getBand() + " ]       |");
            System.out.println("| :::: |----------------------|");
            System.out.println("| :::: |     Next station     |");
            System.out.println("| :::: |     Status = On      |");
            System.out.println("+------+----------------------+");
            System.out.println("1)PowerOn");
            System.out.println("2)Change Band");
            System.out.println("3)Next Station");
            System.out.println("4)Save Station");
            System.out.println("5)Select Station");
            System.out.println("6)PowerOff");
            System.out.println(">>>");
    }

    public int askOption()
    {
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }


    public void programLoop()
    {
        showRadioOff();

        int selection = askOption();

        while (selection != 6)
        {

        switch (selection)
        {

            case 1:
                carRadio.turnOn();
                showRadioOn();
                break;
            case 2:
                String actualBand = carRadio.getBand();
                carRadio.switchBand(actualBand);
                showRadioGeneral();
                break;
            case 3:
                carRadio.nextStation();
                showRadioGeneral();
                break;
            case 4:
                System.out.println("Enter station to save:");
                String station = sc.next();
                carRadio.saveStation(String.valueOf(station+1));
                showRadioGeneral();
                break;
            case 5:
                System.out.println("Enter button to select:");
                String selectedStation = sc.nextLine();
                carRadio.selectStation(String.valueOf(selectedStation+1));
                showRadioGeneral();
                break;
            default:
                System.out.println("Invalid option");
        }
        selection = askOption();
        }
        carRadio.turnOff();
        showRadioOff();
    }
        
    }