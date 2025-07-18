import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class RecursiveTest {
    
    // @Test
    // public void test1(){
    //     assertEquals(Main.count8(8818), 4);
    // }

    // @Test
    // public void test2(){
    //     assertEquals(5, Main.countHi("hihihihihi"));
    // }

    // @Test
    // public void test3(){
    //     assertEquals(1, Main.countHi2("ahixhi"));
    //     assertEquals(2, Main.countHi2("ahibhi"));
    //     assertEquals(0, Main.countHi2("xhixhi"));
    // }

    // @Test
    // public void test4(){
    //     assertEquals(2, Main.strCount("catcowcat", "cat"));
    //     assertEquals(1, Main.strCount("catcowcat", "cow"));
    //     assertEquals(0, Main.strCount("catcowcat", "dog"));
    // }

    @Test
    public void test5(){
        assertEquals("yza", Main.stringClean("yyzzza"));
        assertEquals("abcd", Main.stringClean("abbbcdd"));
        assertEquals("Helo", Main.stringClean("Hello"));
        assertEquals("Misisipi", Main.stringClean("Mississippi"));
    }
}

