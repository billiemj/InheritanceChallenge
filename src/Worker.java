import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        try {
            LocalDate birthDate = LocalDate.parse(this.birthDate, formatter);
            LocalDate endDate = LocalDate.parse(this.endDate, formatter);
            return (int) ChronoUnit.YEARS.between(birthDate, endDate);

        } catch (DateTimeParseException e){
            System.out.println("Invalid Date Format must be in format MM-dd-yyyy");
            return -1;
        }

    }
}
