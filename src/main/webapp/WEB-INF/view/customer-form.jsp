<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        h4 {
            margin-top: 0;
        }

        .error {
            color: red;
        }

        form {
            width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-top: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 5px;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            margin-top: 10px;
            padding: 8px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h4>Fill out the form. Asterisk (*) means required.</h4>
    <br><br>
    <form:form action="processForm" modelAttribute="customer">
        <label>First Name:</label>
        <form:input path="firstName" />

        <label>Last Name (*):</label>
        <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />

        <label>Free Passes:</label>
        <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />

        <label>Postal Code:</label>
        <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error" />

        <label>Course Code:</label>
        <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error" />

        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
