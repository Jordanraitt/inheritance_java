import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jordan", "AB12345D", 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jordan", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AB12345D", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(60.00, databaseAdmin.raiseSalary(10.00), 0.01);
    }

    @Test
    public void canHaveBonus() {
        assertEquals(0.50, databaseAdmin.bonus(), 0.01);
    }
}
