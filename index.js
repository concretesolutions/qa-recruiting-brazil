const produtos = ["AAA"]

const valores = new Regra(precos);

function totalCompra(produtos) {
    const itens = produtos.split();
    itens.forEach(item => {
        return sum(item.valores)
    });
};

totalCompra(produtos);

