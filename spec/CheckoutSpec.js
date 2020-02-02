describe('Checkout', () => {
  beforeEach(() => {
    checkout = new Checkout();

    console.log('A função beforeEach é executada antes de cada teste...');
  });

  afterEach(() => {
    checkout = null;

    console.log('A função afterEach é executada depois de cada teste...');
  });

  it('Teste totais', () => {
    // var resultado = checkout.price('A');
    // expect(resultado).toEqual(50);

    expect(checkout.price('')).toEqual(0);
    expect(checkout.price('A')).toEqual(50);
    expect(checkout.price('B')).toEqual(30);
    expect(checkout.price('C')).toEqual(20);
    expect(checkout.price('D')).toEqual(15);
    expect(checkout.price('ABCD')).toEqual(115);
  });

  it('Teste incremental', () => {
    checkout.scan('A'); expect(checkout.total()).toEqual(50);
    checkout.scan('B'); expect(checkout.total()).toEqual(80);
    checkout.scan('A'); expect(checkout.total()).toEqual(130);
		checkout.scan('A'); expect(checkout.total()).toEqual(180);
		checkout.scan('B'); expect(checkout.total()).toEqual(210);
  });
});