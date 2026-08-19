package entities;

public class Individual extends TaxPayer{

    private Double healthExpendures;

    public Individual(){
        super();
    }

    public Individual(Double anualIncome, String name, Double healthExpendures) {
        super(anualIncome, name);
        this.healthExpendures = healthExpendures;
    }

    public Double getHealthExpendures() {
        return healthExpendures;
    }

    public void setHealthExpendures(Double healthExpendures) {
        this.healthExpendures = healthExpendures;
    }

    @Override
    public Double tax() {

        Double taxRate;

        if (getAnualIncome() <= 20000.00) {
            taxRate = getAnualIncome() * 0.15;
        }
        else {
            taxRate = getAnualIncome() * 0.25;
        }

        double healthDeduction = getHealthExpendures() * 0.50;

        return taxRate - healthDeduction;
        }

}
