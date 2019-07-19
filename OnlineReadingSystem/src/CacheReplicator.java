import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class CacheReplicator {

	static HashMap<String,List<ICacheListener> >registeredListeners = new HashMap<>();

	static List<String> replicationHosts;
	
	static final Object lock = new Object();
	
	public static void AddListener(String id, ICacheListener  listener) 
	 {
		if(!registeredListeners.containsKey(id)) 
		{
			//Burda yer aliniyor
			synchronized(lock) //(CacheReplicator.class)
			{
		        if(!registeredListeners.containsKey(id)) 
		        	registeredListeners.put(id, new ArrayList<ICacheListener>()) ;
		     }
			if(!registeredListeners.get(id).contains(listener)) 
				registeredListeners.get(id).add(listener); 			
		 }
	}
	
	public static void OnCacheReplication(CacheMessage msg) 
	{
		if(registeredListeners.containsKey(msg.CacheId)) {
			for(ICacheListener listener :registeredListeners.get(msg.CacheId)) {
			      	listener.OnCacheUpdate(msg.CacheId); 
			}
		}
	}
	
	public static void SendUpdate(String cacheId, Object key, String userCode)
	{/*
		List<String> hosts = GetReplicationHosts();
		try {
			
		}*/
	}
	
}
