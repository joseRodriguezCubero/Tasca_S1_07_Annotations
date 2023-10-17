package n1exercici1;

public class Worker {

    private String surname;
    private String name;
    private final int payPerHour;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public Worker(String name, String surname, int payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int calculateIncome(int numberOfHours){
        return numberOfHours * this.payPerHour;
    }
}


