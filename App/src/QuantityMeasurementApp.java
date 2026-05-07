
public class QuantityMeasurementApp {

    // Inner class Feet
    static class Feet {

        // Encapsulated immutable value
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Getter method
        public double getValue() {
            return value;
        }

        // Overriding equals() method
        @Override
        public boolean equals(Object obj) {

            // Same reference check
            if (this == obj) {
                return true;
            }

            // Null check and type check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            // Type casting
            Feet feet = (Feet) obj;

            // Compare double values safely
            return Double.compare(feet.value, value) == 0;
        }
    }
    //inches-classes
    static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            // Same reference
            if (this == obj) {
                return true;
            }

            // Null check and type check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Inches inches = (Inches) obj;

            // Safe double comparison
            return Double.compare(inches.value, value) == 0;
        }
    }
    // Static method for Feet comparison
    public static boolean compareFeet(double value1, double value2) {

        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);

        return feet1.equals(feet2);
    }

    // Static method for Inches comparison
    public static boolean compareInches(double value1, double value2) {

        Inches inch1 = new Inches(value1);
        Inches inch2 = new Inches(value2);

        return inch1.equals(inch2);
    }

    // Main method
    public static void main(String[] args) {

        boolean feetResult = compareFeet(1.0, 1.0);

        // Inches comparison
        boolean inchResult = compareInches(1.0, 1.0);

        System.out.println("Feet Equality : " + feetResult);
        System.out.println("Inches Equality : " + inchResult);
    }
}