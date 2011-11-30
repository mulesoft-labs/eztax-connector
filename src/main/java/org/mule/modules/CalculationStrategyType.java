package org.mule.modules;

/**
 * @author Gaston Ponti
 * @since Nov 30, 2011
 */
public enum CalculationStrategyType
{
    /**
     * 
     */
    PCODE("PCode"), 
    
    /**
     * 
     */
    FIPS("FipsCode"), 
    
    /**
     * 
     */
    NPANXX("NpaNxx"), 
    
    /**
     * 
     */
    ZIP_ADDRESS("ZipAddress");
    
    
    private String strat;
    /**
     * Creates the CalculationStrategyType.
     *
     */
    private CalculationStrategyType(String strat)
    {
        this.strat = strat;
    }
    
    public String getStrategy()
    {
        return this.strat;
    }

}
