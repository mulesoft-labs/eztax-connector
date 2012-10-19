/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules;

/**
 * @author Gaston Ponti
 * @since Nov 30, 2011
 */
public enum CalculationStrategyType
{
    /**
     * PCodes are permanent jurisdiction codes that BillSoft provides that allow 
     * EZTax users to populate their databases with jurisdiction information. 
     * With PCodes, BillSoft clients can populate their customer records with 
     * jurisdiction information and never worry about changes of jurisdiction 
     * codes. If a jurisdiction code changes, BillSoft re-maps the PCodes so 
     * clients are not effected. This allows BillSoft's clients to populate 
     * client records with a PCode.
     */
    Pcode("PCode"), 
    
    /**
     * FIPS Codes are issued by the National Institute of Standards and Technology 
     * (NIST). EZTax provides internal translation tables from FIPS Codes to PCodes, 
     * so that using FIPS Codes is almost as fast and accurate as using PCodes. 
     * Some special taxing districts are not identified in separate FIPS codes, 
     * so there is some loss of accuracy, but the majority of transactions will 
     * produce the same tax results with FIP Codes as with PCodes.
     */
    Fips("FipsCode"), 
    
    /**
     * When using NPANXXs to specify the jurisdiction, some special considerations 
     * must be addressed by the user. The first issue concerns toll free 800 and 
     * 888 numbers. The first 6 digits of these numbers do not constitute an NPANXX. 
     * Each 800/888 number is associated with a “ring to” number. The “ring to” 
     * number is the number that is actually reached when the 800/888 number is 
     * dialed. The NPANXX of the “ring to” number should be used as the NPANXX 
     * for the 800 number. This replacement must be made before the information 
     * is passed to the EZTax system. These issues also arise with 900 numbers.
     * <br/>
     * <br/>
     * Another item that requires special attention is account codes. Many switches 
     * are capable of producing CDRs with account codes in place of a “Bill To” 
     * number. Once again, this number is not related to an actual NPANXX. The 
     * user is required to convert this number to the actual NPANXX using data 
     * from the billing system before interfacing with EZTax.
     * <br/>
     * <br/>
     * NPANXXs exist for the following countries U.S., Barbados, Canada, Guam, 
     * Mexico, Northern Mariana Islands, Puerto Rico, Trinidad, Tobago and 
     * U.S Virgin Islands. These countries are on the North American dialing plan.
     */
    Npanxx("NpaNxx"), 
    
    /**
     * The accuracy of the ZIP code method depends upon the amount of data provided 
     * for the address as well as the user’s ability to choose the correct taxing 
     * jurisdiction zip code and address. EZTax databases contain numerous duplicate 
     * zip codes that cross not only taxing jurisdiction boundaries, but boundaries
     * of localities as well. Providing a complete address along with the zip code 
     * insures the best match possible. When address information is missing, EZTax 
     * returns taxes based upon the first match of the provided input information.
     */
    ZipAddress("ZipAddress");
    
    
    private String strat;
    /**
     * Creates the CalculationStrategyType.
     *
     */
    private CalculationStrategyType(String strat)
    {
        this.strat = strat;
    }
    
    public String getStrategy()
    {
        return this.strat;
    }

}
