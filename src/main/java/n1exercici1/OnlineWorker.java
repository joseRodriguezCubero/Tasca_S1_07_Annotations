package n1exercici1;

public class OnlineWorker extends Worker {


    public OnlineWorker(String surname, String name, int payPerHour) {
        super(surname, name, payPerHour);
    }

   @Deprecated
    public void youAreFired(){
        System.out.println(super.getName()+" Siento decirte que estás despedido.");
    }

    @Override
    public int calculateIncome(){
        int payPerHour = 12;
        return 14 * payPerHour;
    }

}
