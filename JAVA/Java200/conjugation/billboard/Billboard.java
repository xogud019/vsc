import java.io.Serializable;

public class Billboard implements Serializable{ //billboard
    private int rank;
    private int lastWeek;
    private String song;
    private String imagesrc;
    private String artistsrc;
    private String artist;
    
    public Billboard(){}

    public Billboard(int rank, String song, int lastWeek,String imagesrc, String artistsrc, String artist){
        super();
        this.rank = rank;
        this.song= song;
        this.lastWeek= lastWeek;
        this.imagesrc = imagesrc;
        this.artistsrc =artistsrc;
        this.artist = artist;
    }

    public Billboard(int rank, String song, int lastWeek,String imagesrc, String artist){
        super();
        this.rank = rank;
        this.song= song;
        this.lastWeek= lastWeek;
        this.imagesrc = imagesrc;
        this.artist = artist;
    }

    @Override
    public String toString(){
        return "[rank="+rank +" ,song=" + song +" ,lastWeek=" + lastWeek +" ,imagesrc=" + imagesrc +" ,artist=" + artist+"]";
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank){
        this.rank =rank;
    }

    public String getSong(){
        return song;
    }

    public void setSong(String song){
        this.song =song;
    }

    public int getLastweek(){
        return lastWeek;
    }

    public void setLastweek(int lastWeek){
        this.lastWeek =lastWeek;
    }

    public String getImagesrc(){
        return imagesrc;
    }

    public void setImagesrc(String imagesrc){
        this.imagesrc =imagesrc;
    }

    public String getArtistsrc(){
        return artistsrc;
    }

    public void setArtistsrc(String artistsrc){
        this.artistsrc =artistsrc;
    }

    public String getArtist(){
        return artist;
    }

    public void setRArtist(String artist){
        this.artist =artist;
    }

}