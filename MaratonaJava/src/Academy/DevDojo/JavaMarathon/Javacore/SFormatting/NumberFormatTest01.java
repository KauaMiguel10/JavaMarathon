package Academy.DevDojo.JavaMarathon.Javacore.SFormatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[2] = NumberFormat.getInstance(localeDefault);
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double value = 1_000.2130;

        for (NumberFormat numberFormat : nfa){
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String valueString = "1000,2130";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
