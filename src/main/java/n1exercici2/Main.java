package n1exercici2;

import n1exercici1.OnlineWorker;
import n1exercici1.PresentialWorker;

public class Main {
    public static void main(String[] args) {

        OnlineWorker worker1 = new OnlineWorker("Pedro","Rodríguez", 10);
        PresentialWorker worker2 = new PresentialWorker("Juan","Perez",14);
        OnlineWorker worker3 = new OnlineWorker("Carlos","Ramírez",13);
        firingPeople(worker2,worker1);

        //noinspection deprecation
        worker3.youAreFired();
    }

    @SuppressWarnings("deprecation")
    public static void firingPeople(PresentialWorker worker1, OnlineWorker worker2) {
        worker1.youAreFired();
        worker2.youAreFired();
    }
}
