class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.printPlaylist();
        playlist.nextSong();
        playlist.nextSong();
        playlist.removeSong("20 Cigarettes");
        playlist.printPlaylist();
        playlist.removeSong("Hooligan");
        playlist.printPlaylist();
        playlist.removeSong("All the Love");
        playlist.removeSong("American Girls");
        playlist.removeSong("E85");
        playlist.removeSong("Risk it All");
        playlist.printPlaylist();



    }
}