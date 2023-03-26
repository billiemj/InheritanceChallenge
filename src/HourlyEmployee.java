public class HourlyEmployee {
    private double hourlyPayRate;

    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    private void getDoublePay(){
        System.out.printf("Double Pay is %.2f", hourlyPayRate * 2);
    }
}
