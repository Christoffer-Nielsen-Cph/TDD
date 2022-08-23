import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTestClass {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testOne() {
        //Greets a person by his name if the input is valid
        MyClass myClass = new MyClass();
        String actual = myClass.greet("Christoffer");
        String expected ="Hello, Christoffer.";
        assertEquals(expected,actual);

    }

    @Test
    void testTwo() {
        //Greets a person by "my friend" if the input is null
        MyClass myClass = new MyClass();
        String actual = myClass.greet(null);
        String expected = "Hello, my friend.";
        assertEquals(expected,actual);

    }

    @Test
    void testThree() {
        //Greets a person by yelling if the input is all capital
        MyClass myClass = new MyClass();
        String actual = myClass.greet("CHRISTOFFER");
        String expected = "HELLO, CHRISTOFFER!";
        assertEquals(expected,actual);

    }

    @Test
    void testFour() {
        //Greets multiple people if the input is a String array
        MyClass myClass = new MyClass();
        String actual =  myClass.greet(new String[]{"Chris", "Frank"});
        String expected = "Hello, Chris and Frank";
        assertEquals(expected,actual);
    }

    @Test
    void testFive() {
        //Greets multiple people if the input is a String array and separate the names with commas and adds an and before the last name
        MyClass myClass = new MyClass();
        String actual = myClass.greet(new String[]{"Chris", "Frank", "Tim"});
        String expected = "Hello, Chris, Frank, and Tim";
        assertEquals(expected,actual);
    }

    @Test
    void testSix() {
        MyClass myClass = new MyClass();
        String [] greet = {"Chris","FRANK","Tim"};
        assertEquals("Hello, "+greet[0]+","+greet[2]+". AND HELLO "+greet[2]+"!",greet);
    }

    @Test
    void testSeven() {
        MyClass myClass = new MyClass();
        String [] greet = {"Chris","Frank, Tim"};
        assertEquals("Hello, "+greet[0]+","+greet[1],greet);

    }

    @Test
    void testEight() {
        MyClass myClass = new MyClass();
        String [] greet = {"Chris","\"Frank, Tim\""};
        assertEquals("Hello, "+greet[0]+","+greet[1],greet);
    }
}