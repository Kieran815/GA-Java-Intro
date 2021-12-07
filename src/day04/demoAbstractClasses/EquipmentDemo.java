package day04.demoAbstractClasses;

public class EquipmentDemo {
    public static void main(String[] args) {
        LEDTelly ledTelly = new LEDTelly("Asus", 55);
        ledTelly.computePower(12);

        LCDTelly lcdTelly = new LCDTelly("Sony", 40);
        lcdTelly.computePower(12);
    }
}
