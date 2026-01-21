public class Main {
    public static void main(String[] args) {
        CarRadio carRadio = new CarRadio();
        Vista vista = new Vista(carRadio);
        vista.programLoop();

    }
}