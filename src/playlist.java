public class playlist{
    private String playlistName;
    private song[] songs;
    private int count;

    public playlist(String name, int size){
        this.playlistName = name;
        this.songs = new song[size];
        this.count = 0;
    }

    public void addSong(song newSong){
        if (count < songs.length) {
            songs[count] = newSong;
            count++;
        }
        else{
            System.out.println("Playlist is full");
        }
    }

    public void showSongs(){
        System.out.println("\n--" + playlistName + "--");
        for(int i = 0; i < count; i++){
            songs[i].songView();
        }
    }
}