import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompoundInterestCalc {
    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    // B = P(1 + r)^Y + c[((1 + r)^Y - 1)/r]
    // B = Balance; P = principal (starting balance); r = rate of return;
    // Y = time in years; c = annual contribution
    // calculating compound interest
    //  with additions made at the end of the year
    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        String rateAsPercent = percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); // (1 + r)^Y
        BigDecimal c = a.subtract(BigDecimal.ONE); // ((1 + r)^Y -1)
        BigDecimal d = c.divide(new BigDecimal(rateAsPercent)); // ((1 + r)^Y - 1)/r
        BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString())); // c[ ((1 + r)^Y - 1)/r ]
        BigDecimal f = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString())); // P(1 + r)^Y
        BigDecimal g = f.add(e);
        return g;
    }

    public static void main(String[] args) throws ParseException {
        BigDecimal balance = CompoundInterestCalc.calculate("$10,000.00", "8%", 10, "$1,000");
        System.out.println(balance);
        // 36075.8124386377007104000000

        System.out.println(moneyFormatter.format(balance));
        // $36,075.81
    }
}
