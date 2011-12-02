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
