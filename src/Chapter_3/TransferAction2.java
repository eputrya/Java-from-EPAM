package Chapter_3;

// # 11 # статические метод и поле # TransferAction.java

public class TransferAction2 {
    public static int taxRate = 12; // static field
    private double amountTaxes; // non static field

    public double getAmountTaxes() { // non static method
        return amountTaxes;
    }

    public static void increaseTaxRate() { // static method
        // this cannot be used - the object does not exist
        // anountTaxes cannot be used - the object does not exist
        /* methods getAmountTaxes() and transferIntoAccount() cannot be called -
        the object does not exist */
        taxRate++;
    }

    public boolean transferIntoAccount(double asset, Account from, Account to) {
        if (asset <= 0 || from == null || to == null) {
            throw new IllegalArgumentException(); // or custom exception
        }
        boolean isDone = false;
        double currentAmountTaxes = asset / taxRate;
        amountTaxes += currentAmountTaxes;
        double demand = from.getAsset() - asset * (1 + currentAmountTaxes);
        if (demand >= 0) {
            from.setAsset(demand);
            to.setAsset(asset);
            isDone = true;
        }
        return isDone;
    }
}
