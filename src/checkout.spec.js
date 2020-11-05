import Checkout from './checkout'

// Mock Object
const rules = [
  {
    "item": "A",
    "price": 50
  },

  {
    "item": "B",
    "price": 30
  },

  {
    "item": "C",
    "price": 20
  },

  {
    "item": "D",
    "price": 15
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

  it("should be return 115 if the item was 'CDBA'", () => {
      // Arrange
      const checkout = new Checkout(rules);

      // Act
      checkout.scan("C");
      checkout.scan("D");
      checkout.scan("B");
      checkout.scan("A");

      // Assert
      expect(checkout.total()).toBe(115);
    });
  });
});
