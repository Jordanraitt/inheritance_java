import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jordan", "AB12345D", 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jordan", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AB12345D", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(60.00, developer.raiseSalary(10.00), 0.01);
    }

    @Test
    public void canHaveBonus() {
        assertEquals(0.50, developer.bonus(), 0.01);
    }
}
