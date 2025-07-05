import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
       employees[0] = new SalariedEmployee("Emon" , "Mahmud" , "111-101",5000);
       employees[1] = new HourlyEmployee("Siam", "Mahmud" ,"103-121",500 , 43);
       employees[2] = new CommisionEmployee("LIO" , "MESSI" ,"999-222" , 20 , 5000 );
       employees[3] = new BasePlusCommissionEmployee("CR7" , "RONALDO" , "133-877" ,5000 , 20 , 20000);

        System.out.println("=========== Account Details ===========");
       for(Employee emp : employees)
       {
           if(emp instanceof BasePlusCommissionEmployee)
           {
               BasePlusCommissionEmployee bpce = (BasePlusCommissionEmployee) emp;
               bpce.setBaseSalary(bpce.getBaseSalary() * 1.10);

           }

               System.out.println();
               System.out.println(emp.toString());

               System.out.print("Total Earning : ");
               System.out.println(emp.Earnings());

       }


    }
}