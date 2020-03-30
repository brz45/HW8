import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublisherImplementation implements PublisherInterface{
	
	private List<Observer> subscribers = new ArrayList<Observer>();
	

	@Override
	public void registerObserver(Observer o) {
		subscribers.add(o);
		
		
	}

	@Override
	public void removeObserver(Observer o) {
		subscribers.remove(o);
		
	}

	@Override
	public void notifyObservers(Observer o) {
		
		
	}
	
	public void notifyObserver(Event e)
	{
		for (Observer s : subscribers) {
			s.notifyObserver(e);
		}
		
	}
	
	private Event generateEvent(int eventNumber)
	{
		
	   Random rand = new Random(); 
	   
     
       int eventData = rand.nextInt(5000); 
	
	   Event e=new Event(eventNumber,eventData);
		
		return e;
		
	}
	
	public void runSimulation()
	{
		PublisherImplementation pub =new PublisherImplementation ();
		SubscriberOdds sodds=new SubscriberOdds ();
		SubscriberEvens sevens=new SubscriberEvens();
		SubscriberThrees sthrees=new SubscriberThrees();
		pub.registerObserver(sodds);
		pub.registerObserver(sevens);
		pub.registerObserver(sthrees);
		for(int i=1;i<201;i++)
		{
			Event iterationNumber=pub.generateEvent(i);
			if(pub.subscribers.contains(sodds))
			{
				sodds.notifyObserver(iterationNumber);
				//System.out.println("Subscriber odds is being notified ");
				
			}
			if(pub.subscribers.contains(sevens))
			{
				sevens.notifyObserver(iterationNumber);
				//System.out.println("Subscriber evens is being notified ");
			}
			
			if(pub.subscribers.contains(sthrees))
			{
				sthrees.notifyObserver(iterationNumber);
				//System.out.println("Subscriber threes is being notified ");
				
			}
			if(i==40 || i== 120 || i== 160||i==200)
			{
				if(!pub.subscribers.contains(sodds))
				{
					pub.registerObserver(sodds);
				}
				if(!pub.subscribers.contains(sthrees))
				{
					pub.registerObserver(sthrees);
				}
			}
		}
		
	}
}
