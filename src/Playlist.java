// Playlist: doubly linked list data structure that stores Song nodes.
// Supports adding, removing, and navigating through songs.
public class Playlist {

    private Song head = null;
    private Song tail = null;
    private int size = 0;
    private Song playing = null; // keeps track of the song that is playing at the time.

    public Playlist(){ // Constructor
        addSong("20 Cigarettes", "Morgan Wallen", "/audio/20Cigarettes--MorganWallen.mp3");
        addSong("All the Love", "Ye", "/audio/AlltheLove--Ye.mp3");
        addSong("American Girls", "Harry Styles", "/audio/AmericanGirls--HarryStyles.mp3");
        addSong("E85", "Don Toliver", "/audio/E85--DonToliver.mp3");
        addSong("Hooligan", "BTS", "/audio/Hooligan--BTS.mp3");
        addSong("Risk it All", "Bruno Mars", "/audio/RiskitAll--BrunoMars.mp3");
        addSong("Seeing Someone", "Luke Combs", "/audio/SeeingSomeone--LukeCombs.mp3");
        addSong("So Easy", "Olivia Dean", "/audio/SoEasy--OliviaDean.mp3");
        addSong("Turista", "Bad Bunny", "/audio/Turista--BadBunny.mp3");
        addSong("Saint James Infirmary", "Louis Armstrong", "/audio/song1.mp3");

    }

    // PLAYLIST METHODS

    public void addSong(String title, String artist, String filepath){
        Song track = new Song(title, artist, filepath); // track as in the current song
        if (size == 0){
            head = track;
            tail = track;
            playing = track; // also sets the song that is clicked to the head
        } else {
            track.setPrev(tail);
            tail.setNext(track);
            tail = track;
        }
        size++;
    }

    public void removeSong(String title){
        Song songName = head;
        if (size == 0){ // If playlist is EMPTY
            System.out.println("Playlist is EMPTY");
        } else if (size == 1){// If there is only 1 song in the playlist
            if (head.getTitle().equals(title)){
                if (head == playing) {
                    playing = null; // Moves playing pointer also
                }
                head = null;
                tail = null;

                size--;
            }
        } else {
            while (songName != null){

                if(songName.getTitle().equals(title)){

                    if (songName == playing){
                        if (songName.getNext() != null){
                            playing = songName.getNext();
                        } else {
                            playing = songName.getPrev();
                        }
                    }

                    if (songName == head) { // If the song to delete is the first one(head)
                        head = songName.getNext();

                        if (head != null){ // So code doesn't break (null exception)
                            head.setPrev(null);
                        }
                        size--;
                        break;
                    }

                    else if (songName == tail){ // if the song to delete is the last one(tail)
                        tail = songName.getPrev();

                        if (tail != null){
                            tail.setNext(null);
                        }
                        size--;
                        break;
                    } else { // Deletes song by name and if it doesn't satisfy the other cases.
                        songName.getPrev().setNext(songName.getNext());
                        songName.getNext().setPrev(songName.getPrev());
                        size--;
                        break;
                    }
                }
                songName = songName.getNext();
            }
        }


    }

    public Song nextSong(){
        if (playing == null){
            return null;
        }

        else if (playing.getNext() != null){
            playing = playing.getNext();
        } else {
            // loop it back to head
            playing = head;
        }
        return playing;
    }

    public Song prevSong(){
        if (playing == null){
            return null;
        }

        else if (playing.getPrev() != null){
            playing = playing.getPrev();
        } else {
            // loop it back to tail if you're playing the first song.
            playing = tail;
        }
        return playing;
    }

    public void printPlaylist(){
        int counter = 0; // song counter
        if (size == 0){
            System.out.println("PLAYLIST IS EMPTY");
        } else {
            Song songName = head;
            while (songName != null){
                counter = counter + 1;
                System.out.println(counter + ". " + songName.getTitle() + " - " + songName.getArtist());
                songName = songName.getNext();
            }

        }

    }

    public int getSize(){ //
        return size;
    }

    public Song getPlaying(){ // gets current song thet is playing
        return playing;
    }
}
