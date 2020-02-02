import java.io.Serializable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
//BillboardProperty
public class j100 implements Serializable{
    private  IntegerProperty rank;
    private IntegerProperty  lastWeek;
    private StringProperty song;
    private StringProperty imagesrc;
    private StringProperty artistsrc;
    private StringProperty artist;
    
    public j100(){
        this.rank = new SimpleIntegerProperty();
        this.lastWeek = new SimpleIntegerProperty();
        this.song = new SimpleStringProperty();
        this.imagesrc = new SimpleStringProperty();
        this.artist = new SimpleStringProperty();
    }

    public IntegerProperty rankProperty(){
        return rank;
    }

    public IntegerProperty lastWeekProperty(){
        return lastWeek;
    }

    public StringProperty songProperty(){
        return song;
    }

    public StringProperty imagesrcProperty(){
        return imagesrc;
    }

    public StringProperty artistProperty(){
        return artist;
    }

    public int getRank(){
        return rank.getValue();
    }

    public void setRank(int rank){
        this.rank.setValue(rank);
    }

    public String getSong(){
        return song.getValue();
    }

    public void setSong(String song){
        this.song.setValue(song);
    }

    public int getLastweek(){
        return lastWeek.getValue();
    }

    public void setLastweek(int lastWeek){
        this.lastWeek.setValue(lastWeek);
    }

    public String getImagesrc(){
        return imagesrc.getValue();
    }

    public void setImagesrc(String imagesrc){
        this.imagesrc.setValue(imagesrc);
    }

    public String getArtistsrc(){
        return artistsrc.getValue();
    }

    public void setArtistsrc(String artistsrc){
        this.artistsrc.setValue(artistsrc);
    }

    public String getArtist(){
        return artist.getValue();
    }

    public void setArtist(String artist){
        this.artist.setValue(artist);
    }

    @Override
    public String toString(){
        return "[rank="+rank.getValue() +" ,song=" + song.getValue() +" ,lastWeek=" + lastWeek.getValue() +" ,imagesrc=" + imagesrc.getValue() +" ,artist=" + artist.getValue()+"]";
    }
}