package task;


import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * {
 *   {
 *     <<>><>
 *     {}{}(
 *     {
 *       ()
 *     }
 *     )
 *   }
 *   [][()]
 *   ()
 * }
 *
 * 1. {}
 * 2. []
 * 3. ()
 * 4. <>
 *
 *
 * }
 */
public class BracketsTest {

    BracketsV5 app = new BracketsV5();

    @Test
    public void validEmpty() {
        assertTrue(app.isValid(""));
    }

    @Test
    public void validSimple() {
        assertTrue(app.isValid("{}"));
    }

    @Test
    public void validSequence() {
        assertTrue(app.isValid("{}{}"));
    }

    @Test
    public void validNested() {
        assertTrue(app.isValid("{{}}"));
    }

    @Test
    public void valid5() {
        assertTrue(app.isValid("{()[{<>}<>]}"));
    }

    @Test
    public void invalidNonClosed() {
        assertFalse(app.isValid("{}{"));
    }

    @Test
    public void invalidExtraClosed() {
        assertFalse(app.isValid("{}}"));
    }

    @Test
    public void invalidStartsFromClose() {
        assertFalse(app.isValid("}"));
    }
}


