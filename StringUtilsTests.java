package eu.reply.academy.lesson27;

import junit.framework.TestCase;
import org.junit.Test;

public class StringUtilsTests extends TestCase {

    @Test
    public void test01() {
        assertEquals("unknown", StringUtils.getKey(null));
    }
    @Test
    public void test02() {
        assertEquals("unknown", StringUtils.getKey("abcd"));
    }
    @Test
    public void test03() {
        assertEquals("nume", StringUtils.getKey("nume=Windows"));
    }
    @Test
    public void test04() {
        assertEquals("Windows", StringUtils.getValue("nume=Windows"));
    }
}
