public class InnerClassesDemo {
    public static void main(String[] args) {
        NonstaticNestedClassExample nonstaticExample = new NonstaticNestedClassExample(1, 2);

        // This fails:
        //NonstaticNestedClassExample.InnerClass nonstaticInner = new NonstaticNestedClassExample.InnerClass();
        NonstaticNestedClassExample.InnerClass nonstaticInner = nonstaticExample.new InnerClass();

        nonstaticInner.calculate();

        StaticNestedClassExample.InnerClass staticInner = new StaticNestedClassExample.InnerClass();
        staticInner.calculate();
    }
}
