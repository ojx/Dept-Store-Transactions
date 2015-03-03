import java.util.ArrayList;

public class DailyTransactions {
    //date in the form dd/mm/yyyy
    private String date;
    //contains all transactions in a single day, including sales and returns
    private Transaction[] allTransactions;

    public DailyTransactions(String date, Transaction[] allTransactions) {
        this.date = date;
        this.allTransactions = allTransactions;
    }

    public String getDate() {
        return date;
    }

    /**
     * @Precondition: allTransactions contains the day's transactions,
     *  each of which may be a Sale or a Return.
     * @Postcondition: An ArrayList of all the reasons for returning an
     *  item is returned.
     */
    public ArrayList<String> getReturnReasons() {
       /* part b */

        return null; //remove this line
    }

    /**
     * @Precondition: allTransactions contains the day's transactions,
     *  each of which may be a Sale or a Return.
     * @Postcondition: the largest cash sale is returned. If there are
     *  no cash sales, null is returned
     */
    public Transaction largestCashSale() {
        /* part c */

        return null; //remove this line
    }

    /**
     * @Precondition: allTransactions contains the day's transactions,
     *  each of which may be a Sale or a Return.
     * @Postcondition: Average of day's transactions returned.
     */
    public double findTransactionAverage() {
        /* part d */

        return 0.0; //remove this line
    }
}
