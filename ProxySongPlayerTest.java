import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ProxySongPlayerTest {
    SongPlayer newPlayer = new SongPlayer();
    ProxySongPlayer newProxy = new ProxySongPlayer(newPlayer);

    @Test
    public void testSearchById() {
        Song expected = newPlayer.getGallery().get(7);
        Song actual = newProxy.searchById(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSearchByAlbum() {
        List<Song> expected = new ArrayList<>();
        expected.add(newPlayer.getGallery().get(3));
        expected.add(newPlayer.getGallery().get(4));
        List<Song> actual = newProxy.searchByAlbum("Album_B");
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertTrue(expected.get(i) == actual.get(i));
        }
    }

    @Test
    public void testSearchByTitle() {
        List<Song> expected = new ArrayList<>();
        expected.add(newPlayer.getGallery().get(5));
        expected.add(newPlayer.getGallery().get(6));
        List<Song> actual = newProxy.searchByTitle("Song");
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertTrue(expected.get(i) == actual.get(i));
        }
    }
}
