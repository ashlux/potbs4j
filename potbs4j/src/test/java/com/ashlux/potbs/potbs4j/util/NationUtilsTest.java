package com.ashlux.potbs.potbs4j.util;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;
import com.ashlux.potbs4j.vo.Nation;

public class NationUtilsTest
{
    @Test
    public void testGetNationality()
    {
        assertEquals("", NationUtils.getNationality( null ));
        assertEquals("English", NationUtils.getNationality( Nation.ENGLAND ));
        assertEquals("French", NationUtils.getNationality( Nation.FRANCE ));
        assertEquals("Dutch", NationUtils.getNationality( Nation.DUTCH ));
        assertEquals("Pirates", NationUtils.getNationality( Nation.PIRATE ));
        assertEquals("Spanish", NationUtils.getNationality( Nation.SPAIN ));
    }
}
