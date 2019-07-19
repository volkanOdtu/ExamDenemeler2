
public class CacheReplicatorThread {

    String cacheId;
    Object key;
    String userId;
    String hosts;

    public CacheReplicatorThread(String cacheId, String userId,String hosts)
    {
        this.cacheId = cacheId;
        this.userId = userId;
        this.hosts = hosts; 
    }

	public void ThreadMethod()
	{/*
        String[] hostlar = hosts.split(new char [',']);

        Uri uri;
	*/
	}
    public void Run()
    {/*
        try
        {
            Thread thread = new Thread(new ThreadStart(ThreadMethod));
            thread.IsBackground = true;
            thread.Start();

        }
        catch (Exception e)
        { throw new SystemException(); }
        */
    }

}
