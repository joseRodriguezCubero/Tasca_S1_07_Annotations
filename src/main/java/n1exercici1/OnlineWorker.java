package n1exercici1;

public class OnlineWorker extends Worker{

    public OnlineWorker(String name, String surname, int payPerHour) {
        super(name, surname, payPerHour);
    }

    @SuppressWarnings("DeprecatedIsStillUsed")
    @Deprecated
    public void youAreFired(){
        System.out.println("Siento decirte que estás despedido");
    }

    @Override
    public int calculateIncome(int numberOfHours){
        int payPerHour = 12;
        return numberOfHours * payPerHour;
    }
}
