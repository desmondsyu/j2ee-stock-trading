package com.stocktrading.ejb;
import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class StockTransactionBean
 */
@Stateless
@LocalBean
public class StockTransactionBean {

	@EJB
	private MarketDataManager marketDataManager;

	/**
	 * Default constructor.
	 */
	public StockTransactionBean() {
		// TODO Auto-generated constructor stub
	}

	public String executeTrade(String stockSymbol, int quantity, String orderType) {
		double price = marketDataManager.getPrice(stockSymbol);
		return "Trade executed: " + orderType + " " + quantity + " " + stockSymbol + " at $" + price;
	}

	public double getStockPrice(String stockSymbol) {
		return marketDataManager.getPrice(stockSymbol);
	}
}
