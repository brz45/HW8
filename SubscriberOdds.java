
public class SubscriberOdds implements Observer {
	
	int counOfoddEvents=0;
	PublisherImplementation pub=new PublisherImplementation();

	public SubscriberOdds() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean notifyObserver(Event e) {
		
		Observer o=new SubscriberOdds();
		int num=e.getEventData();
		
		if((num%2==1)) {
			
			System.out.println("Event number " + e.getEventNumber() +" "+ "is odd " + e.getEventData());
			counOfoddEvents=counOfoddEvents+1;
			
            return true;
		}
		if(counOfoddEvents>15)
		{
			
			o.unregisterMe(o);
			counOfoddEvents=0;
		}
		
		return false;
	}

	@Override
	public void unregisterMe(Observer p) {
		
		pub.removeObserver(p);
		System.out.println("Removed subscriber odds"+ p);
	}

}
