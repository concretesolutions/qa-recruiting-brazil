const products = new Map()

products.set("A", {
    unitPrice: 50,
    specialPrice: {
    code: '3 for 130',
    quantity: 3,
    totalValue: 130
    }
})
products.set("B", {
    unitPrice: 30,
    specialPrice: {
    code: '2 for 45',
    quantity: 2,
    totalValue: 45
    }
})
products.set("C", { unitPrice: 20, })
products.set("D", { unitPrice: 15 })

const calculatePrice = items => {
    if (items) {
        const array = [...items]
        const aggregate = array.reduce((bag, item) => ({ ...bag, [item]: bag[item] ? bag[item] + 1 : 1 }), {})
        return Object.keys(aggregate).reduce((value, key) => value + getCalculatedValue(aggregate, key), 0)
    }
    return 0
}

getCalculatedValue = (aggregate, key) => {
    const quantity = aggregate[key]
    const product = products.get(key)
    if (product.specialPrice) {
        const specialQuantity = Math.floor(quantity / product.specialPrice.quantity)
        if (specialQuantity > 0) {
            let totalSpecial = 0
            totalSpecial = specialQuantity * product.specialPrice.totalValue
            return totalSpecial + (quantity - (specialQuantity * product.specialPrice.quantity)) * product.unitPrice
        }
    }
    return quantity * products.get(key).unitPrice
}

module.exports = {
    calculatePrice
}