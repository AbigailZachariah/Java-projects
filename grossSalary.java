import java.util.Scanner;

class Employee{
    String empName;
    String empAdd;
    double Salary;
    double HRA;
    double TA;
    double grossSal;

    void display(){
        System.out.println("Name:"+empName);
        System.out.println("Address:"+empAdd);
        System.out.println("Salary:"+Salary);
        System.out.println("HRA:"+HRA);
        System.out.println("TA:"+TA);
        System.out.println("Gross Salary:"+grossSal);
    }
}
public class grossSalary {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Employee EMP=new Employee();

        System.out.print("Enter employee name:");
        EMP.empName=sc.nextLine();

        System.out.print("Enter the employee address:");
        EMP.empAdd=sc.nextLine();

        System.out.print("Enter the employee salary:");
        EMP.Salary=sc.nextDouble();

        EMP.HRA=25.0/100*EMP.Salary; // 25% of salary
        EMP.TA=30.0/100*EMP.Salary;  //30% of salary
        EMP.grossSal=EMP.Salary+EMP.HRA+EMP.TA;
        EMP.display();
        sc.close();

    }
}
    
