
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DateValidationTest {

    @BeforeAll
    static void beforaAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    void init() {
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After ALl");
    }

    @Test
    public void testLeapYear() {
        assertEquals(true, DateValidation.leapYear(2000));
        assertEquals(true, DateValidation.leapYear(2004));
        assertEquals(false, DateValidation.leapYear(2001));
    }

    @Test
    public void testValidDate() {
        assertEquals(true, DateValidation.validDate(1));
        assertEquals(true, DateValidation.validDate(31));
        assertEquals(false, DateValidation.validDate(-1));
        assertEquals(false, DateValidation.validDate(32));
    }

    @Test
    public void testValidMonth() {
        assertEquals(true, DateValidation.validMonth(1));
        assertEquals(true, DateValidation.validMonth(12));
        assertEquals(false, DateValidation.validMonth(-1));
        assertEquals(true, DateValidation.validMonth(4));
    }

    @Test
    public void testValidYear() {
        assertEquals(false, DateValidation.validYear(1950));
        assertEquals(true, DateValidation.validYear(2018));
        assertEquals(false, DateValidation.validYear(1000));
        assertEquals(false, DateValidation.validYear(2050));
    }

    @Test
    public void testValidCombination() {
        assertEquals(false, DateValidation.validCombination(31, 3, 1980));
        assertEquals(true, DateValidation.validCombination(29, 2, 1000));
        assertEquals(true, DateValidation.validCombination(30, 4, 1980));
        assertEquals(false, DateValidation.validCombination(29, 2, 1991));
    }
}