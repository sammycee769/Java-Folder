package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack(3);
    }

    @Test
    public void testThatICanPushIntoAnEmptyStack(){
        assertTrue(stack.isEmpty());
        stack.push("peace");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testThatTheStackCanBeFilled(){
        assertTrue(stack.isEmpty());
        stack.push("peace");
        stack.push("udochi");
        stack.push("jane");
        assertTrue(stack.isFull());
    }
    @Test
    public void testThatItThrowsAnExceptionIfITryToPushWhenTheStackIsFull(){
        assertTrue(stack.isEmpty());
        stack.push("peace");
        stack.push("udochi");
        stack.push("jane");
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> stack.push("peace"));
        assertEquals("Stack is full", exception.getMessage());
    }
    @Test
    public  void  testThatIPopAfterPushingIntoTheStack(){
        assertTrue(stack.isEmpty());
        stack.push("peace");
        stack.push("udochi");
        String popped = stack.pop();
        assertEquals("udochi", popped);
    }
    @Test
    public void testThatPoppingAnEmptyStackThrowsAnException(){
        assertTrue(stack.isEmpty());
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> stack.pop());
        assertEquals("Stack is empty", exception.getMessage());
    }
    @Test
    public void testThatTheStackCanBePeeked(){
        assertTrue(stack.isEmpty());
        stack.push("peace");
        stack.push("udochi");
        String peeked = stack.peek();
        assertEquals("udochi", peeked);
    }
    @Test
    public void testThatTheStackReturnsAnExceptionIfITryToPeekAtAnEmptyStack(){
        assertTrue(stack.isEmpty());
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> stack.peek());
        assertEquals("Stack is empty", exception.getMessage());
    }
}
