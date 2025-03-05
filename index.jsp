<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
    <h2>Currency Converter</h2>
    <form action="convert" method="post">
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required><br><br>

        <label for="fromCurrency">From:</label>
        <select id="fromCurrency" name="fromCurrency">
            <option value="USD">USD</option>
            <option value="EUR">EUR</option>
            <option value="GBP">GBP</option>
            <option value="INR">INR</option>
        </select><br><br>

        <label for="toCurrency">To:</label>
        <select id="toCurrency" name="toCurrency">
            <option value="USD">USD</option>
            <option value="EUR">EUR</option>
            <option value="GBP">GBP</option>
            <option value="INR">INR</option>
        </select><br><br>

        <input type="submit" value="Convert">
    </form>
</body>
</html>
