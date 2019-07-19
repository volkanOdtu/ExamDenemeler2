import java.util.Queue;

public class PlayList {

	public Queue<Song> songs;
	
	public 
	public PlayList(Queue<Song> songs)
	{
		this.songs = songs;
	}
	public void AddSong(Song song)
	{
		songs.add(song);
	}
	public void RemoveSong(Song song)
	{
		songs.remove(song) ;
	}
	public void clearAll()
	{
		songs.clear();
	}
	public Song getNextSong()
	{
		return songs.peek();
	}
	public Song getPreviousSong()
	{
		return songs.
	}
}
