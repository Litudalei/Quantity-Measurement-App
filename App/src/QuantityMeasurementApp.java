
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

    // Main method
    public static void main(String[] args) {

        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        boolean result = feet1.equals(feet2);

        System.out.println("Equal : " + result);
    }
}