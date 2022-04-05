package OOP;

public class StockPropertiesMap {
    String shareName;
    long noOfShare;
    long sharePrice;
    long totalValue;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public long getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(long noOfShare) {
        this.noOfShare = noOfShare;
    }

    public long getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(long sharePrice) {
        this.sharePrice = sharePrice;
    }

    public long getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(long totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "StockPropertiesMap{" +
                "shareName='" + shareName + '\'' +
                ", noOfShare=" + noOfShare +
                ", sharePrice=" + sharePrice +
                ", totalValue=" + totalValue +
                '}';
    }
}
