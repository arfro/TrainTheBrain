public class DecimalZip_JUnit{

	@Test
	public void edgeCaseScenarios(){
    assertEquals(DecimalZip.solution(1111111, 1000000), -1);
    assertEquals(DecimalZip.solution(2, 3111), 23111);

	}

	@Test
	public void normalCases(){
		assertEquals(DecimalZip.solution(1231, 1000), 11203010);
		assertEquals(DecimalZip.solution(0, 0), 00);
	}

}
