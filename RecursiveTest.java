import static org.junit.Assert.assertEquals;
import org.junit.Test;


//Allows for the Junit test to be executed and tried out
public class RecursiveTest {
    
    //Count how many 8's within shown and two 8's in a row become 2 and not 1.
    @Test
    public void test1(){
        assertEquals(Main.count8(88188), 6);
        assertEquals(Main.count8(818), 2);
        assertEquals(Main.count8(123456789), 1);
        assertEquals(Main.count8(8), 1);
        assertEquals(Main.count8(888), 5);
    }

    //Count how many times 'hi' appears within the string.
    @Test
    public void test2(){
        assertEquals(5, Main.countHi("hihihihihi"));
        assertEquals(3, Main.countHi("hihihi"));
        assertEquals(4, Main.countHi("hihihihi"));
        assertEquals(1, Main.countHi("hi"));
        assertEquals(0, Main.countHi("hello"));
    }

    //Count how many times 'hi' appears within the string with extra values
    @Test
    public void test3(){
        assertEquals(1, Main.countHi2("ahixhi"));
        assertEquals(2, Main.countHi2("ahibhi"));
        assertEquals(0, Main.countHi2("xhixhi"));
        assertEquals(2, Main.countHi2("xhijhichi"));
        assertEquals(0, Main.countHi2("hello"));
    }

    //how many times a words like (cat: twice) appears within a string 
    @Test
    public void test4(){
        assertEquals(2, Main.strCount("catcowcat", "cat"));
        assertEquals(1, Main.strCount("catcowcat", "cow"));
        assertEquals(0, Main.strCount("catcowcat", "dog"));
        assertEquals(3, Main.strCount("piedpiperpiperpiedpiper", "piper"));
        assertEquals(0, Main.strCount("holi", "hooli"));
    }

    //A test that removes duplicates of letter that are one after another
    @Test
    public void test5(){
        assertEquals("yza", Main.stringClean("yyzzza"));
        assertEquals("abcd", Main.stringClean("abbbcdd"));
        assertEquals("Helo", Main.stringClean("Hello"));
        assertEquals("Misisipi", Main.stringClean("Mississippi"));
        assertEquals("Pilow", Main.stringClean("Pillow"));
    }
}

