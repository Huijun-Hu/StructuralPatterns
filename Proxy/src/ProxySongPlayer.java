import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProxySongPlayer implements SongService {
    private SongPlayer realPlayer;
    private HashMap<Integer, Song> cache = new HashMap<>();;

    public ProxySongPlayer(SongPlayer server) {
        this.realPlayer = server;
    }

    @Override
    public Song searchById(Integer songID) {
        if (!cache.containsKey(songID)) {
            Song s = realPlayer.searchById(songID);
            cache.put(songID, s);
            return s;
        } else {
            System.out.println("Loaded song with id " + songID + ". (0sec)");
            return cache.get(songID);
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> l = new ArrayList<>();
        for (int k : realPlayer.getGallery().keySet()) {
            if (realPlayer.getGallery().get(k).getTitle() == title) {
                l.add(searchById(k));
            }
        }
        return l;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> l = new ArrayList<>();
        for (int k : realPlayer.getGallery().keySet()) {
            if (realPlayer.getGallery().get(k).getAlbum() == album) {
                l.add(searchById(k));
            }
        }
        return l;
    }

}
