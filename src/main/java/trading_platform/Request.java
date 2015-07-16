package trading_platform;

/**
 * Title:           Request.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Request {
	private final int requestId;
	private static int counter = 0;
	private int parentRequestId;
	private int sharesFilled;
	private int shareholderId;
	private String requestDate;
	private boolean buySell;
	private Status status;
	private int stockExId;
	private int stockId;
	private int shares;
	private int minimumShares;
	private String timeInForce;
	private double limitPrice;
	private double stopPrice;
	
	public Request() { this.requestId = counter+=1; }
	
	public int getRequest_id() { return requestId; }
	public int getParent_request_id() { return parentRequestId; }
	public void setParent_request_id(int parent_request_id) { this.parentRequestId = parent_request_id; }
	public int getShares_filled() { return sharesFilled; }
	public void setShares_filled(int shares_filled) { this.sharesFilled = shares_filled; }
	public int getShareholder_id() { return shareholderId; }
	public void setShareholder_id(int shareholder_id) { this.shareholderId = shareholder_id; }
	public String getRequest_date() { return requestDate; }
	public void setRequest_date(String request_date) { this.requestDate = request_date; }
	public boolean isBuy_sell() { return buySell; }
	public void setBuy_sell(boolean buy_sell) { this.buySell = buy_sell; }
	public Status getStatus() { return status; }
	public void setStatus(Status status) { this.status = status; }
	public int getStock_ex_id() { return stockExId; }
	public void setStock_ex_id(int stock_ex_id) { this.stockExId = stock_ex_id; }
	public int getStock_id() { return stockId; }
	public void setStock_id(int stock_id) { this.stockId = stock_id; }
	public int getShares() { return shares; }
	public void setShares(int shares) { this.shares = shares; }
	public int getMinimum_shares() { return minimumShares; }
	public void setMinimum_shares(int minimum_shares) { this.minimumShares = minimum_shares; }
	public String getTime_in_force() { return timeInForce; }
	public void setTime_in_force(String time_in_force) { this.timeInForce = time_in_force; }
	public double getLimit_price() { return limitPrice; }
	public void setLimit_price(double limit_price) { this.limitPrice = limit_price; }
	public double getStop_price() { return stopPrice; }
	public void setStop_price(double stop_price) { this.stopPrice = stop_price; }
}