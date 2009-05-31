package com.ashlux.potbs.potbs4j.services.translation;

import com.ashlux.potbs.potbs4j.services.PotbsService;
import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs4j.vo.StringsDocument;

public interface StringTranslationsService
    extends PotbsService
{
    StringsDocument getStringTranslations()
        throws PotbsServiceException;
}
