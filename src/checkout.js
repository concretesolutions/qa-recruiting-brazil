class Checkout {
  constructor(rules) {
    this.rules = rules;
    this.amountValue = 0;
  }

  scan(item) {
    this.amountValue += this.rules.find(i => i.item === item).price;
  }

  total() {
    return this.amountValue;
  }
}

export default Checkout;