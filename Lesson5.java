public class Lesson5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 200, 0, 2);
        Dog dog = new Dog("Dog", 500, 10, 0.5);
        Horse horse = new Horse("Horse",1500, 100, 3);
        Bird bird = new Bird("Bird", 5, 0, 0.2);

    //    cat.run(100);
    //    cat.swim();
    //    cat.jump(3);
    //    dog.run(600);
    //    dog.swim(5);
    //    dog.jump(0.9);
    //    horse.run(102);
    //    horse.swim(200);
    //    horse.jump(4);
    //    bird.run(5);
    //    bird.swim();
    //    bird.jump(0.1);

        Animals[] array = {cat, dog, bird, horse};
        for (int i = 0; i < array.length; i++) {
        array[i].run(100);
        if (array[i] instanceof Cat) {
            array[i].swim();
        }
        if (array[i] instanceof Bird) {
            array[i].swim();
        }
            if (array[i] instanceof Dog) {
                array[i].swim(700);
            }
            if (array[i] instanceof Horse) {
                array[i].swim(1200);
            }
    //    array[i].swim(150);
    //    array[i].swim();
        array[i].jump(0.7);
        }
    }

}
