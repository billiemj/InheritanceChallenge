import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;

    //endDate is used in a method in a subclass, protected allows subclass to access.
    protected String endDate;

    // adding default constructor to give subclasses more flexibility
    // also when using extends won't give an error  because we created the default constructor for Worker so
    // Java can create a default constructor for Employee, with its own implied call to the empty constructor.

    public Worker () {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return currentYear - birthYear;
    }

    // overwritten by subclasses that can figure out the right pay to return
    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
