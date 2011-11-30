package org.mule.modules.api;

import java.lang.reflect.InvocationTargetException;

import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.eztaxwebservice.ArrayOfAddressData;
import org.datacontract.schemas._2004._07.eztaxwebservice.ArrayOfTaxData;
import org.datacontract.schemas._2004._07.eztaxwebservice.Transaction;
import org.datacontract.schemas._2004._07.eztaxwebservice.ZipAddress;
import org.mule.modules.CalculationStrategyType;
import org.mule.modules.exception.EZTaxRuntimeException;
import org.tempuri.IEZTaxWebService;

import ar.com.zauber.commons.ws.connection.ConnectionBuilder;

import com.billsoft.eztaxasp.eztaxwebservice.EZTaxWebService;

/**
 * @author Gaston Ponti
 * @since Nov 30, 2011
 */
public class DefaultEZTaxClient implements EZTaxClient
{
    private IEZTaxWebService port;
    
    public DefaultEZTaxClient(String username, String password)
    {
        port = ConnectionBuilder.fromPortType(IEZTaxWebService.class)
                        .withUsernameTokenAuth(username, password)
                        .withServiceType(EZTaxWebService.class)
                        .build();
    }

    /** @see org.mule.modules.api.EZTaxClient#calculateTaxes(org.mule.modules.CalculationStrategyType, org.datacontract.schemas._2004._07.eztaxwebservice.Transaction) */
    @Override
    public ArrayOfTaxData calculateTaxes(CalculationStrategyType strategy, Transaction transaction)
    {
        try
        {
            return (ArrayOfTaxData) port.getClass().getMethod("calcTaxesWith" + strategy.getStrategy(), Transaction.class).invoke(port, transaction);
        } 
        catch (InvocationTargetException e)
        {
            throw new EZTaxRuntimeException();
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }

    /** @see org.mule.modules.api.EZTaxClient#calculateAdjustment(org.mule.modules.CalculationStrategyType, org.datacontract.schemas._2004._07.eztaxwebservice.Transaction) */
    @Override
    public ArrayOfTaxData calculateAdjustment(CalculationStrategyType strategy, Transaction transaction)
    {
        try
        {
            return (ArrayOfTaxData) port.getClass().getMethod("calcAdjWith" + strategy.getStrategy(), Transaction.class).invoke(port, transaction);
        } 
        catch (InvocationTargetException e)
        {
            throw new EZTaxRuntimeException();
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }

    /** @see org.mule.modules.api.EZTaxClient#getAddress(java.lang.String) */
    @Override
    public ArrayOfAddressData getAddress(Long pCode)
    {
        return port.getAddress(pCode); 	
    }

    /** @see org.mule.modules.api.EZTaxClient#getTaxCategory(java.lang.Integer) */
    @Override
    public String getTaxCategory(Integer taxCode)
    {
        return port.getTaxCategory(taxCode); 	
    }

    /** @see org.mule.modules.api.EZTaxClient#getTaxDescription(java.lang.Integer) */
    @Override
    public String getTaxDescription(Integer taxCode)
    {
        	return port.getTaxDescription(taxCode);
    }

    /** @see org.mule.modules.api.EZTaxClient#convertFipsToPcode(java.lang.Long) */
    @Override
    public Long convertFipsToPcode(String fips)
    {
        	return port.fipsToPCode(fips);	
    }

    /** @see org.mule.modules.api.EZTaxClient#convertNpanxxToPcode(java.lang.Long) */
    @Override
    public Long convertNpanxxToPcode(Long npanxxCode)
    {
        	return port.npaNxxToPCode(npanxxCode);
    }

    /** @see org.mule.modules.api.EZTaxClient#convertZipToPcode(org.datacontract.schemas._2004._07.eztaxwebservice.ZipAddress) */
    @Override
    public Long convertZipToPcode(ZipAddress zipAddress)
    {
        	return port.zipToPCode(zipAddress);
    }

    /** @see org.mule.modules.api.EZTaxClient#getServerTime() */
    @Override
    public XMLGregorianCalendar getServerTime()
    {
        	return port.getServerTime();
    }
    
    
}
