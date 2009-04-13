package com.ashlux.potbs.potbs4j.services.landmark;

import com.ashlux.potbs4j.vo.PortListDocument;
import com.ashlux.potbs4j.vo.PortDocument;
import com.ashlux.potbs4j.vo.PortName;
import com.ashlux.potbs4j.vo.ServerName;
import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import com.ashlux.potbs.potbs4j.services.PotbsService;

public interface LandmarkStatusService
    extends PotbsService
    
{
    PortListDocument getAllLandmarkStatuses( ServerName.Enum serverName )
        throws PotbsServiceException;

    PortDocument getLandmarkStatus( ServerName.Enum serverName, PortName.Enum portName )
        throws PotbsServiceException;
}
