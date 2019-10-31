package kata09;

import sun.rmi.runtime.Log;

import java.math.BigDecimal;

public class CheckoutRules {


    public CheckoutRules(){

    }

    public Long applyPricingRules(final String sku, final Long quantity){

        Integer unityPrice;

        switch (sku){

            case "A":{
                final Long discountedQuantity = quantity / 3;
                Long discountedTotal = discountedQuantity * 130;

                final long normalQuantity = quantity % 3;
                Long normalTotal = normalQuantity * 50;

                Long itemTotals = discountedTotal + normalTotal;

                return itemTotals;

            }
            case "B":{
                final Long discountedQuantity = quantity / 2;
                Long discountedTotal = discountedQuantity * 45;

                final long normalQuantity = quantity % 2;
                Long normalTotal = normalQuantity * 30;

                Long itemTotals = discountedTotal + normalTotal;

                return itemTotals;

            }
            case "C":{
                unityPrice = 20;
                return unityPrice * quantity;
            }

            case "D":{
                unityPrice = 15;
                return unityPrice * quantity;
            }

            default: return 0L;

        }
    }

}
