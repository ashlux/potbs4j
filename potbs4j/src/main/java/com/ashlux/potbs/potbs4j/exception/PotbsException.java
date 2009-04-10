package com.ashlux.potbs.potbs4j.exception;

public class PotbsException
    extends Exception
{
    public PotbsException()
    {
    }

    public PotbsException( String message )
    {
        super( message );
    }

    public PotbsException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public PotbsException( Throwable cause )
    {
        super( cause );
    }
}
