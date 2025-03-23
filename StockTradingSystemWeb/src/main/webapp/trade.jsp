<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Trade Stocks</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            const urlParams = new URLSearchParams(window.location.search);
            if (urlParams.has("message")) {
                document.getElementById("tradeMessage").innerText = urlParams.get("message");
                document.getElementById("tradeMessage").classList.remove("hidden");
            }
        });
    </script>
</head>
<body class="bg-gray-100 flex items-center justify-center h-screen">
<div class="w-96 p-6 bg-white rounded-lg shadow-md">
    <h2 class="text-xl font-bold text-center mb-4">Trade Stocks</h2>

    <!-- Trade Result Message -->
    <div id="tradeMessage" class="hidden p-2 mb-4 text-center text-white bg-blue-500 rounded"></div>

    <form action="TradeServlet" method="post" class="space-y-4">
        <div>
            <label class="block text-gray-700">Stock Symbol:</label>
            <input type="text" name="stockSymbol" required class="w-full p-2 border border-gray-300 rounded focus:ring-2 focus:ring-blue-500">
        </div>
        <div>
            <label class="block text-gray-700">Quantity:</label>
            <input type="number" name="quantity" min="1" required class="w-full p-2 border border-gray-300 rounded focus:ring-2 focus:ring-blue-500">
        </div>
        <div>
            <label class="block text-gray-700">Order Type:</label>
            <select name="orderType" class="w-full p-2 border border-gray-300 rounded focus:ring-2 focus:ring-blue-500">
                <option value="BUY">BUY</option>
                <option value="SELL">SELL</option>
            </select>
        </div>
        <button type="submit" class="w-full bg-green-600 text-white py-2 rounded hover:bg-green-500">Submit Order</button>
    </form>
</div>
</body>
</html>
