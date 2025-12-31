public class Calci {
    private MathClass math;

    Calci ( MathClass math) {
        this.math = math;
    }
    int sum(int a, int b) {
        return math.add(a,b);
    }
}
