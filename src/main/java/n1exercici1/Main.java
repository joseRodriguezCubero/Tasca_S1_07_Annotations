package n1exercici1;



public class Main {

    public static void main(String[] args) {

        OnlineWorker worker1 = new OnlineWorker("Pedro","Rodríguez", 10);
        PresentialWorker worker2 = new PresentialWorker("Juan","Perez",14);
        System.out.println(worker1.calculateIncome());
        System.out.println(worker2.calculateIncome());

    }

}
