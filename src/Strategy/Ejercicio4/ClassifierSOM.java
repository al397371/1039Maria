package Strategy.Ejercicio4;

public class ClassifierSOM implements ClassifierStrategy {
    private Distance distance;
    @Override
    public void execute() {
        distance.distance();
        System.out.println("ClassifierSOM executed");
    }

    public ClassifierSOM(Distance distance) {
        this.distance = distance;
    }
}
