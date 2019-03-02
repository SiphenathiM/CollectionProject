package ac.za.cput;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;


public class collectionTest {

@Test
    public void testList(){

    ListApp listApp = new ListApp();

    Assert.assertThat(listApp.myList().size(), is(3));

    Assert.assertThat(listApp.myList(), hasItems("Blue"));
}

    @Test
    public void testSet() {

    ListApp listApp1 = new ListApp();

        Assert.assertEquals(3,listApp1.mySet().size());
    }

    @Test
    public void testMap() {

    ListApp listApp2 = new ListApp();

        Map<String, String> expected = new HashMap<>();
        expected.put("key1", "element 1");
        expected.put("key2", "element 2");
        expected.put("key3", "element 3");

        //1. Test equal, ignore order
        Assert.assertThat(listApp2.myMap(), is(expected));

        //2. Test the size
        Assert.assertEquals(3,listApp2.myMap().size());


    }

    @Test
    public void multiply() {
        CalculatorInterface calc = new CalculatorService();
        int result = calc.multiply(10,2);
        Assert.assertEquals("Multiply 10*2", 20, result);
    }


}
