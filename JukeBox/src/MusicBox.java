import java.util.List;

public class MusicBox implements IPanel {
	public CD  cd;
	public PlayList playList;
	
	Song currentSong = null;
	
	
	public MusicBox(CD cd) {
		this.cd = cd;
		
		for(Song s :cd.songs)
			this.playList.AddSong(s);
	}

	public MusicBox(PlayList playList) {
		this.playList = playList;
	}

	@Override
	public void play() {
		System.out.println("Current song is playing: " + playList.getNextSong().name ); 
	}
	@Override
	public void pause() {
		System.out.println("Current song is paused: " + playList.getNextSong().name ); 		
	}
	
	@Override
	public Song getNext() {
		// TODO Auto-generated method stub
		return getNextSong();
	}
	
	@Override
	public Song getPrevious();
	{
		
	}
}
