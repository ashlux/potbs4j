package com.ashlux.potbs.potbs4j.services.server;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs.potbs4j.services.PotbsService;
import com.ashlux.potbs4j.vo.ServerDocument;
import com.ashlux.potbs4j.vo.ServerListDocument;
import com.ashlux.potbs4j.vo.ServerName;

public interface ServerStatusService
    extends PotbsService
{
    ServerListDocument getAllServerStatuses()
        throws PotbsServiceException;

    ServerDocument getServerStatus( ServerName.Enum serverName )
        throws PotbsServiceException;
}
