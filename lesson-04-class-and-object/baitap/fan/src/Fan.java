public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return "Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color= '" + color + "', " +
                (isOn ? "Fan is on" : "Fan is off") +
                "}\n";

    }
}
