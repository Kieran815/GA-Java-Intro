package day04.demoAbstractClasses;

public class LCDTelly extends Equipment{

    private double power;

    public LCDTelly(String mfgr, double power) {
        this.showLogo(mfgr);
        this.power = power;
    }

    @Override
    public void computePower(double time) {
        double cost = time * power * 2;
        System.out.println("Cost of an LCD TV is $" + cost);
    }
}
