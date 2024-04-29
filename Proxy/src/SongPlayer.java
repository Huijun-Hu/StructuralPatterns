import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SongPlayer implements SongService {

    HashMap<Integer, Song> gallery = new HashMap<>();

    public SongPlayer() {
        gallery.put(1, new Song(1, "Song1", "Album_A", 200));
        gallery.put(2, new Song(1, "Song2", "Album_A", 210));
        gallery.put(3, new Song(1, "Song3", "Album_B", 203));
        gallery.put(4, new Song(1, "Song4", "Album_B", 220));
        gallery.put(5, new Song(1, "Song", "Album_C", 190));
        gallery.put(6, new Song(1, "Song", "Album_D", 185));
        gallery.put(7, new Song(1, "Song7", "Album_E", 195));
        gallery.put(8, new Song(1, "Song8", "Album_E", 207));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            System.out.println("Loading song with id " + songID + "... (1sec)");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return gallery.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // each Song will take 1 sec to load
        List<Song> l = new ArrayList<>();
        for (int k : gallery.keySet()) {
            if (gallery.get(k).getTitle() == title) {
                l.add(this.searchById(k));
            }
        }
        return l;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // each Song will take 1 sec to load
        List<Song> l = new ArrayList<>();
        for (int k : gallery.keySet()) {
            if (gallery.get(k).getAlbum() == album) {
                l.add(this.searchById(k));
            }
        }
        return l;
    }

    public HashMap<Integer, Song> getGallery() {
        return gallery;
    }
}
