package com.ashlux.potbs.potbs4j.util;

import com.ashlux.potbs4j.vo.Nation;
import org.apache.commons.lang.ObjectUtils;

public class NationUtils
{
    private NationUtils()
    {
    }

    public static String getNationality( Nation.Enum nation)
    {
        if ( Nation.ENGLAND.equals( nation ) )
        {
            return "English";
        }

        if ( Nation.FRANCE.equals( nation ) )
        {
            return "French";
        }

        if ( Nation.DUTCH.equals( nation ) )
        {
            return "Dutch";
        }

        if ( Nation.SPAIN.equals( nation ) )
        {
            return "Spanish";
        }

        if ( Nation.PIRATE.equals( nation ) )
        {
            return "Pirates";
        }

        return ObjectUtils.toString( nation );
    }
}
