class Unit {
  constructor(item, price) {
    this.idItem = item;
    this.unitPrice = price;
    this.quantity = 0;
  }

  get item() {
    return this.idItem;
  }

  increment() {
    this.quantity++;
  }

  total() {
    return this.quantity * this.price;
  }
}

export default Unit;