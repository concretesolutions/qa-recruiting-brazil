const productService = require('../products/product.service')

class Checkout {

    constructor() {
        this._items = ''
    }

    addItem(item) {
        this._items = this._items + item
    }

    getTotal() {
        return productService.calculatePrice(this._items)
    }
}

module.exports = Checkout