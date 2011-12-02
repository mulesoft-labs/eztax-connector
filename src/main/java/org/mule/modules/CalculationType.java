package org.mule.modules;

/**
 * @author Gaston Ponti
 * @since Dec 2, 2011
 */
public enum CalculationType implements EZTaxEnums
{
    /**
     * Tax based on charge amount
     */
    Rate(1),
    
    /**
     * Fixed tax
     */
    Fixed(2),
    
    /**
     * Tax based on minutes
     */
    PerMinute(3),
    
    /**
     * Tax based on number of access lines
     */
    PerLine(4),
    
    /**
     * Tax that taxes itself
     */
    SelfTaxingRate(5),
    
    /**
     * Fixed tax with accumulated brackets
     */
    PerBracket(6),
    
    /**
     * Fixed tax based on final bracket
     */
    FixedOnTier(7);

    private int value;
    
    private CalculationType(int value)
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
