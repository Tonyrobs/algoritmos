public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){
        double total = 0.0;
        if(numberOfEmployees >= 10){
            total = getAnualIncome() * (14.0/100.0);
        }
        else{
            total = getAnualIncome() * (16.0/100.0);
        }
        return total;
    }

}
