const assert = require('assert');

const productService = require('../app/products/product.service')
let Checkout = require('../app/checkout/checkout')

describe('Validating the calculate price items', function () {
    it('should return total of a list of producs', function () {
        assert.equal(  0, productService.calculatePrice(""))
        assert.equal( 50, productService.calculatePrice("A"))
        assert.equal( 80, productService.calculatePrice("AB"))
        assert.equal(115, productService.calculatePrice("CDBA"))
        
        assert.equal(100, productService.calculatePrice("AA"))
        assert.equal(130, productService.calculatePrice("AAA"))
        assert.equal(180, productService.calculatePrice("AAAA"))
        assert.equal(230, productService.calculatePrice("AAAAA"))
        assert.equal(260, productService.calculatePrice("AAAAAA"))
        
        assert.equal(160, productService.calculatePrice("AAAB"))
        assert.equal(175, productService.calculatePrice("AAABB"))
        assert.equal(190, productService.calculatePrice("AAABBD"))
        assert.equal(190, productService.calculatePrice("DABABA"))

    });

    it('should return incrementally the total', function () {
        let checkout = new Checkout()
		assert.equal( 0, checkout.getTotal())
		checkout.addItem("A"); assert.equal(50, checkout.getTotal())
		checkout.addItem("B"); assert.equal(80, checkout.getTotal())
		checkout.addItem("A"); assert.equal(130, checkout.getTotal())
		checkout.addItem("A"); assert.equal(160, checkout.getTotal())
		checkout.addItem("B"); assert.equal(175, checkout.getTotal())
    });
});