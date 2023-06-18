package barbatos_rex1.grading.primitive;

import barbatos_rex1.grading.utils.Computation;

import java.util.Optional;

public enum Presentations implements Presentation {


    DECIMAL {
        @Override
        public String present(Computation.Fraction fraction) {
            return fraction.toDecimal();
        }
    }, PERCENTAGE {
        @Override
        public String present(Computation.Fraction fraction) {
            return fraction.toPercentage();
        }
    }, FRACTION {
        @Override
        public String present(Computation.Fraction fraction) {
            return fraction.toString();
        }
    };


    public static Optional<Presentations> fromString(String presentation) {
        switch (presentation.toLowerCase()) {
            case "decimal" -> {
                return Optional.of(DECIMAL);
            }
            case "percentage" -> {
                return Optional.of(PERCENTAGE);
            }
            case "fraction" -> {
                return Optional.of(FRACTION);
            }
            default -> {
                return Optional.empty();
            }
        }
    }

}
