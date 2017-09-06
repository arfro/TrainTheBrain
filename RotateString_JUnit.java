public class RotateString_JUnit

	@Test
	public void RotateString_rotateString_RotateByLength(){
    assertEquals("ABCDE", RotateString.rotateString("ABCDE", 5));

	}
  
  @Test
	public void RotateString_rotateString_RotateByZero(){
    assertEquals("ABCDE", RotateString.rotateString("ABCDE", 0));

	}
  
  @Test
	public void RotateString_rotateString_RotateLong(){
    assertEquals("LMNOPRSTUV224522522GGGABCDEFGHIJK", RotateString.rotateString("ABCDEFGHIJKLMNOPRSTUV224522522GGG", 11));

	}
  
  @Test
	public void RotateString_rotateString_RotateByNegative(){
    assertEquals("ABCDEFGHIJKLMNOPRSTUV224522522GGG", RotateString.rotateString("ABCDEFGHIJKLMNOPRSTUV224522522GGG", -6));

	}
  
  @Test
	public void RotateString_rotateString_RotateLongWithSpecialChar(){
    assertEquals("TUV224522522GGGABC@*&@#&&S", RotateString.rotateString("ABC@*&@#&&STUV224522522GGG", 10));

	}
  
}
