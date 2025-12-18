public class song{
    private String title;
    private int duration;
    private Artist artist;

    public song(String title, int duration, Artist artist){
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }

    public void songView(){
        int min = duration / 60;
        int sec = duration % 60;
        System.out.println("Artist " + artist + " Song " + title + " Length " + min + sec);
    }


}