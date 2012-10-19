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
public enum TaxLevelType implements EZTaxEnums
{

    Federal(0), 
    State(1),
    County(2), 
    Local(3),
    Unincorporated(4), 
    Other(5),
    StateCountyLocal(6), 
    CountyLocal(7);
    
    private int value;
    
    private TaxLevelType(int value)
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
