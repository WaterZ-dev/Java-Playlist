//Playlist functions as the main file and works with DoublyLinkedList to load and navigate through the audio files

public class Playlist {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList<Song> playlist = new DoublyLinkedList<>();
        Node<Song> currentSong;
        //load songs
        File folder = new File("resources/audio");
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".mp3")) {
            	playlist.addLast(new Song(
                    file.getName(),
                    file.getPath()
                ));
            }
        }
        currentSong = playlist.get(0);
    }
}
