package WeekOne.HeltalsArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeltalsArrayTest {

    @Test
            public void addFiveIntegerTest() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(40);
        myArray.add(544);
        myArray.add(54);
        myArray.add(224);
        assertEquals("HeltalsArray{arr=[4, 40, 544, 54, 224]}",myArray.toString());
    }

    @Test
    public void addSixIntegerTest() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(40);
        myArray.add(544);
        myArray.add(54);
        myArray.add(224);
        myArray.add(13);
        assertEquals("HeltalsArray{arr=[4, 40, 544, 54, 224]}",myArray.toString());
    }

    @Test
    public void getIndex3Test() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(40);
        myArray.add(544);
        myArray.add(54);
        myArray.add(224);
        myArray.add(13);
        int actual = myArray.getValue(3);
        assertEquals(54,actual);
    }

    @Test
    public void getIndex7Test() {
        HeltalsArray myArray = new HeltalsArray();
        myArray.add(4);
        myArray.add(40);
        myArray.add(544);
        myArray.add(54);
        myArray.add(224);
        myArray.add(13);
        Integer actual = myArray.getValue(7);
        assertNull(actual);
    }

}
