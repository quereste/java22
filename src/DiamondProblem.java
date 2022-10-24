public class DiamondProblem implements B, C {

    @Override
    public void methodOne() {
        System.out.println("solve");
    }

    @Override
    public void methodTwo() {
        System.out.println("diamond");
    }

    @Override
    public void methodThree() {
        System.out.println("problem");
    }
}


interface A {
    public void methodOne();
}

interface B extends A {
    public void methodTwo();
    public void methodThree();
}

interface C extends A {
    public void methodTwo();
    public void methodThree();
}
