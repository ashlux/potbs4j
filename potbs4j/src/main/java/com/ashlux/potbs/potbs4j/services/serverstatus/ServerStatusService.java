package com.ashlux.potbs.potbs4j.services.serverstatus;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs4j.vo.ServerDocument;
import com.ashlux.potbs4j.vo.ServerListDocument;

public interface ServerStatusService
{
    ServerListDocument getAllServersStatus()
        throws PotbsServiceException;

    ServerDocument getServerStatus(String server)
        throws PotbsServiceException;
}
