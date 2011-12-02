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
    Pcode("PCode"), 
    
    /**
     * 
     */
    Fips("FipsCode"), 
    
    /**
     * 
     */
    Npanxx("NpaNxx"), 
    
    /**
     * 
     */
    ZipAddress("ZipAddress");
    
    
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
