public class Return extends Transaction {
    private String reason;

    public Return(String description, int numItems, double itemCost, String reason) {
        super(description, numItems, itemCost);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public double getTotal() {
        return 0 - super.getTotal();
    }
}
