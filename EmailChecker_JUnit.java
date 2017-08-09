public class EmailChecker_JUnit{

	@Test
	public void edgeCaseScenarios(){
    assertEquals(EmailChecker.solution(1111111, 1000000), -1);
    assertEquals(EmailChecker.solution(2, 3111), 23111);

	}

	@Test
	public void normalCases(){
		assertEquals(EmailChecker.solution(""), );
		assertEquals(EmailChecker.solution(0, 0), 00);
	}

}
