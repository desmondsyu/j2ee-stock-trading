<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Trade Notifications</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script>
        function getNotifications() {
            fetch("NotificationServlet")
            .then(response => response.text())
            .then(data => {
                document.getElementById("notification").innerHTML = data;
            });
        }
        setInterval(getNotifications, 5000);
    </script>
</head>
<body class="flex items-center justify-center h-screen bg-gray-100">
    <div class="w-96 p-6 bg-white rounded-lg shadow-md">
        <h2 class="text-xl font-bold text-center mb-4">Trade Notifications</h2>
        <div id="notification" class="text-center text-gray-700">Waiting for trade notifications...</div>
        <div class="text-center mt-4">
            <a href="dashboard.jsp" class="bg-blue-600 text-white py-2 px-4 rounded hover:bg-blue-500">Back to Dashboard</a>
        </div>
    </div>
</body>
</html>
