package com.ashlux.potbs.potbs4j.exception;

public class PotbsServiceException extends PotbsException
{
    public PotbsServiceException()
    {
    }

    public PotbsServiceException( String message )
    {
        super( message );
    }

    public PotbsServiceException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public PotbsServiceException( Throwable cause )
    {
        super( cause );
    }
}
