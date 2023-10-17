package n1exercici1;

public class GraphicDesigner extends OnlineWorker{
    public GraphicDesigner(String name, String surname, int payPerHour) {
        super(name, surname, payPerHour);
    }
    @SuppressWarnings("deprecation")
    @Override
    public void youAreFired(){
        System.out.println("Mañana no vengas");
    }
}
