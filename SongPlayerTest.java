import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class SongPlayerTest {
    SongPlayer newPlayer = new SongPlayer();

    @Test
    public void testGetGallery() {
        int expected = 8;
        int actual = newPlayer.getGallery().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSearchById() {
        Song expected = newPlayer.getGallery().get(7);
        Song actual = newPlayer.searchById(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSearchByAlbum() {
        List<Song> expected = new ArrayList<>();
        expected.add(newPlayer.getGallery().get(3));
        expected.add(newPlayer.getGallery().get(4));
        List<Song> actual = newPlayer.searchByAlbum("Album_B");
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertTrue(expected.get(i) == actual.get(i));
        }
    }

    @Test
    public void testSearchByTitle() {
        List<Song> expected = new ArrayList<>();
        expected.add(newPlayer.getGallery().get(5));
        expected.add(newPlayer.getGallery().get(6));
        List<Song> actual = newPlayer.searchByTitle("Song");
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertTrue(expected.get(i) == actual.get(i));
        }
    }
}
