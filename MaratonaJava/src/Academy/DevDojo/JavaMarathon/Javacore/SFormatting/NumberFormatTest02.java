package Academy.DevDojo.JavaMarathon.Javacore.SFormatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeFR = Locale.FRANCE;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeFR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 1000.2130;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valueString = "￥1,000";
        try {
            System.out.println(nfa[2].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
