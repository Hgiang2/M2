import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var fan = new Fan(1, true, 10, "Red");
        var scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    Menu
                    1. Turn on/off
                    2. Change fan speed
                    3. Change color
                    4. Fan status
                    0. Exit""");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (fan.isOn()) {
                        fan.setOn(false);
                        fan.setSpeed(0);
                        System.out.println("Fan is off");
                    } else {
                        fan.setOn(true);
                        fan.setSpeed(1);
                        System.out.println("Fan is on");
                    }
                    break;
                case 2:
                    System.out.println("""
                            1. SLOW
                            2. MEDIUM
                            3. FAST""");

                    switch (scanner.nextInt()) {
                        case 1:
                            fan.setSpeed(1);
                            System.out.println("Fan speed is SLOW");
                            break;
                        case 2:
                            fan.setSpeed(2);
                            System.out.println("Fan speed is MEDIUM");
                            break;
                        case 3:
                            fan.setSpeed(3);
                            System.out.println("Fan speed is FAST");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 3:
                    System.out.println("""
                            1. Blue
                            2. Purple
                            3. White""");

                    switch (scanner.nextInt()) {
                        case 1:
                            fan.setColor("blue");
                            System.out.println("Fan color is blue");
                            break;
                        case 2:
                            fan.setColor("purple");
                            System.out.println("Fan color is purple");
                            break;
                        case 3:
                            fan.setColor("white");
                            System.out.println("Fan color is white");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                case 4:
                    System.out.println(fan);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (choice != 0);
    }
}