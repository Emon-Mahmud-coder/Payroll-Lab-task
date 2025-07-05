public class CommisionEmployee extends Employee {
   protected double GrossSales;
   protected final double CommisionRate ;

    CommisionEmployee(String FirstName, String LastName, String SocialSecurityNumber , double GrossSales ,double ComissionRate) {

        super(FirstName, LastName, SocialSecurityNumber);
        this.CommisionRate = ComissionRate;
        this.GrossSales = GrossSales;

    }
    public double getGrossSales() {
        return GrossSales;
    }

    @Override
    public double Earnings() {
        return GrossSales*CommisionRate;
    }
    @Override
    public String toString() {
        return "Commission-Employee : " +"\n"+ super.toString() +"\n" + "Gross-Sales : " + getGrossSales();
    }


}
