public class HourlyEmployee extends Employee{

      private final double  HourlyWage;
      private double  HoursWorked;

    HourlyEmployee(String FirstName, String LastName, String SocialSecurityNumber , double HourlyWage , double HoursWorked) {
        super(FirstName, LastName, SocialSecurityNumber);
        this.HourlyWage = HourlyWage;
        this.HoursWorked = HoursWorked;

    }

    @Override
    public double Earnings() {
        if(HoursWorked <= 40.0)
        {
            return HoursWorked*HourlyWage;
        }else {
            return HourlyWage*40+ (HoursWorked-40)*HourlyWage*1.5;
        }
    }

    @Override
    public String toString() {
        return "Hourly-Employee :" +"\n"+ super.toString() ;
    }
}
