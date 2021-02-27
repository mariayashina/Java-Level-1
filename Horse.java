    public class Horse extends Animals {
        public Horse(String name, int runLength, int swimLength, double jumpHeight) {
            super(name, runLength, swimLength, jumpHeight);
        }

        @Override
        public void swim() {

        }

        @Override
        public void swim(int swimValue) {
            if (swimValue <= swimLength) System.out.println(name + " swam!");
            else System.out.println(name + " couldn't swim!");
        }
    }

