package main.java;
public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }
    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }
    public double getCashValue() {
        return this.cashValue;
    }
    public double getMilesValue() {
        return this.milesValue;
    }
    private double convertCashToMiles(double cashValue) {
        return cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }
    private double convertMilesToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
}

