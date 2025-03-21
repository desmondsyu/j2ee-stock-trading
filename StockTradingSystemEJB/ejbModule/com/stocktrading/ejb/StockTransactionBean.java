package com.stocktrading.ejb;

import jakarta.annotation.Resource;
import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jms.JMSContext;
import jakarta.jms.Queue;

/**
 * Session Bean implementation class StockTransactionBean
 */
@Stateless
@LocalBean
public class StockTransactionBean {

	@EJB
	private MarketDataManager marketDataManager;

	// ✅ Inject the JMS Queue
	@Resource(lookup = "java:/jms/queue/TradeQueue")
	private Queue tradeQueue;

	@Inject
	private JMSContext jmsContext;

	/**
	 * Default constructor.
	 */
	public StockTransactionBean() {
		// Default constructor
	}

	public String executeTrade(String stockSymbol, int quantity, String orderType) {
		double price = marketDataManager.getPrice(stockSymbol);
		String tradeMessage = "Trade executed: " + orderType + " " + quantity + " " + stockSymbol + " at $" + price;

		// ✅ Send trade message to the JMS queue
		jmsContext.createProducer().send(tradeQueue, tradeMessage);

		return tradeMessage;
	}

	public double getStockPrice(String stockSymbol) {
		return marketDataManager.getPrice(stockSymbol);
	}
}
