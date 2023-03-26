public class SalariedEmployee {
    private double annualSalary;
    private boolean  isRetired;

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    private void retire () {

        isRetired = true;
        System.out.println("Employee is retired");

    }


}
