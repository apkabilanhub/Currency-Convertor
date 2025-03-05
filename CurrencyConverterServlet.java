import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/convert")
public class CurrencyConverterServlet extends HttpServlet {
    private double convert(double amount, String from, String to) {
        double rateFromUSD = 1.0;
        double rateToUSD = 1.0;

        switch (from) {
            case "USD":
                rateFromUSD = 1.0;
                break;
            case "EUR":
                rateFromUSD = 1.1;
                break;
            case "GBP":
                rateFromUSD = 1.3;
                break;
            case "INR":
                rateFromUSD = 0.013;
                break;
        }

        switch (to) {
            case "USD":
                rateToUSD = 1.0;
                break;
            case "EUR":
                rateToUSD = 0.9;
                break;
            case "GBP":
                rateToUSD = 0.77;
                break;
            case "INR":
                rateToUSD = 75.0;
                break;
        }

        return (amount / rateFromUSD) * rateToUSD;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double amount = Double.parseDouble(request.getParameter("amount"));
        String fromCurrency = request.getParameter("fromCurrency");
        String toCurrency = request.getParameter("toCurrency");

        double result = convert(amount, fromCurrency, toCurrency);

        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
