package com.ashlux.potbs.potbs4j.services.landmark;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs.potbs4j.services.AbstractPotbsService;
import com.ashlux.potbs4j.vo.PortDocument;
import com.ashlux.potbs4j.vo.PortListDocument;
import com.ashlux.potbs4j.vo.PortName;
import com.ashlux.potbs4j.vo.ServerName;

public class LandmarkStatusServiceImpl
    extends AbstractPotbsService
    implements LandmarkStatusService
{
    private static final long MINIMUM_UPDATE_FREQUENCY_IN_MINUTES = 10;

    public LandmarkStatusServiceImpl( String apiKey, String userId )
    {
        super( apiKey, userId );
    }

    @Override
    public PortListDocument getAllLandmarkStatuses( ServerName.Enum serverName )
        throws PotbsServiceException
    {
        String url = getLandmarkStatusUrl( serverName );
        return (PortListDocument) executeService( url );
    }

    @Override
    public PortDocument getLandmarkStatus( ServerName.Enum serverName, PortName.Enum portName )
        throws PotbsServiceException
    {
        String url = getLandmarkStatusUrl( serverName ) + "/" + portName;
        return (PortDocument) executeService( url );
    }

    String getLandmarkStatusUrl( ServerName.Enum serverName )
    {
        return "http://data.burningsea.com/servers/" + serverName + "/landmarks";
    }

    @Override
    public long getMinimumUpdateFrequency()
    {
        return MINIMUM_UPDATE_FREQUENCY_IN_MINUTES;
    }
}
