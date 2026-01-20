public class Vista 
{
    public void showRadio()
    {
        if (radio.isOn()) 
        {
            System.out.println("+------+----------------------+");
            System.out.println("| :::: |  [  87.9 FM Radio ]  |");
            System.out.println("| :::: |----------------------|");
            System.out.println("| :::: |     Next station     |");
            System.out.println("+------+----------------------+");
        }
    }
}