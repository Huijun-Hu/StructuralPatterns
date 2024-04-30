import org.junit.Test;
import org.junit.Assert;

public class PropertiesReuseTest {
    CharacterPropertiesFactory propFactory = new CharacterPropertiesFactory();
    DocumentEditor doc = new DocumentEditor("Flyweight/src/text.txt");
    Character c1 = new Character('a', propFactory.getProperties("Arial", "Black", 12));
    Character c2 = new Character('a', propFactory.getProperties("Arial", "Blue", 12));

    @Test
    public void testNoReuse() {
        int expected = 2;
        int actual = propFactory.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReuse() {
        Character c3 = new Character('b', propFactory.getProperties("Arial", "Blue", 12));
        Character c4 = new Character('c', propFactory.getProperties("Arial", "Blue", 12));
        int expected = 2;
        int actual = propFactory.getSize();
        Assert.assertEquals(expected, actual);
    }

}