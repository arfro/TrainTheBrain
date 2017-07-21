
public class AltChars_JUnit{

	@Test
	public void edgeCaseScenarios(){
		assertEquals(AltChars.isAlt(""), true);
		assertEquals(AltChars.isAlt("a"), true);
		assertEquals(AltChars.isAlt("ab"), true);
		assertEquals(AltChars.isAlt("1234"), false);

	}

	@Test
	public void normalCases(){
		assertEquals(AltChars.isAlt("macaroons"), false);
		assertEquals(AltChars.isAlt("mama"), true);
		assertEquals(AltChars.isAlt("maman"), true);
	}

}
