public class Transaction {
    //instance fields
    private String myDescription;
    private int myNumItems;
    private double myItemCost;

    //constant
    public static final double TAX_RATE = 0.07;

    //constructor
    public Transaction(String description, int numItems, double itemCost)  {
        myDescription = description;
        myNumItems = numItems;
        myItemCost = itemCost;
    }

    //accessors
    public String getDescription() {
        return myDescription;
    }

    public int getNumItems() {
        return myNumItems;
    }

    public double getItemCost() {
        return myItemCost;
    }

    public double getTotal() {
        double cost = myNumItems * myItemCost;
        double tax = cost * TAX_RATE;
        return Math.round((cost + tax) * 100) / 100.0;
    }
}
