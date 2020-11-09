requer  'teste / unidade'
require_relative  'Checkout.rb'
classe  TestPrice < Test :: Unit :: TestCase
   preço def ( mercadorias )
    co  =  CheckOut . novo ( REGRAS )
    bens . dividir ( // ) . each  { | item | co . digitalizar ( item )  }
    co . total
  fim

  def  test_totals
    assert_equal (   0 ,  preço ( "" ) )
    assert_equal (   0 ,  preço ( "  " ) )
    assert_equal (  50 ,  preço ( "A" ) )
    assert_equal (  80 ,  preço ( "AB" ) )
    assert_equal ( 115 ,  preço ( "CDBA" ) )
    assert_equal ( 100 ,  preço ( "AA" ) )
    assert_equal ( 130 ,  preço ( "AAA" ) )
    assert_equal ( 180 ,  preço ( "AAAA" ) )
    assert_equal ( 230 ,  preço ( "AAAAA" ) )
    assert_equal ( 260 ,  preço ( "AAAAAA" ) )
    assert_equal ( 160 ,  preço ( "AAAB" ) )
    assert_equal ( 175 ,  preço ( "AAABB" ) )
    assert_equal ( 190 ,  preço ( "AAABBD" ) )
    assert_equal ( 190 ,  preço ( "DABABA" ) )
  fim
  def  test_incremental
    co  =  CheckOut . novo ( REGRAS )
    assert_equal (   0 ,  co . total )
    co . digitalizar ( "A" ) ;   assert_equal (  50 ,  co . total )
    co . digitalizar ( "B" ) ;   assert_equal (  80 ,  co . total )
    co . digitalizar ( "A" ) ;   assert_equal ( 130 ,  co . total )
    co . digitalizar ( "A" ) ;   assert_equal ( 160 ,  co . total )
    co . digitalizar ( "B" ) ;   assert_equal ( 175 ,  co . total )
  fim
fim
