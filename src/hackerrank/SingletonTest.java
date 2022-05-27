package hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SingletonTest {

    @Test
    void itReturnsTheSameInstanceOnEveryCall() {
        Singleton singleton1 = Singleton.getSingleInstance();
        Singleton singleton2 = Singleton.getSingleInstance();
        assertTrue(singleton1 == singleton2);
    }
}

