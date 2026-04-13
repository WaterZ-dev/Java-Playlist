// This is where song information will be stored
// artist name / song name
// file path to mp3
class Song {
    private final String title;
    private final String filepath;
    private Song next = null;
    private Song prev = null;

    // Constructor
    Song (String t, String f){
        this.title = t;
        this.filepath = f;
    }

    public String getTitle(){
        return title;
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