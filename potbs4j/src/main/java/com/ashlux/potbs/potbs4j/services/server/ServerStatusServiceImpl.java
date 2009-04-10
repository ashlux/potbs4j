package com.ashlux.potbs.potbs4j.services.server;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs.potbs4j.services.AbstractPotbsService;
import com.ashlux.potbs4j.vo.ServerDocument;
import com.ashlux.potbs4j.vo.ServerListDocument;
import com.ashlux.potbs4j.vo.ServerName;

public class ServerStatusServiceImpl
    extends AbstractPotbsService
    implements ServerStatusService
{
    private static final String SERVER_STATUS_URL = "http://data.burningsea.com/servers";

    public ServerStatusServiceImpl( String apiKey, String userId )
    {
        super( apiKey, userId );
    }

    @Override
    public ServerListDocument getAllServerStatuses()
        throws PotbsServiceException
    {
        return (ServerListDocument) executeService( SERVER_STATUS_URL );
    }
       
    @Override
    public ServerDocument getServerStatus( ServerName.Enum serverName )
        throws PotbsServiceException
    {
        return (ServerDocument) executeService( SERVER_STATUS_URL + "/" + serverName );
    }
}
