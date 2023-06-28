package Chapter_3;

// # 4 # некачественный способ создания метода перевода денег со счета на счет TransferAction.java
public class TransferAction {
    private Account from;
    private Account to;
    private double transferAsset;
    private boolean isDone;

    public TransferAction(double asset, Account from, Account to) {
        if (asset > 0 && from != null && to != null) {
            this.transferAsset = asset;
            this.from = from;
            this.to = to;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void transferIntoAccount() {
        double demand = from.getAsset() - transferAsset;
        if (demand >= 0) {
            from.setAsset(demand);
            to.setAsset(transferAsset);
            isDone = true;
        }
    }
}
