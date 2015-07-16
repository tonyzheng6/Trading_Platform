package trading_platform;

import java.util.*;

/**
 * Title:           Company.java
 * Authors:         Tony Zheng
 * Created on:      7/13/2015
 * Description:
 * Build with:      IntelliJ (or some other IDE) or using the following commands
 *                  To compile: Javac *.java
 *                  To run:     java TradingPlatform
 */
public class Company {

	private final int companyId;
	private static int counter = 0;
	private String companyName;
	private List<Stock> stockList = new ArrayList<Stock>();
	    
	public Company() { this.companyId = counter+=1; }
	
	public int getCompany_id() { return companyId; }
	public String getCompany_name() { return companyName; }
	public void setCompany_name(String company_name) { this.companyName = company_name; }
	public List<Stock> getStockList() { return stockList; }

	public void issueStock() {

	}
}