package com.stocktrading;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.stocktrading.ejb.TradingSessionBean;

public class HistoryServlet extends HttpServlet {
    @EJB
    private TradingSessionBean tradingSession;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> orderHistory = tradingSession.getOrderHistory();
        request.setAttribute("orderHistory", orderHistory);
        request.getRequestDispatcher("history.jsp").forward(request, response);
    }
}
