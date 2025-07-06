public class SalariedEmployee extends Employee{
   private final double WeeklySalary;

    SalariedEmployee(String FirstName, String LastName, String SocialSecurityNumber ,double WeeklySalary) {
        super(FirstName, LastName, SocialSecurityNumber);
        this.WeeklySalary = WeeklySalary;
    }

    @Override
    public double Earnings() {
        return WeeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried-Employee :" + "\n" + super.toString() ;
    }
}
