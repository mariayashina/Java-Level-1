
    public class Cat extends Animals {
        public Cat(String name, int runLength, int swimLength, double jumpHeight) {
            super(name, runLength, swimLength, jumpHeight);
        }
        @Override
        public void swim() {
            System.out.println("Cats don't swim!");
        }

        @Override
        public void swim(int swimValue) {

        }

    }

