import org.junit.Assert;
import org.junit.Test;

public class SongTest {
    Song s = new Song(10, "HelloWorld", "CS", 200);

    @Test
    public void testGetAlbum() {
        String expected = "CS";
        String actual = s.getAlbum();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDuration() {
        int expected = 200;
        int actual = s.getDuration();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSongID() {
        int expected = 10;
        int actual = s.getSongID();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetTitle() {
        String expected = "HelloWorld";
        String actual = s.getTitle();
        Assert.assertEquals(expected, actual);
    }
}
