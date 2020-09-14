public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = SLOW;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean setStatus(boolean status) {
        return this.on = status;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is on!" +
                    '}';
        } else {
            return "Fan is off";
        }

    }
}
