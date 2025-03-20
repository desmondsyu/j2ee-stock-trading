package com.stocktrading;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.stocktrading.ejb.StockTransactionBean;

public class TradeServlet extends HttpServlet {
    @EJB
    private StockTransactionBean stockTransaction;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String stockSymbol = request.getParameter("stockSymbol");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String orderType = request.getParameter("orderType");

        String result = stockTransaction.executeTrade(stockSymbol, quantity, orderType);
        request.setAttribute("tradeResult", result);
        request.getRequestDispatcher("trade.jsp").forward(request, response);
    }
}
