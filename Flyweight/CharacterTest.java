import org.junit.Test;
import org.junit.Assert;

public class CharacterTest {
    CharacterPropertiesFactory propFactory = new CharacterPropertiesFactory();
    DocumentEditor doc = new DocumentEditor("Flyweight/src/text.txt");
    Character c = new Character('a', propFactory.getProperties("Arial", "Black", 12));

    @Test
    public void testGetContent() {
        char expected = 'a';
        char actual = c.getContent();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFont() {
        String expected = "Arial";
        String actual = c.getProperties().getFont();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetColor() {
        String expected = "Black";
        String actual = c.getProperties().getColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetSize() {
        int expected = 12;
        int actual = c.getProperties().getSize();
        Assert.assertEquals(expected, actual);
    }
}
