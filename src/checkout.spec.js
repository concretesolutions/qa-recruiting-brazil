import Checkout from './checkout'

const pricingRules = [];

describe('Checkout', () => {
  describe('Test total', () => {
    it('should be return 0 to empty checkout', () => {
      const checkout = new Checkout(pricingRules);
      expect(checkout.total()).toBe(0);
    });    
  });
});
