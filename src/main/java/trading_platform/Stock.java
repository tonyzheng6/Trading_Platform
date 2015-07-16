package trading_platform;

/**
 * Title:           Stock.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Stock {
    private final int stockId;
    private static int counter = 0;
    private int shares;
    private double startingPrice;

    public Stock() { this.stockId = counter+=1; }

    public int getStock_id() { return stockId; }
    public double getStarting_price() { return startingPrice; }
    public void setStarting_price(double starting_price) { this.startingPrice = starting_price; }
    public int getShares() { return shares; }
    public void setShares(int shares) { this.shares = shares; }
}
