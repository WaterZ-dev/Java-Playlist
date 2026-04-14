// This is where song information will be stored
// artist name / song name
// file path to mp3
class Song {
    private final String title;    // The basic fields that are part of a song
    private final String artist;
    private final String filepath;
    private Song next = null;
    private Song prev = null;

    // Constructor
    Song (String title, String artist, String filepath){
        this.title = title;
        this.artist = artist;
        this.filepath = filepath;
    }

    // Getters and Setters
    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getFilePath(){
        return filepath;
    }

    public void setNext(Song next){
        this.next = next;
    }

    public void setPrev(Song prev){
        this.prev = prev;
    }

    public Song getNext(){
        return next;
    }

    public Song getPrev(){
        return prev;
    }

}