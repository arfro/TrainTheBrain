import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Initials_JUnit{

	@Test
	public void normalCases(){
		assertEquals(Initials.buildInitials("annette caroline lastname"), "A. C. Lastname");
    assertEquals(Initials.buildInitials("Annette CAROline lasTNAMe"), "A. C. Lastname");
    assertEquals(Initials.buildInitials("Annette CAROline"), "A. Caroline");
	}

	@Test
	public void edgeCases(){
    assertEquals(Initials.buildInitials("ANNETTE"), "Annette");
    assertEquals(Initials.buildInitials(""), "N/A");
    assertEquals(Initials.buildInitials("    Not trimmed"), "N. Trimmed");
    assertEquals(Initials.buildInitials("            "), "N/A");
	}

}
