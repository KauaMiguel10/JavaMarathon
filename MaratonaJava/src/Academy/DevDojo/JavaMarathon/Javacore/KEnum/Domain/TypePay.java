package Academy.DevDojo.JavaMarathon.Javacore.KEnum.Domain;

public enum TypePay {
    DEBIT{
        @Override
        public double calculateDiscount(double value) {
            return value - value * 0.05;
        }
    }, CREDIT{
        @Override
        public double calculateDiscount(double value) {
            return value - value * 0.1;
        }
    };


    public double calculateDiscount(double value) {
        return 0;
    }
}
