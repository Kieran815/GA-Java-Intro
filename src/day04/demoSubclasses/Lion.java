package day04.demoSubclasses;

// Java only supports single-inheritance:
    // and object can only inherit from one class

// the below declaration will never work because it's trying to inherit from two separate classes
//public class Lion extends Cat, Run {}



public class Lion extends Cat {
    // annotations
        // @Overide means `inheritance` takes place
        // @Overload means `polymorphism` takes place

        // this @Override will replace a method from the parent class
        // if @Override is being called, it means that inheritance is taking place
    @Override
    public int getLives() {
        return 1;
    }

    /*
     this override won;t work because the `sayHello()` method of cat is listed as `final`
     ** Error Message: java: sayHello() in day04.demoSubclasses.Lion cannot override sayHello() in day04.demoSubclasses.Cat
      overridden method is final
    @Override public String sayHello() { return "What's Good?!?!"; }
    */
}
