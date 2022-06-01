package hackerrank;

public class CatFactory {
    static Cat cat1 = new Cat();
    Cat cat2 = new Cat();

    public Cat createCat() {
        return new Cat();
    }


    static class Cat {

    }

    public static void main(String[] args) {
        Cat catFromClass = CatFactory.cat1;
        Cat catFromObject = new CatFactory().cat2;
        //Cat newCat = new CatFactory().new Cat(); //принадлежит полю переменной newCat - никому, методу main. Он здесь создан.
        Cat newCat = new Cat(); //принадлежит полю переменной newCat - никому, методу main. Он здесь создан.
        CatFactory catFactory = new CatFactory();
        catFactory.createCat(); // принадлежит main, никому не принадлежит
    }

}
