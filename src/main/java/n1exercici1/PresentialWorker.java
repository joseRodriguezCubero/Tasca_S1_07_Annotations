package n1exercici1;

public class PresentialWorker extends Worker{

    public static float gasoline = 2.5F;
    public PresentialWorker(String name, String surname, int payPerHour) {
        super(name, surname, payPerHour);
    }


    @Deprecated
    public void youAreFired(){
        System.out.println(super.getName() + ", tenemos que hablar.");
    }

    @Override
    public int calculateIncome(int hourPerMount){
        return (int) (super.calculateIncome(hourPerMount) + gasoline);
    }
}
