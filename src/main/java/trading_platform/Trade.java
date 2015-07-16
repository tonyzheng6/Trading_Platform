package trading_platform;

/**
 * Title:           Trade.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Trade {
	private final int tradeId;
	private static int counter = 0;
	private int stockId;
	private String transactionTime;
	private int shares;
	private int stockExId;
	private double priceTotal;
	private int buyerId;
	private int sellerId;
	private int buyBrokerId;
	private int sellBrokerId;
	private double sharePrice;
	private int buyRequestId;
	private int sellRequestId;
	
	public Trade() { this.tradeId = counter+= 1; }
	
	public int getTrade_id() { return tradeId; }
	public int getStock_id() { return stockId; }
	public void setStock_id(int stock_id) { this.stockId = stock_id; }
	public String getTransaction_time() { return transactionTime; }
	public void setTransaction_time(String transaction_time) { this.transactionTime = transaction_time; }
	public int getShares() { return shares; }
	public void setShares(int shares) { this.shares = shares; }
	public int getStock_ex_id() { return stockExId; }
	public void setStock_ex_id(int stock_ex_id) { this.stockExId = stock_ex_id; }
	public double getPrice_total() { return priceTotal; }
	public void setPrice_total(double price_total) { this.priceTotal = price_total; }
	public int getBuyer_id() { return buyerId; }
	public void setBuyer_id(int buyer_id) { this.buyerId = buyer_id; }
	public int getSeller_id() { return sellerId; }
	public void setSeller_id(int seller_id) { this.sellerId = seller_id; }
	public int getBuy_broker_id() { return buyBrokerId; }
	public void setBuy_broker_id(int buy_broker_id) { this.buyBrokerId = buy_broker_id; }
	public int getSell_broker_id() { return sellBrokerId; }
	public void setSell_broker_id(int sell_broker_id) { this.sellBrokerId = sell_broker_id; }
	public double getShare_price() { return sharePrice; }
	public void setShare_price(double share_price) { this.sharePrice = share_price; }
	public int getBuy_request_id() { return buyRequestId; }
	public void setBuy_request_id(int buy_request_id) { this.buyRequestId = buy_request_id; }
	public int getSell_request_id() { return sellRequestId; }
	public void setSell_request_id(int sell_request_id) { this.sellRequestId = sell_request_id; }
}