package com.ashlux.potbs.potbs4j.services;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlException;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class AbstractPotbsService
{
    private String apiKey;
    private String userId;

    public AbstractPotbsService( String apiKey, String userId )
    {
        this.apiKey = apiKey;
        this.userId = userId;
    }

    protected XmlObject parse( InputStream inputStream )
        throws PotbsServiceException
    {
        String xml = null;
        try
        {
            xml = IOUtils.toString( inputStream );
            return XmlObject.Factory.parse( xml );
        }
        catch ( XmlException e )
        {
            throw new PotbsServiceException( "Could not parse xml=[" + xml + "].", e);
        }
        catch ( IOException e )
        {
            throw new PotbsServiceException( "Could not read stream from post.", e);
        }

    }

    protected InputStream doPost( final String url )
        throws PotbsServiceException
    {
        return doPost( url, new LinkedList<NameValuePair>() );
    }

    protected InputStream doPost( final String url, final List<NameValuePair> data )
        throws PotbsServiceException
    {
        try
        {
            HttpClient httpClient = new HttpClient( );
            data.add( new NameValuePair( "apikey", this.apiKey ) );
            data.add( new NameValuePair( "userid", this.userId ) );
            PostMethod postMethod = new PostMethod( url );
            postMethod.setRequestBody( data.toArray( new NameValuePair[data.size()] ));
            httpClient.executeMethod( postMethod );
            return postMethod.getResponseBodyAsStream();
        }
        catch ( IOException e )
        {
            throw new PotbsServiceException( "Could not post.", e );
        }
    }
}
