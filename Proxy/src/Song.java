public class Song {
    private int songID;
    private String title;
    private String album;
    private int duration;

    public Song(int songID, String title, String album, int duration) {
        this.songID = songID;
        this.title = title;
        this.album = album;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + this.title);
    }

    public int getSongID() {
        return songID;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

}
