package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;

/**
 * Session Bean implementation class TradingSessionBean
 */
@Stateful
@LocalBean
public class TradingSessionBean {

	/**
	 * Default constructor.
	 */
	public TradingSessionBean() {
		// TODO Auto-generated constructor stub
	}

	private List<String> watchList = new ArrayList<>();
	private List<String> orderHistory = new ArrayList<>();

	public void addStockToWatchList(String stockSymbol) {
		watchList.add(stockSymbol);
	}

	public void placeOrder(String stockSymbol, int quantity) {
		orderHistory.add("Order: " + stockSymbol + " x " + quantity);
	}

	public List<String> getOrderHistory() {
		return orderHistory;
	}
}
