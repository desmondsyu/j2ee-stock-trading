<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Trade History - Stock Trading</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
    <div class="max-w-4xl w-full p-6 bg-white rounded-lg shadow-md">
        <h2 class="text-2xl font-bold text-center text-gray-800 mb-4">Trade History</h2>

        <div class="overflow-x-auto">
            <table class="w-full border-collapse border border-gray-300">
                <thead>
                    <tr class="bg-gray-200">
                        <th class="border border-gray-300 px-4 py-2">Stock Symbol</th>
                        <th class="border border-gray-300 px-4 py-2">Quantity</th>
                        <th class="border border-gray-300 px-4 py-2">Order Type</th>
                        <th class="border border-gray-300 px-4 py-2">Price</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="order" items="${orderHistory}">
                        <tr class="bg-gray-100 text-center">
                            <td class="border border-gray-300 px-4 py-2">${order.stockSymbol}</td>
                            <td class="border border-gray-300 px-4 py-2">${order.quantity}</td>
                            <td class="border border-gray-300 px-4 py-2">
                                <span class="px-2 py-1 text-white rounded
                                    <c:choose>
                                        <c:when test="${order.orderType == 'BUY'}">bg-green-500</c:when>
                                        <c:when test="${order.orderType == 'SELL'}">bg-red-500</c:when>
                                    </c:choose>">
                                    ${order.orderType}
                                </span>
                            </td>
                            <td class="border border-gray-300 px-4 py-2">$${order.price}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="text-center mt-6">
            <a href="dashboard.jsp" class="bg-blue-600 text-white py-2 px-4 rounded hover:bg-blue-500">Back to Dashboard</a>
        </div>
    </div>
</body>
</html>
