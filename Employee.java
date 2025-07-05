public abstract  class Employee {
    protected String FirstName ;
    protected  String LastName;
    private String SocialSecurityNumber;

    Employee(String FirstName , String LastName , String SocialSecurityNumber)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SocialSecurityNumber = SocialSecurityNumber;

    }
    public String getFirstName()
    {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public abstract double Earnings();
    @Override
    public String toString() {
       return "Name : " +getFirstName()+" "+ getLastName()+" \n"+"Security-Code : " + getSocialSecurityNumber();
    }


}

