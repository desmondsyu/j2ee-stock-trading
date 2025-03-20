<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Dashboard - Stock Trading</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
    <div class="max-w-4xl mx-auto mt-10 p-6 bg-white shadow-lg rounded-lg">
        <h2 class="text-2xl font-bold text-center text-gray-800">Welcome, ${sessionScope.username}</h2>

        <div class="mt-6">
            <h3 class="text-xl font-semibold">Stock Prices</h3>
            <ul class="grid grid-cols-3 gap-4 mt-2">
                <li class="p-3 bg-green-100 rounded text-green-800">AAPL: $150</li>
                <li class="p-3 bg-blue-100 rounded text-blue-800">GOOGL: $2800</li>
                <li class="p-3 bg-yellow-100 rounded text-yellow-800">AMZN: $3400</li>
            </ul>
        </div>

        <div class="mt-6">
            <h3 class="text-xl font-semibold">Your Watchlist</h3>
            <ul class="mt-2 space-y-2">
                <c:forEach var="stock" items="${watchlist}">
                    <li class="p-3 bg-gray-200 rounded">${stock}</li>
                </c:forEach>
            </ul>
        </div>

        <div class="flex justify-between mt-6">
            <a href="trade.jsp" class="bg-blue-600 text-white py-2 px-4 rounded hover:bg-blue-500">Trade Stocks</a>
            <a href="history.jsp" class="bg-gray-600 text-white py-2 px-4 rounded hover:bg-gray-500">View Trade History</a>
        </div>
    </div>
</body>
</html>
