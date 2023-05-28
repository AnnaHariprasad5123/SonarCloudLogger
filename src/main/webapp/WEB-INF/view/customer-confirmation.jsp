<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Customer Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            width: 400px;
            margin: 0 auto;
            text-align: center;
            background-color: #f2f2f2;
        }

        h2 {
            margin-top: 0;
            color: #333;
        }

        .label {
            font-weight: bold;
            color: #555;
        }

        .customer-info {
            margin-top: 20px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        .customer-info p {
            margin: 10px 0;
            color: #666;
        }
    </style>
</head>
<body>
    <h2>Customer Confirmation</h2>

    <div class="customer-info">
        <p><span class="label">Name:</span> ${customer.firstName} ${customer.lastName}</p>
        <p><span class="label">Free Passes:</span> ${customer.freePasses}</p>
        <p><span class="label">Postal Code:</span> ${customer.postalCode}</p>
        <p><span class="label">Course Code:</span> ${customer.courseCode}</p>
    </div>
</body>
</html>
