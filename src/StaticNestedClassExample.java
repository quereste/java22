public class StaticNestedClassExample {
    int x;
    private static int y;
    StaticNestedClassExample(int x, int y) {
        this.x = x;
        StaticNestedClassExample.y = y;
    }

    static class InnerClass {
        public void calculate() {
           // System.out.println(x * y);
            System.out.println(y);
        }
    }
}
