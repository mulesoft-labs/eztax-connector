/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.api;

import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.eztaxwebservice.ArrayOfAddressData;
import org.datacontract.schemas._2004._07.eztaxwebservice.ArrayOfTaxData;
import org.datacontract.schemas._2004._07.eztaxwebservice.Transaction;
import org.datacontract.schemas._2004._07.eztaxwebservice.ZipAddress;
import org.mule.modules.CalculationStrategyType;

/**
 * 
 * @author Gaston Ponti
 * @since Nov 30, 2011
 */
public interface EZTaxClient
{
    public ArrayOfTaxData calculateTaxes(CalculationStrategyType strategy, Transaction transaction);
    
    public ArrayOfTaxData calculateAdjustment(CalculationStrategyType strategy, Transaction transaction);
    
    public ArrayOfAddressData getAddress(Long pCode);
    
    public String getTaxCategory(Integer taxCode);
    
    public String getTaxDescription(Integer taxCode);
    
    public Long convertFipsToPcode(String fips);
    
    public Long convertNpanxxToPcode(Long npanxxCode);
    
    public Long convertZipToPcode(ZipAddress zipAddress);
    
    public XMLGregorianCalendar getServerTime();
}
