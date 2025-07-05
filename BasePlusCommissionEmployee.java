public class BasePlusCommissionEmployee extends CommisionEmployee  {
     protected double BaseSalary;
    BasePlusCommissionEmployee(String FirstName, String LastName, String SocialSecurityNumber, double GrossSales, double ComissionRate , double BaseSalary) {
        super(FirstName, LastName, SocialSecurityNumber, GrossSales, ComissionRate);
        this.BaseSalary = BaseSalary;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }


    public double Earnings()
    {

        return BaseSalary + GrossSales*CommisionRate;
    }

    public void setBaseSalary(double BaseSalary) {
        this.BaseSalary = BaseSalary;
    }
    public String toString() {
        return "Base-Commission-Employee :" + "\n" + "Name :" +getFirstName()+" "  + getLastName() + "\n"+"Security-Code :"+ getSocialSecurityNumber()+"\n"+"Gross-Sales : "+getGrossSales() +"\n" +"Base-Salary : "+getBaseSalary();
    }
}
