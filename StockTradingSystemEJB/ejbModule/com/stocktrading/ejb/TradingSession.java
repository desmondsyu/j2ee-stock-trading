package com.stocktrading.ejb;

import java.util.List;

import jakarta.ejb.Local;

@Local
public interface TradingSession {
    void addStockToWatchList(String stockSymbol);
    void placeOrder(String stockSymbol, int quantity);
    List<String> getOrderHistory();
    List<String> getWatchList();
}
