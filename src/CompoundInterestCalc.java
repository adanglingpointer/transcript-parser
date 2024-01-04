import java.math.BigDecimal;
import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("$#,###,###.##");
        BigDecimal balance = CompoundInterestCalc.calculate("$10,000.00", "8%", 10, "$1,000");
        System.out.println(balance);
        // 36075.8124386377007104000000

        System.out.println(moneyFormatter.format(balance));
        // $36,075.81

        System.out.println(df.format(balance));
        // $36,075.81

        DecimalFormat df2 = new DecimalFormat("$#,###,###.##;$(#)");
        // define positive number format on the left,
        //  and negative number format on the right.
        // negative value will retain formatting from positive side

        System.out.println(df2.format(balance.negate()));
        // $(36,075.81)
        // .negate = turn into negative number

        DecimalFormat df3 = new DecimalFormat("$#,###.00000000000;$(#)");
        // force decimal places even if they are zeros
        System.out.println(df3.format(balance.negate()));
        // $(36,075.81243863770)

        System.out.printf("$%,(.2f%n", balance); // $36,075.81
        // % begins the format string
        // , is a grouping (comma) flag
        // ( will put parens around negative values
        // .2 two decimal places
        // f for float
        // %n instead of \n because it works across platforms

        System.out.format("$%,(.2f%n", balance); // $36,075.81
        // printf technically calls the .format method,
        // they are the same

        String myMoney = String.format("$%,(.2f%n", balance); // $36,075.81
        System.out.println(myMoney);
    }
}
