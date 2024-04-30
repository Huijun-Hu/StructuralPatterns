import org.junit.Test;
import org.junit.Assert;

public class EditorTest {
    CharacterPropertiesFactory propFactory = new CharacterPropertiesFactory();
    DocumentEditor doc = new DocumentEditor("Flyweight/test.txt");

    @Test
    public void testNoReuse() {
        String expected = "This is a test file";
        String actual = doc.load();
        Assert.assertEquals(expected, actual);
    }

}