package com.ashlux.potbs.potbs4j.util;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import com.ashlux.potbs4j.vo.PortName;

public class PortUtilsTest
{
    @Test
    public void testToString()
    {
        assertEquals(null, PortUtils.toString( null ));
        assertEquals("Ambergris", PortUtils.toString( PortName.AMBRGS ));
        assertEquals("Belle Isle", PortUtils.toString( PortName.BEL_ISL ));
    }
}
