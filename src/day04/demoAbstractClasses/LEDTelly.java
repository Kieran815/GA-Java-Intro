package day04.demoAbstractClasses;

public class LEDTelly extends Equipment{

    private double power;

    public LEDTelly(String mfgr, double power) {
        this.showLogo(mfgr); // calling `showLogo` from `Equipment` class
        this.power = power;
    }

    @Override
    public void computePower(double time) {
        double cost = time * power;
        System.out.println(cost);
    }
}
