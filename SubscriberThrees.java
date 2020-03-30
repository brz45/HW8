
public class SubscriberThrees implements Observer {

	int counOfthreeEvents=0;
	PublisherImplementation pub=new PublisherImplementation();
	
	public SubscriberThrees() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean notifyObserver(Event e) {
		
		Observer o=new SubscriberThrees();
		int test=e.getEventData();
		int counOfthreeEvents=0;
		if((test%3==0)) {
			
			System.out.println("Event number " + e.getEventNumber() +" "+ "is divisible by 3 " + e.getEventData());
			counOfthreeEvents=counOfthreeEvents+1;
			return true;
		}
		if(counOfthreeEvents>12)
		{
			counOfthreeEvents=0;
			o.unregisterMe(o);
			
		}
		return false;
	}

	@Override
	public void unregisterMe(Observer p) {
		
		pub.removeObserver(p);
		
	}


}
