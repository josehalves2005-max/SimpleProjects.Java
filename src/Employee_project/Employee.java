package Employee_project;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double Tax;
    
    public double NetSalary(){
    return this.grossSalary - this.Tax;
    }
    public void IncreaseSalary(double percentage){
        grossSalary -= Tax;
        percentage = percentage * grossSalary;
        grossSalary += percentage / 100;
    
    }
    
    public String text(){
        return "update data: "
        + name
        +", "
        +"$ "
        + grossSalary;
    }


}
