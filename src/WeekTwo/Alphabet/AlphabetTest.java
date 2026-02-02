package WeekTwo.Alphabet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphabetTest {
    @Test
    public void testInputAToOne() {
        assertEquals(1,Alphabet.letterToNumber('A'));
        assertEquals(1,Alphabet.letterToNumber('a'));
    }
@Test
    public void testInputZ() {
        assertEquals(26,Alphabet.letterToNumber('Z'));
        assertEquals(26,Alphabet.letterToNumber('z'));
            }
@Test
            public void testWordToNumber() {
    int[] result = Alphabet.textToNumbers("AbZ!");
    assertArrayEquals(new int[]{1, 2, 26, 0}, result);
}
@Test
    public void testNumberToWord() {
        int[] result = {1,2,26,1};
        assertEquals("ABZA",Alphabet.numbersToText(result));
}




}
