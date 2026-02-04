public class Individual extends TaxPayer{

    private double healthExpenditures;

    public Individual() {
       super();
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax(){
        double total = 0.0;
        double gastosSaude = healthExpenditures * (50.0/100.0);
        if(getAnualIncome() < 20000.00){
            total = getAnualIncome() * (15.0/100.0);
        }
        else{
            total = getAnualIncome() * (25.0/100.0);
        }
        total = total - gastosSaude;
        return total;
    }

}
