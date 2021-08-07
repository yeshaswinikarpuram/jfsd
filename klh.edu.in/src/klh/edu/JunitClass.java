package klh.edu;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
public class JunitClass {
  @Test
  public void SetUp(){
    String str = "This is KL University";
    assertEquals("This is KL University",str); 
  }
} 

