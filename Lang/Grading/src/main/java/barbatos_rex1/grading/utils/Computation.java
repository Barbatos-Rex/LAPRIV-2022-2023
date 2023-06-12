package barbatos_rex1.grading.utils;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Computation {

    @AllArgsConstructor
    @Getter
    public static class Fraction {
        private double numerator;
        private double denominator;

        public Fraction normalize() {
            if (numerator == denominator) {
                return new Fraction(1L, 1L);
            }
            double numerator = this.numerator;
            double denominator = this.denominator;
            int decimalN = Double.toString(numerator).split("\\.|,")[1].length();
            int decimalD = Double.toString(denominator).split("\\.|,")[1].length();
            int decimal = Math.max(decimalD, decimalN);
            return new Fraction(numerator * Math.pow(10, decimal), denominator * Math.pow(10, decimal));
        }

        public Fraction simplify() {
            Fraction normal = this.normalize();
            long mcd = mcd(((long) normal.numerator), ((long) normal.denominator));
            return new Fraction(normal.numerator / mcd, normal.denominator / mcd);
        }


        public String toDecimal() {
            return String.format("%f", numerator / denominator).replace(",", ".");
        }

        public String toPercentage() {
            return (String.format("%.2f", (numerator / denominator) * 100) + "%").replace(",", ".");
        }

        @Override
        public String toString() {
            return String.format("%.0f/%.0f", numerator, denominator);
        }

        public boolean isNegative() {
            return numerator * denominator < 0;
        }
    }

    public static long mcd(long a, long b) {

        a = Math.abs(a);
        b = Math.abs(b);
        if(a<0){
            a=(a+1)*-1;
        }
        if(b<0){
            b=(b+1)*-1;
        }

        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }


}
