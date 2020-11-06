class Special {
  constructor(item, price, specialQuantity, specialPrice) {
    this.idItem = item;
    this.unitPrice = price;
    this.specialQuantity = specialQuantity;
    this.specialPrice = specialPrice;

    this.quantity = 0;
  }

  get item() {
    return this.idItem;
  }

  increment() {
    this.quantity++;
  }

  total() {
    let total = 0;
    let mod;

    total += Math.floor(this.quantity / this.specialQuantity) * this.specialPrice;

    mod = this.quantity % this.specialQuantity;
    total += mod * this.unitPrice;

    return total;
  }
}

export default Special;