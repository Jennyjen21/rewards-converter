public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashVaue) {
        this.cashValue = cashValue;
        this.milesValue = (int) Math.round(cashValue * 3500);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 3500.0;
    }

    public double getCasValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double convertMilesToCash() {
        return milesValue * 0.0035;
    }
}
