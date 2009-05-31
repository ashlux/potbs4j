package com.ashlux.potbs.potbs4j.services.translation;

import com.ashlux.potbs.potbs4j.services.AbstractPotbsService;
import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs4j.vo.StringsDocument;

public class StringTranslationsServiceImpl
    extends AbstractPotbsService
    implements StringTranslationsService
{
    private static final long MINIMUM_UPDATE_FREQUENCY_IN_MINUTES = 1440;

    public StringTranslationsServiceImpl( String apiKey, String userId )
    {
        super( apiKey, userId );
    }

    @Override
    public StringsDocument getStringTranslations()
        throws PotbsServiceException
    {
        return (StringsDocument) executeService( "http://data.burningsea.com/static/strings" );
    }

    @Override
    public long getMinimumUpdateFrequency()
    {
        return MINIMUM_UPDATE_FREQUENCY_IN_MINUTES;
    }
}
