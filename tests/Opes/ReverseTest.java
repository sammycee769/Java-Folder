package Opes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    @Test
    public void testLetterInMiddle() {
        assertEquals("wodr", Opes.Reverse.reverseWord("word", 'o'));
    }

    @Test
    public void testLetterAtBeginning() {
        assertEquals("abcdef", Opes.Reverse.reverseWord("afedcb", 'a'));
    }

    @Test
    public void testLetterAtEnd() {
        assertEquals("hello", Opes.Reverse.reverseWord("hello", 'o'));
    }

    @Test
    public void testLetterNotFound() {
        assertEquals("java", Opes.Reverse.reverseWord("java", 'x'));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", Opes.Reverse.reverseWord("a", 'a'));
    }
}
