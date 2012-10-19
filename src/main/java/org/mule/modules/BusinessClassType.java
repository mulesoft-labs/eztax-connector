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
public enum BusinessClassType implements EZTaxEnums
{
    /**
     * Incumbent Local Exchange Company
     */
    ILEC(0),
    
    /**
     * Competitive Local Exchange Company
     */
    CLEC(1);
    
    private int value;
    
    private BusinessClassType(int value)
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
