package Strategy.Ejercicio2;

public class ContextSimple {

    private ClassifierStrategy classifierStrategy;

    public ContextSimple(ClassifierStrategy classifierStrategy){
        this.classifierStrategy = classifierStrategy;
    }
    public void run(){
        classifierStrategy.execute();
    }
    public void setClassifierStrategy(ClassifierStrategy classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }
}
