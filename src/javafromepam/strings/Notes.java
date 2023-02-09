package javafromepam.strings;

public class Notes {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Ja";
        String s3 = "va";
        String s4 = new String("Java");
        System.out.println(s1 == s2 + s3);
        System.out.println(s1.equals(s4));
        System.out.println(new Object());
    }
}
