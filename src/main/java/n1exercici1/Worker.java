package n1exercici1;

public abstract class Worker {

    private int payPerHour;
    private String name;
    private String surname;
    public Worker(String surname, String name, int payPerHour) {
        this.surname = surname;
        this.name = name;
        this.payPerHour = payPerHour;
    }

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

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int calculateIncome(int hours) {
        return hours * payPerHour;
    }

}


