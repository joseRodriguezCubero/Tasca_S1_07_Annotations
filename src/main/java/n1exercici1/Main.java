package n1exercici1;

public class Main {
    public static void main(String[] args) {

         OnlineWorker worker1 = new OnlineWorker("Pedro","Rodríguez", 10);
         PresentialWorker worker2 = new PresentialWorker("Juan","Perez",14);
         Worker worker3 = new Worker("Miguel","Hernandez",7);
         GraphicDesigner worker4 = new GraphicDesigner("Alberto","Martinez", 15);

         System.out.println(worker1.calculateIncome(14));


         System.out.println(worker2.calculateIncome(14));


         System.out.println(worker3.calculateIncome(14));

        //noinspection deprecation
        worker1.youAreFired();


        //noinspection deprecation
        worker2.youAreFired();

        worker4.youAreFired();
    }
}
