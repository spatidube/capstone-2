public class Drink {
    // Represents a drink with size and flavor

    public class Drink {

        private Size size; // small, medium, or large

        private String flavor; // coke, sprite, etc.



        // Constructor: sets up drink with size and flavor

        public Drink(Size size, String flavor) {

            this.size = size;

            this.flavor = flavor;

        }



        // Method: returns drink price based on size

        public double getPrice() {

            return switch (size) {

                case SMALL -> 2.00;

                case MEDIUM -> 2.50;

                case LARGE -> 3.00;

            };

        }



        // Method: builds string with drink size, flavor, and price

        public String toString() {

            return size + " " + flavor + " - $" + getPrice();

        }

    }


}
