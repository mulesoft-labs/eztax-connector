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
 * @since Dec 2, 2011
 */
public enum CustomerType implements EZTaxEnums
{
    /**
     * When transactions are made by a customer for home use.
     */
    Residential(0),
    
    /**
     * When transactions are made at a place of business.
     */
    Business(1),
    
    /**
     * When transactions made by a customer meeting the jurisdiction requirements 
     * to be considered a senior citizen and qualify for senior citizen tax breaks.
     */
    SeniorCitizen(2),
    
    /**
     * When transactions are made at an industrial business.
     */
    Industrial(3);
    
    private int value;
    
    private CustomerType(int value)
    {
        this.value = value;
    }
    
    /** @see org.mule.modules.EZTaxEnums#getValue() */
    @Override
    public int getValue()
    {
        return this.value;
    }
}
