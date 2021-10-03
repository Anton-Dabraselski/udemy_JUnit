import org.junit.*;

import static org.junit.Assert.*;

public class StringUtilsTest {

    StringUtils su = new StringUtils();

    // "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "
    @Test
    public void testshopOff2StarsAtHead_both(){
        assertEquals("**", StringUtils.shopOff2StarsAtHead("  **"));

    }
    @Test
    public void testshopOff2StarsAtHead_single(){
        assertEquals("**", StringUtils.shopOff2StarsAtHead(" **"));
    }
    @Test
    public void testshopOff2StarsAtHead_none(){
        assertEquals("****", StringUtils.shopOff2StarsAtHead("****"));
    }
    @Test
    public void testshopOff2StarsAtHead_bothAtRight(){
        assertEquals("**  ", StringUtils.shopOff2StarsAtHead("**  "));
    }

    // "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GeneralAllDiffFalse(){
        //assertEquals(false, su.are2CharsAtHeadAndTailEqual("1234"));
        assertFalse("All different symbols", su.are2CharsAtHeadAndTailEqual("1234"));
    }
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GeneralAllSameFalse(){
        assertTrue(su.are2CharsAtHeadAndTailEqual("1212"));
    }
    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyTwo(){
        assertTrue(su.are2CharsAtHeadAndTailEqual("12"));
    }
    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyOne(){
        assertFalse(su.are2CharsAtHeadAndTailEqual("1"));
    }

    //===========File Test============

    @Test
    public void testBubbleSort(){
        int[] arr = {4,12,-17,3};
        int[] expected = {-17,3,4,12};

        JUnit_Tests.bubbleSort(arr);
        assertArrayEquals(expected, arr);
        //assertEquals(new User("Tom", 24), new User("Tom", 24));
    }

    User Tom = new User("Tom", 24);

//    @Before
//    public void setUp(){
//        Tom.setAge(25);
//        System.out.println("setUp:");
//    }

    @BeforeClass
    public void setBeforeClass(){

    }

    @Test
    public void test1(){
        System.out.println("in test1(");
        System.out.println(Tom.getAge());
    }
    @Test
    public void test2(){
        System.out.println("in test2(");
        System.out.println(Tom.getAge());
    }

    @After
    public void tearDown(){
        Tom.setAge(24);
        System.out.println("tearDown: " +Tom.getAge());
    }

    @AfterClass
    public void AfterTearDownClass(){

    }
}
