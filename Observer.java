public interface Observer {
	
	public boolean notifyObserver(Event e);
	public void unregisterMe(Observer p);
	

}
