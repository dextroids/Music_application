package Music_Player;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String albumName;
    private String artistName;

    private List<song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList= new ArrayList<>();
    }

    public boolean findSongByTitle(String title){
        for(song song: songList){
            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;

    }
    public String addSongInAlbum(String title,double duration){
        if(findSongByTitle(title))
        {
            return "Song is already Added";
        }
        song songAdd = new song(title,duration);
        this.songList.add(songAdd);
        return "Song has been added sucessfully";
    }
    public String addSongToPlayList(int songNo, ArrayList<song> playList){
        int index=songNo-1;
        if(index>=0 && index<songList.size()){
            song addSong = songList.get(index);
            playList.add(addSong);
            return  "Song has been added in playlist";
        }
        return "Song no. entered is out of Song";
    }
    public String addSongToPlayList(String title, ArrayList<song> playList){
        for(song song:songList)
        {
            if(song.getTitle().equals(title))
            {
                playList.add(song);
                return "song has been added to playlist";
            }
        }
        return "No song found with given title";
    }

    }

