package Chapter_3;

/* # 5 # корректное проектирование метода # TransferAction.java */

public class CorrectTransferAction {
    public boolean transferIntoAction(double asset, Account from, Account to) {
        if (asset <= 0 || from == null || to == null) {
            throw new IllegalArgumentException();
        }
        boolean isDone = false;
        double demand = from.getAsset() - asset;
        if (demand >= 0) {
            from.setAsset(demand);
            to.setAsset(asset);
            isDone = true;
        }
        return isDone;
    }
}
