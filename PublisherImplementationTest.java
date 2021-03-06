import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublisherImplementationTest {

	PublisherImplementation p=new PublisherImplementation();
	SubscriberOdds o=new SubscriberOdds();
	private List<Observer> subscribers1 = new ArrayList<Observer>();
	
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
	void testRegisterObserver() {
		try {
			int beforeCount=0;
			p.registerObserver(o);
			int count1=subscribers1.size();
			assertEquals(beforeCount,count1);
		}
		catch(Exception e){
	        fail("Test Failed!!");
	        }
	}
	
	
	
	@Test
	void testRemoveObserver() {
		try {
			int beforeCount=0;
			p.removeObserver(o);
			int count1=subscribers1.size();
			assertEquals(beforeCount,count1);
		}
		catch(Exception e){
	        fail("Test Failed!!");
	        }
	}
	
	
}
