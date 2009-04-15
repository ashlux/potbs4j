package com.ashlux.potbs.potbs4j.services;

import com.ashlux.potbs.potbs4j.exception.PotbsServiceException;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

abstract public class AbstractPotbsService
    implements PotbsService
{
    private String apiKey;

    private String userId;

    public AbstractPotbsService( String apiKey, String userId )
    {
        this.apiKey = apiKey;
        this.userId = userId;
    }

    protected XmlObject executeService( final String url )
        throws PotbsServiceException
    {
        XmlObject xmlObject = doPost( url );
        System.out.println(xmlObject);
        return xmlObject;
    }

    private XmlObject doPost( final String urlString )
        throws PotbsServiceException
    {
        String xml = null;
        try
        {
            URL url = new URL( urlString );
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoOutput( true );
            httpURLConnection.setRequestMethod( "POST" );
            httpURLConnection.addRequestProperty( "apikey", apiKey );
            httpURLConnection.addRequestProperty( "userid", userId );

            OutputStream outputStream = httpURLConnection.getOutputStream();
            IOUtils.write( "apikey=" + apiKey, outputStream );
            IOUtils.write( "&", outputStream );
            IOUtils.write( "userid=" + userId, outputStream );
            IOUtils.closeQuietly( outputStream );

            if ( httpURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK )
            {
                throw new PotbsServiceException(
                    "PotBS service returned [" + httpURLConnection.getResponseCode() + "], a non-OK response." );
            }

            InputStream inputStream = httpURLConnection.getInputStream();
            xml = IOUtils.toString( inputStream );
            IOUtils.closeQuietly( inputStream );
            return XmlObject.Factory.parse( xml );
        }
        catch ( IOException e )
        {
            throw new PotbsServiceException( "Error posting o PotBS service.", e );
        }
        catch ( XmlException e )
        {
            throw new PotbsServiceException( "Could not parse PotBS response xml=[" + xml + "].", e);
        }
    }
}
