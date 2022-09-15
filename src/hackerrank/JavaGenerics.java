package hackerrank;

public class JavaGenerics {
    public static void printArray(Object[] array) {
        for (Object o : array) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Integer[] arrayInteger = {1, 2, 3};
        String[] arrayString = {"Hello", "World"};
        printArray(arrayInteger);
        printArray(arrayString);
    }
}
