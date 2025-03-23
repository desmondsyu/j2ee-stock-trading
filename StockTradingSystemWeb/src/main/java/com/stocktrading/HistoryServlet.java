package com.stocktrading;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.stocktrading.ejb.TradingSession;
@WebServlet("/HistoryServlet")
public class HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private TradingSession tradingSession;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Order History: " + tradingSession.getOrderHistory());
    }
}
