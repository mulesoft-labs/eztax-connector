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
public enum ServiceClassType implements EZTaxEnums
{
    /**
     * Primary Local Service providers are carriers vending their services with 
     * over 50% of the gross business activities in Local Service revenue.
     */
    PrimaryLocal(0),
    
    /**
     * Primary Long Distance providers are carriers vending their services with 
     * over 50% of the gross business activities in Long Distance revenue.
     */
    PrimaryLongDistance(1);
    
    private int value;
    
    private ServiceClassType(int value)
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
