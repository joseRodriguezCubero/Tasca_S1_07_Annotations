package n1exercici1;

public class PresentialWorker extends Worker{


    public PresentialWorker(String name, String surname, int payPerHour) {
        super(name, surname, payPerHour);
    }

    @SuppressWarnings("DeprecatedIsStillUsed")
    @Deprecated
    public void youAreFired(){
        System.out.println(super.getName() + "tenemos que hablar.");
    }

    @Override
    public int calculateIncome(int numberOfHours){
        int payPerHour = 15;
        return numberOfHours * payPerHour;
    }
}
