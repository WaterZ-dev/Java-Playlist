class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Song 1", "Artist 1", "resources/audio/song1.mp3");
        playlist.addSong("Song 2", "Artist 2", "resources/audio/song2.mp3");
        playlist.addSong("Song 3", "Artist 3", "resources/audio/song3.mp3");

        playlist.removeSong("Song 2");
    }
}