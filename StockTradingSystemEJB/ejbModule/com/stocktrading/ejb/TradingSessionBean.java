package com.stocktrading.ejb;

import java.util.ArrayList;
import java.util.List;
import jakarta.ejb.Local;
import jakarta.ejb.Stateful;

@Stateful
@Local(TradingSession.class)  // ✅ Ensure the EJB is registered
public class TradingSessionBean implements TradingSession {

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

	public List<String> getWatchList() {
		return watchList;
	}
}
