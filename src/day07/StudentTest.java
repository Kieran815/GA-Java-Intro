package day07;

// **** TESTING ****
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {

  // initialize a test instance:
  private Student kieran;

  @Before
  public void initStudent() {
    kieran = new Student("Kieran", "Milligan", 'A');
  }

  @Test
  public void testFullNameCorrect() {
//    Student kieran = new Student("Kieran", "Milligan", 'A');
    String expected = "Kieran Milligan"; // expected output
    String actualReturn = kieran.getFullName(); // run method and get actual result
    assertEquals(expected, actualReturn); // compare expected vs actual values
  }

  @Test
  public void testGetLetterGrade() {
//    Student kieran = new Student("Kieran", "Milligan", 'A');
    char expected = 'A';
    char actual = kieran.getLetterGrade();
    assertEquals(expected, actual);
  }



}