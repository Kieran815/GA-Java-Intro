package day04.demoInterfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        HondaAccord hondaAccord = new HondaAccord(1996);
        System.out.println(hondaAccord.getMake());
        System.out.println(hondaAccord.getModel());
        System.out.println(hondaAccord.getYear());
        hondaAccord.startEngine();
        System.out.println("\n");

        DodgeRam dodgeRam = new DodgeRam(2010);
        System.out.println(dodgeRam.getMake());
        System.out.println(dodgeRam.getModel());
        System.out.println(dodgeRam.getYear());
        dodgeRam.startEngine();
        System.out.println(dodgeRam.getCarryingCapacity());
        System.out.println(dodgeRam.getTowingCapacity());
        System.out.println(dodgeRam.getFuelType());
    }
}
