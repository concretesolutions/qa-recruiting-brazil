function valores(precos) {
    new Regra(precos);
};

function totalCompra(produtos) {
    let produtos = [""];

    const buscaProdutos = scan(produtos);

    const itens = buscaProdutos.split();

    const total = itens.forEach(item => {
        const unitario = item.valores(precos);
        return sum(unitario);
    });

    return total;
};

totalCompra(produtos);

module.exports = totalCompra;