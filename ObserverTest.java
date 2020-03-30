import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObserverTest {
	
	private Observer ObserverTest1r =new SubscriberOdds();
	private List<Observer> subscribers = new ArrayList<Observer>();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFornotifyObserver() {
		try {
			Event e =new Event(1,201);
			boolean out =ObserverTest1r.notifyObserver(e);
			assertEquals(out,true);
		}
		catch(Exception e){
	        fail("Test Failed!!");
	        }
	}

	@Test
	void testForRemoveObserver() {
		try {
			
			int count=subscribers.size();; 

			ObserverTest1r.unregisterMe(ObserverTest1r);
			int aftercount=subscribers.size();
			
			assertEquals(count,aftercount);
		}
		catch(Exception e){
	        fail("Test Failed!!");
	        }
	}

	
	
	
}
