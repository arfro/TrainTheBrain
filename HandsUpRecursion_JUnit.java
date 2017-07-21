import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HandsUpRecursion_JUnit{

	@Test
	public void normalCases(){
		assertEquals(HandsUpRecursion.handsUp(3), 4);
		assertEquals(HandsUpRecursion.handsUp(15), 4);
	}

	@Test
	public void edgeCaseScenarios(){
		assertEquals(HandsUpRecursion.handsUp(0), 0);
	}

}
