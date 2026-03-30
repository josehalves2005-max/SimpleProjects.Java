package sistema_bancario.application;

public class Account {

private int number;
private String name;
private double deposit = 0.00;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialValue){
        this.number = number;
        this.name = name;
        Addeposit(initialValue);
    }

    public int getNumber() {
        return number;
    }
    
    public String getName() {
        return name;
    }

    public double getDeposit() {
        return deposit;
    }

    
    public void setName(String name) {
        this.name = name;
    }

        
    public void Addeposit(double amount){
        this.deposit += amount;
    }
    
    public void removeDeposit(double amount){
        this.deposit -= amount + 5.00;
    }
        
    

    public String toString(){
        return "Account "
                + number
                + ", "
                + String.format("Holder: %s", name)
                + ", "
                + String.format("Balance: %.2f", deposit);
                
    }
 

}

    


