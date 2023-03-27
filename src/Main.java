public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee jennifer =  new SalariedEmployee("Jennifer", "11/11/1990", "03/03/2020",
                35000);

        System.out.println(jennifer);
        System.out.println("Age = " + jennifer.getAge());
        System.out.println("Pay = " + jennifer.collectPay());
        System.out.println("Jennifer's Paycheck = $" + jennifer.collectPay());

        jennifer.retire();
        System.out.println("Jennifer's Pension check = $" + jennifer.collectPay());




    }
}
