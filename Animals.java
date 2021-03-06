public abstract class Animals {
        protected String name;
        protected int runLength;
        protected int swimLength;
        protected double jumpHeight;

        public Animals(String name, int runLength, int swimLength, double jumpHeight) {
            this.name = name;
            this.runLength = runLength;
            this.swimLength = swimLength;
            this.jumpHeight = jumpHeight;
        }

        public void run(double runValue) {
            if (runValue <= runLength) System.out.println(name + " run!");
            else System.out.println(name + " couldn't run!");
        }

        public void jump(double jumpValue) {
            if (jumpValue <= jumpHeight) System.out.println(name + " jumped!");
            else System.out.println(name + " couldn't jump!");
    }

    public abstract void swim();

    public abstract void swim(int swimValue);
}

