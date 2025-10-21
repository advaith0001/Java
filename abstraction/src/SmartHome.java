// Abstract class Appliance
abstract class Appliance {
    private int powerRating;  // Encapsulation

    // Constructor
    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    // Getter method
    public int getPowerRating() {
        return powerRating;
    }

    // Abstract methods
    abstract void turnOn();
    abstract void turnOff();
}

// Fan class
class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Fan ON. Power: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("Fan OFF");
    }
}

// Light class
class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Light ON. Power: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

// AC class
class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("AC ON. Power: " + getPowerRating() + "W");
    }

    public void turnOff() {
        System.out.println("AC OFF");
    }
}



public class SmartHome {
    public static void main(String[] args) {
        Fan fan = new Fan(60);
        Light light = new Light(40);
        AC ac = new AC(1500);

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}
