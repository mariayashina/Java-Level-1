    public class Bird extends Animals {
        public Bird(String name, int runLength, int swimLength, double jumpHeight) {
            super(name, runLength, swimLength, jumpHeight);
        }
        @Override
        public void swim() {
            System.out.println("Birds don't swim!");
        }

        @Override
        public void swim(int swimValue) {

        }
    }

