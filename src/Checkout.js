function Checkout() {
  var itens = [{
      _id: 'A',
      unitPrice: 50
    },
    {
      _id: 'B',
      unitPrice: 30
    },
    {
      _id: 'C',
      unitPrice: 20
    },
    {
      _id: 'D',
      unitPrice: 15
    }
  ];

  var regras = [
    {
      item: 'A',
      qtd: 3,
      unitPrice: 43.33
    },
    {
      item: 'B',
      qtd: 2,
      unitPrice: 22.50
    }
  ];

  var cart = [];

  var getUnitPrice = (codigo) => {
    return itens.find(item => item._id === codigo).unitPrice;
  };

  var getTotalPrice = (codigos) => {
    var qtd = codigos.length;

    var total = 0;

    for (var index = 0; index < qtd; index++) {
      total = total + getUnitPrice(codigos[index]);
    }

    return total;
  };

  this.scan = (codigo) => {
    // Insere o código do item dentro do carrinho.
    cart.push(codigo);
  };

  this.price = (codigos) => {
    if (codigos === undefined || codigos === null || codigos === '') {
      return 0;
    } else {
      // Quebrar todos os itens em uma lista. Ex.: 'ABCDEFG' => ['A', 'B', 'C', 'D', 'E', 'F', 'G']
      var lista = codigos.split('');

      return getTotalPrice(lista);
    }
  };

  this.total = () => {
    return getTotalPrice(cart);
  };
};