package OOP;

public class StockPortfolio extends Stock {
    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.readJsonFile();
        stockPortfolio.calculateValue();
        stockPortfolio.writeToJsonFile();
    }
}


