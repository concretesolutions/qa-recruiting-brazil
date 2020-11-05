import Checkout from './checkout'

const rules = [
  {
    "item": "A",
    "price": 50
  },

  {
    "item": "B",
    "price": 30
  }
];

describe('Checkout', () => {
  describe('Test total', () => {
  it('should be return 0 to empty checkout', () => {
      // Arrange
      const checkout = new Checkout(rules);

      // Assert
      expect(checkout.total()).toBe(0);
    });
    
  it("should be return 50 if the item was 'A'", () => {
      // Arrange
      const checkout = new Checkout(rules);

      // Act
      checkout.scan("A");

      // Assert
      expect(checkout.total()).toBe(50);
    })

  it("should be return 80 if the item was 'AB'", () => {
      // Arrange
      const checkout = new Checkout(rules);

      // Act
      checkout.scan("A");
      checkout.scan("B");

      // Assert
      expect(checkout.total()).toBe(80);

    });
  });
});
