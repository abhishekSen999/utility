package codes.sen.utility;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAssert {

    @Test
    public void testNonAssignableTypesThrowsExceptionAssignableTypes() {

        assertThrows(IllegalArgumentException.class, () -> Assert.nonAssignableTypes(Number.class, Integer.class));
    }

    @Test
    public void testNonAssignableTypes() {
        Assert.nonAssignableTypes(String.class, Integer.class);
    }

    @Test
    public void testNotNullThrowsExceptionForNullObject() {
        assertThrows(IllegalArgumentException.class, () -> Assert.notNull(null , "Null"));
    }

    @Test
    public void testNotNull(){
        Assert.notNull("","");
    }


}
