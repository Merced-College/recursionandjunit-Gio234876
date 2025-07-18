import static org.junit.Assert.assertEquals;
import org.junit.Test;


//Allows for the Junit test to be executed and tried out
public class RecursiveTest {
    
    //Count how many 8's within shown and two 8's in a row become 2 and not 1.
    @Test
    public void test1(){
        assertEquals(Main.count8(88188), 6);
    }

    //Count how many times 'hi' appears within the string.
    @Test
    public void test2(){
        assertEquals(5, Main.countHi("hihihihihi"));
    }

    //Count how many times 'hi' appears within the string with extra values
    @Test
    public void test3(){
        assertEquals(1, Main.countHi2("ahixhi"));
        assertEquals(2, Main.countHi2("ahibhi"));
        assertEquals(0, Main.countHi2("xhixhi"));
    }

    //how many times a words like (cat: twice) appears within a string 
    @Test
    public void test4(){
        assertEquals(2, Main.strCount("catcowcat", "cat"));
        assertEquals(1, Main.strCount("catcowcat", "cow"));
        assertEquals(0, Main.strCount("catcowcat", "dog"));
        assertEquals(3, Main.strCount("piedpiperpiperpiedpiper", "piper"));
    }

    //A test that removes duplicates of letter that are one after another
    @Test
    public void test5(){
        assertEquals("yza", Main.stringClean("yyzzza"));
        assertEquals("abcd", Main.stringClean("abbbcdd"));
        assertEquals("Helo", Main.stringClean("Hello"));
        assertEquals("Misisipi", Main.stringClean("Mississippi"));
    }
}

