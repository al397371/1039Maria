package Strategy.Ejercicio4;

public class ClassifierKmeans implements ClassifierStrategy {
    private Distance distance;
    @Override
    public void execute() {
        distance.distance();
        System.out.println("ClassifierKmeans executed");
    }

    public ClassifierKmeans(Distance distance) {
        this.distance = distance;
    }
}
