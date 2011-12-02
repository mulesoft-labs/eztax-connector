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
