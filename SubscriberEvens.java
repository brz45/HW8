
public class SubscriberEvens implements Observer {

	public SubscriberEvens()
	{
	}

	@Override
	public boolean notifyObserver(Event e) {
		int num=e.getEventData();
		if((num%2==0)) {
			
			System.out.println("Event number " + e.getEventNumber() + " "+"is even " + e.getEventData());
			return true;
		}
		return false;
	}

	@Override
	public void unregisterMe(Observer p) {
		
	}

}
