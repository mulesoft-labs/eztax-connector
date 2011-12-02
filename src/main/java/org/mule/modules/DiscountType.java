package org.mule.modules;

/**
 * @author Gaston Ponti
 * @since Dec 2, 2011
 */
public enum DiscountType implements EZTaxEnums
{
    /**
     * No discount.
     */
    None(0),

    /**
     * An amount subtracted from the original price to arrive at a lower price.
     */
    RetailProduct(1),
    
    /**
     * A discount of the total amount reimbursed to either the retailer or the 
     * customer by the manufacturer.
     */
    ManufacturerProduct(2),
    
    /**
     * A stand alone discount that is not applied against any service but instead 
     * as a stand alone product.
     */
    AccountLevel(3),
    
    /**
     * A discount caused exclusively in telephone service where the telephone 
     * provider provides a service to a lifeline eligible customer. The discount 
     * will be on the local exchange service.
     */
    Subsidized(4),
    
    /**
     * The total discount of a service that is recorded for accounting purposes 
     * but never billed to a customer.
     */
    Goodwill(5);
    
    private int value;
    
    private DiscountType(int value)
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

