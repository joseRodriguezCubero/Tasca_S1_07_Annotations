package n1exercici1;

public class PresentialWorker extends Worker{


    public PresentialWorker(String name, String surname, int payPerHour) {
        super(name, surname, payPerHour);
    }


    @Deprecated
    public void youAreFired(){
        System.out.println(super.getName() + ", tenemos que hablar.");
    }

    @Override
    public int calculateIncome(){
        int payPerHour = 15;
        return 14 * payPerHour;
    }
}
