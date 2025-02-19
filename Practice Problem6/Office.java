class Employee 
{
    String name;
    String department;
    int id;

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    public double calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + department + ", ID: " + id;
    }
}

class FulltimeEmployee extends Employee 
{
    double fixedSalary;

    public FulltimeEmployee(String name, String department, int id, double fixedSalary) {
        super(name, department, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculatePay() 
    {
        return fixedSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fixed Salary: BDT" + fixedSalary + ", Pay: BDT" + calculatePay();
    }
}

class ParttimeEmployee extends Employee
{
    double hourlyRate;
    int hoursWorked;

    public ParttimeEmployee(String name, String department, int id, double hourlyRate, int hoursWorked) {
        super(name, department, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: BDT" + hourlyRate + ", Hours Worked: " + hoursWorked + ", Pay: BDT" + calculatePay();
    }
}

class ContractEmployee extends Employee 
{
    String projectName;
    double contractAmount;

    public ContractEmployee(String name, String department, int id, String projectName, double contractAmount) {
        super(name, department, id);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Project: " + projectName + ", Contract Amount: BDT" + contractAmount + ", Pay: BDT" + calculatePay();
    }
}

public class Office
{
    public static void main(String[] args) 
    {
        FulltimeEmployee fullTime = new FulltimeEmployee("John Doe", "Engineering", 101, 50000);
        ParttimeEmployee partTime = new ParttimeEmployee("Jane Smith", "HR", 102, 100, 30);
        ContractEmployee contractEmp = new ContractEmployee("Alice Johnson", "Marketing", 103, "ProjectX", 10000);

        System.out.println(fullTime + "\n");
        System.out.println(partTime + "\n");
        System.out.println(contractEmp);
    }
}
