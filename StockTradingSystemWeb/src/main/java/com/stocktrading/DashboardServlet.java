package com.stocktrading;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import com.stocktrading.ejb.TradingSessionBean; 

public class DashboardServlet extends HttpServlet {
    @EJB
    private TradingSessionBean tradingSession;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<String> watchlist = tradingSession.getWatchList();
       request.setAttribute("watchlist", watchlist);
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }
}
