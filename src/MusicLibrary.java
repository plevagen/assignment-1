public class MusicLibrary{
    public static void main(String[] args){
        Artist artist1 = new Artist("Eminem", "Rap");
        Artist artist2 = new Artist("Pink Floyd", "Rock");

        song s1 = new song("Lose Yourself", 350, artist1);
        song s2 = new song("Bike", 207, artist2);

        playlist favourites = new playlist("Favourites songs", 10);
        favourites.addSong(s1);
        favourites.addSong(s2);

        favourites.showSongs();

        System.out.println("\n--- Comparing of duration ---");
            if(s1.getDuration() > s2.getDuration()){
                System.out.println(s1.getTitle() + " longer than " + s2.getTitle());
            }
            else if(s1.getDuration() < s2.getDuration()){
                System.out.println(s2.getTitle() + " longer than " + s1.getTitle());
            }
            else{
                System.out.println("Same duration");
            }
        }
    }