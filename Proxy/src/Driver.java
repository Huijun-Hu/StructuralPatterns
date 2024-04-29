public class Driver {
    public static void main(String[] args) {
        SongPlayer songPlayer = new SongPlayer();
        ProxySongPlayer proxyServer = new ProxySongPlayer(songPlayer);

        // song gallery
        // gallery.put(1, new Song(1, "Song1", "Album_A", 200));
        // gallery.put(2, new Song(1, "Song2", "Album_A", 210));
        // gallery.put(3, new Song(1, "Song3", "Album_B", 203));
        // gallery.put(4, new Song(1, "Song4", "Album_B", 220));
        // gallery.put(5, new Song(1, "Song", "Album_C", 190));
        // gallery.put(6, new Song(1, "Song", "Album_D", 185));
        // gallery.put(7, new Song(1, "Song7", "Album_E", 195));
        // gallery.put(8, new Song(1, "Song8", "Album_E", 207));

        // id 1 is not in cache, will take 1 sec to load
        proxyServer.searchById(1).play();
        System.out.println();

        // id 5 is not in cache, will take 1 sec to load
        proxyServer.searchById(5);
        System.out.println();

        // will load 5 and 6, since 5 is already in cache, it wont take much time to
        // load but will take 1 sec to load 6
        proxyServer.searchByTitle("Song");
        System.out.println();

        // now it is in cache, it will load immediately
        proxyServer.searchById(1).play();
        System.out.println();

        // will load 1 and 2, since 1 is already in cache, it wont take much time to
        // load but will take 1 sec to load 2
        proxyServer.searchByAlbum("Album_A");
        System.out.println();
    }
}
