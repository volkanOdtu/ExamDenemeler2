import java.util.HashMap;

//Normalde bir cache classi item larini load ederken ,bir strategy izlemez
//Burda biz bir item eklerken dusunecegiz ,tum uzer lar yuklenmesine gerek olmayabilir
//Ama tum book lar yuklenmelidir, veya tum iller ,ilceler serverlarda yasamalidir
//Ve server lar bi degisiklik olursa ,cache lerini guncellemelidir ,bunun icin
//Hashmap lerin metodlarini direk kullanmiyoruz cunmu add den sonra guncelleme yapicaz 
// diger server lara veya cache olusur olusmaz CacheRegistry e kendimizi eklemeliyiz
public abstract class CachedDictionary<T, K> extends HashMap<T, K> implements ICacheListener
{
	//CacheLoadStrategy cacheLoadStrategy =CacheLoadStrategy.All ; 
	
	private static final long serialVersionUID = 1L;
	
	//private Object syncRoot = new Object();
	private final static Object lock = new Object();
	
	public CachedDictionary()
	{
	}	
	
	@Override
	public K put(T key, K value)
	{
		if(!super.containsKey(key) )
			super.put(key, value);
		return value;
	}
	
	@Override
	public K get(Object key)
	{
		K val = null;
		
		if( super.containsKey(key)== true )
		{
			val= super.get(key);
			return val;
		}

		synchronized(lock){
			Load();			
		}
		return super.get(key);
		
	}
	
	protected abstract void Load( );
	
	//Eger override edilmezse derived class ta true doner ,yani tüm server lara CachReplicator 
	//bu key li item i replicate et der
	protected boolean ReplicateCache(T key)
	{
		return true;
	}
	public void Reload(T key)
	{
		//OnBeforeReload();
		Load();
		if(ReplicateCache(key)) //Burda diger serverlarda refresh edilecek
		{}
		
		//OnAfterReload();		
	}
	
	public void OnCacheUpdate(String id)
	{
		
		
	}
	//derived metodlar ovveride edebilsin diye yazildi
	//protected void OnBeforeReload(){}
	//derived metodlar ovveride edebilsin diye yazildi
	//protected void OnAfterReload(){}
	
	
}
