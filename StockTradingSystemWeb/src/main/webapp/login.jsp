<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login - Stock Trading</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="flex items-center justify-center h-screen bg-gray-100">
    <div class="w-96 p-6 bg-white rounded-lg shadow-md">
        <h2 class="text-xl font-bold text-center mb-4">Login</h2>
        <form action="LoginServlet" method="post" class="space-y-4">
            <div>
                <label class="block text-gray-700">Username:</label>
                <input type="text" name="username" required class="w-full p-2 border border-gray-300 rounded focus:ring-2 focus:ring-blue-500">
            </div>
            <div>
                <label class="block text-gray-700">Password:</label>
                <input type="password" name="password" required class="w-full p-2 border border-gray-300 rounded focus:ring-2 focus:ring-blue-500">
            </div>
            <button type="submit" class="w-full bg-blue-600 text-white py-2 rounded hover:bg-blue-500">
                Login
            </button>
        </form>
        <c:if test="${not empty errorMessage}">
            <p class="text-red-500 text-center mt-2">${errorMessage}</p>
        </c:if>
    </div>
</body>
</html>
