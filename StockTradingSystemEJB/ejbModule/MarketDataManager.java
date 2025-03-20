import jakarta.ejb.*;
import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

/**
 * Session Bean implementation class MarketDataManager
 */
@Singleton
@Startup
public class MarketDataManager {

	private Map<String, Double> stockPrices = new HashMap<>();

	@PostConstruct
	public void initializeStockData() {
		stockPrices.put("AAPL", 150.00);
		stockPrices.put("GOOGL", 2800.00);
	}


	@Schedule(hour = "*", minute = "*/1", persistent = false)
	public void updateStockPrices() {
		stockPrices.replaceAll((stock, price) -> price * (Math.random() * 0.1 - 0.05));
	}

	public double getPrice(String stockSymbol) {
		return stockPrices.getOrDefault(stockSymbol, 0.0);
	}
}
