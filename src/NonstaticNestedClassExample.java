public class NonstaticNestedClassExample {
    int x;
    private int y;
    NonstaticNestedClassExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    class InnerClass {
        public void calculate() {
            System.out.println(x * y);
        }
    }
}
