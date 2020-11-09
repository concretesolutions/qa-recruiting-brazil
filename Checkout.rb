classe  ProdutItem
  attr_reader  : Item ,  : price_unit ,  : Qtde

  def  inicializar ( item ,  price_unit ,  qtde )
    @item  =  item
    @price_unit  =  price_unit
    @qtde  =  qtde
  fim

  def  calc_qtde
    ( price_unit * qtde )
  fim

fim

classe  CalcDiscount
  attr_reader  : desconto

  def  inicializar ( desconto )
    @discount  =  desconto
  fim

  def  calc_desc ( produto )
    ( product . price_unit * product . qtde ) - desconto
  fim
fim

RULES  =  [ A : { prodA : ProdutItem . novo ( "A" ,  0,50 ,  3 ) ,  descA : CalcDiscount . novo ( 0,20 ) } ,
         B : { prodB : ProdutItem . novo ( "B" ,  0,30 ,  2 ) ,  descB : CalcDiscount . novo ( 0,15 ) } ,
         C : { prodC : ProdutItem . novo ( "C" ,  0,20 ,  0 ) ,  descC : CalcDiscount . novo ( 0,00 ) } ,
         D : { prodD : ProdutItem . novo ( "D" ,  0,15 ,  0 ) ,  descD : CalcDiscount . novo ( 0,00 ) }
        ]

classe  CheckOut

  def  inicializar ( regras )
      @rules  =  rules
      @itens  =  Hash . Novo
    fim

   preço def ( item ,  quantidade )
    if  regras ( item )
       regras ( item ) . preço ( quantidade )
    outro
      aumentar  "O item ' # { item } ' é invalido"
    fim
  fim

  def  scan ( item )
    @itens [ item ] || = 0
    @itens [ item ] + = 1
  fim

  def  regras ( item )
    @regras [ item ]
  fim


fim
classe  ProdutItem

  attr_reader  : price_unit ,  : Item ,  : price_promo

  def  inicializar ( price_unit : ,  produto : 1 ,  price_promo : price_unit )
    @price_unit  =  price_unit
    @item  =  item
    @price_promo  =  price_promo
  fim

  def  price_qtde ( unidades )
    units_promo  =  unidades / @item
    units_excl_offer  =  unidades % @item
    @price_promo * units_promo + @price_promo * units_excl_offer
  fim

fim

REGRAS  =  {
  ""  =>  ProdutItem . novo ( preço_unidade : 0 ) ,
  "A"  =>  ProdutItem . novo ( preço_unidade : 50 ,  item : 3 ,  preço_promo : 130 ) ,
  "B"  =>  ProdutItem . novo ( preço_unidade : 30 ,  item : 2 ,  preço_promo : 45 ) ,
  "C"  =>  ProdutItem . novo ( preço_unidade : 20 ) ,
  "D"  =>  ProdutItem . novo ( preço_unidade : 15 )
}

classe  CheckOut

  def  inicializar ( price_list )
    @rules  =  price_list
    @items  =  Hash . Novo
  fim

  def  scan ( item )
    aumentar  "O item ' # { item } ' é invalido" a  menos que  @rules . chaves . incluir?  item
    @itens [ item ] || = 0
    @itens [ item ] + = 1
  fim

  def  total
    subtotal  =  0

    @items . chaves . cada um  faz | eu |

      bom ,  unidades  =  @rules [ i ] ,  @items [ i ]
      subtotal + = bom . preço_qtde ( unidades )

    fim

    subtotal

  fim
fim
