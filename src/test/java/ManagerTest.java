import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jordan", "AB12345C", 100.00, "NotATest");
    }

    @Test
    public void hasName(){
        assertEquals("Jordan", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AB12345C", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("NotATest", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(110.00, manager.raiseSalary(10.00), 0.01);
    }

    @Test
    public void canHaveBonus() {
        assertEquals(1.00, manager.bonus(), 0.01);
    }

}
