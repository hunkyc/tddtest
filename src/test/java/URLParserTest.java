import org.junit.Test;

import static org.junit.Assert.*;

public class URLParserTest {

    @Test
    public void test_basic_http_protocol() {
        URLParser p = new URLParser("http://www.google.com");
        assertTrue(p.getProtocol().equals("http"));
    }

    @Test
    public void test_basic_ftp_protocol() {
        URLParser p = new URLParser("ftp://www.google.com");
        assertTrue(p.getProtocol().equals("ftp"));
    }

    @Test
    public void test_basic_generic_protocol() {
        URLParser p = new URLParser("xyz://www.xyz.com");
        assertTrue(p.getProtocol().equals("xyz"));
    }

    @Test
    public void test_simple_site() {
        URLParser p = new URLParser("http://www.google.com");
        assertTrue(p.getSite().equals("www.google.com"));
    }

    @Test
    public void test_simple_site_with_pathname() {
        URLParser p = new URLParser("http://www.google.com/index.html");
        assertTrue(p.getSite().equals("www.google.com"));
    }

    @Test
    public void test_simple_site_with_slash() {
        URLParser p = new URLParser("http://www.google.com/");
        assertTrue(p.getSite().equals("www.google.com"));
    }

    @Test
    public void test_simple_pathname() {
        URLParser p = new URLParser("http://www.google.com/test");
        assertTrue(p.getPathname().equals("test"));
    }

    @Test
    public void test_complex_pathname() {
        URLParser p = new URLParser("http://www.google.com/test/martin/here.html");
        assertArrayEquals("test/martin/here.html".getBytes(),p.getPathname().getBytes());
    }

    @Test
    public void test_simple_empty_pathname() {
        URLParser p = new URLParser("http://www.google.com/");
        assertTrue(p.getPathname().equals(""));
    }

    @Test
    public void test_simple_slash_pathname() {
        URLParser p = new URLParser("http://www.google.com/");
        assertTrue(p.getPathname().equals(""));
    }
}