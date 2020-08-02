const totalCompra = require('./index');
const subTotal = totalCompra.total;

test('total final das compras devem ser iguais', () => {
    expect(totalCompra(""))    .toBe("0");
    expect(totalCompra("A"))   .toBe("50");
    expect(totalCompra("AB"))  .toBe("80");
    expect(totalCompra("CDBA")).toBe("115");

    expect(totalCompra("AA"))    .toBe("100");
    expect(totalCompra("AAA"))   .toBe("130");
    expect(totalCompra("AAAA"))  .toBe("180");
    expect(totalCompra("AAAAA")) .toBe("230");
    expect(totalCompra("AAAAAA")).toBe("260");

    expect(totalCompra("AAAB"))  .toBe("160");
    expect(totalCompra("AAABB")) .toBe("175");
    expect(totalCompra("AAABBD")).toBe("190");
    expect(totalCompra("DABABA")).toBe("190");
});

test('total incremental das compras devem ser iguais', () => {
    let produtos = [""];
    expect(subTotal.toBe("0"));
    
    let produtos = ["A"];
    expect(subTotal.toBe("50"));
    
    let produtos = ["AB"];
    expect(subTotal.toBe("80"));

    let produtos = ["ABA"];
    expect(subTotal.toBe("130"));
    
    let produtos = ["ABAA"];
    expect(subTotal.toBe("160"));

    let produtos = ["ABAAB"];
    expect(subTotal.toBe("175"));
});