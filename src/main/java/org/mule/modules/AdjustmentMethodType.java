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
