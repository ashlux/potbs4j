package com.ashlux.potbs.potbs4j.services.serverstatus;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs.potbs4j.services.AbstractPotbsService;
import com.ashlux.potbs4j.vo.ServerDocument;
import com.ashlux.potbs4j.vo.ServerListDocument;

import java.io.InputStream;

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
    public ServerListDocument getAllServersStatus()
        throws PotbsServiceException
    {
        InputStream inputStream = doPost( SERVER_STATUS_URL );
        return (ServerListDocument) parse( inputStream );
    }
       
    @Override
    public ServerDocument getServerStatus( String server )
        throws PotbsServiceException
    {
        InputStream inputStream = doPost( SERVER_STATUS_URL + "/" + server );
        return (ServerDocument) parse( inputStream );
    }
}
