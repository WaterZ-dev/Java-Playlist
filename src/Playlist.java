//Playlist functions as the main file and works with DoublyLinkedList to load and navigate through the audio files

public class Playlist {

    private Song head = null;
    private Song tail = null;
    private int size = 0;

    public Playlist(){ // Constructor

    }

    // PLAYLIST METHODS

    public void addSong(String title, String artist, String filepath){
        Song track = new Song(title, artist, filepath);
        if (size == 0){
            head = track;
            tail = track;
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
        } else if (size == 1){ // If there is only 1 song in the playlist
            head = null;
            tail = null;
            size--;
        } else {
            while (songName != null){

                if(songName.getTitle().equals(title)){

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
}
