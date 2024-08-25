package command;

public class KitchenRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen light is ON at brightness level: " + brightness);
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen light is OFF");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen light dimmed to level: " + brightness);
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}