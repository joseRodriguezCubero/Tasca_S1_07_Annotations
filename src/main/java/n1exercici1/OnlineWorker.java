package n1exercici1;

public class OnlineWorker extends Worker {

    public static final int TARIFAPLANA = 60;

    public OnlineWorker(String surname, String name, int payPerHour) {
        super(surname, name, payPerHour);
    }

   @Deprecated
    public void youAreFired(){
        System.out.println(super.getName()+" Siento decirte que estás despedido.");
    }

    @Override
    public int calculateIncome(int hours){
        super.payPerHour = 12;

        return 14 * payPerHour + TARIFAPLANA;
    }

}
