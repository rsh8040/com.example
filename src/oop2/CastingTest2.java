package oop2;

class CastingTest2 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Car1 car2 = null;
        FireEngine1 fe = null;
    
        car.drive();
        fe =  (FireEngine1)car;
        fe.drive();
        car2 = fe;
        car2.drive();
    }    
}

class Car1 {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!!!!!!!");
    }
}

class FireEngine1 extends Car1 {
    void water() {
        System.out.println("water!!!!");
    }
}
