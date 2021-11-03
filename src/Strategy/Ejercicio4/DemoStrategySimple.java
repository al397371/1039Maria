package Strategy.Ejercicio4;

public class DemoStrategySimple {

    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        ContextSimple context = new ContextSimple(new ClassifierKnn(new DistanceEuclidean()));
        context.run();
        System.out.println("--- KNN with Manhattan distance---");
        ContextSimple context2 = new ContextSimple(new ClassifierKnn(new DistanceManhattan()));
        context.run();

        System.out.println("--- K-means with Manhattan distance---");
        context.setClassifierStrategy(new ClassifierKmeans(new DistanceManhattan()));
        context.run();

        System.out.println("--- SOM with Euclidean distance---");
        context.setClassifierStrategy(new ClassifierSOM(new DistanceEuclidean()));
        context.run();
    }
}
