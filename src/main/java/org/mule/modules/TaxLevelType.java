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
