package Strategy.Ejercicio4;

public class ClassifierKnn implements ClassifierStrategy {

    private Distance distance;

    @Override
    public void execute() {
        distance.distance();
        System.out.println("ClassifierKnn executed");
    }

    public ClassifierKnn(Distance distance) {
        this.distance = distance;
    }
}
