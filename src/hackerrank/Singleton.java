package hackerrank;


public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}
