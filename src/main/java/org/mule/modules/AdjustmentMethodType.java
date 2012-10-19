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
public enum AdjustmentMethodType implements EZTaxEnums
{
    /**
     * Tax brackets applied normally
     */
    Default(0),
    
    /**
     * Tax brackets applied to produce smallest tax refund
     */
    LeastFavorableRate(1),
    
    /**
     * Tax brackets applied to produce largest tax refund
     */
    MostFavorableRate(2);

    private int value;
    
    private AdjustmentMethodType(int value)
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
