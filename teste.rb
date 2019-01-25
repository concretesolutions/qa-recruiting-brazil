# require 'test/unit/attribute'
# require 'test/unit/fixture'
# require 'test/unit/exception-handler'
# require 'test/unit/assertions'
# require 'test/unit/failure'
# require 'test/unit/error'
# require 'test/unit/pending'
# require 'test/unit/omission'
# require 'test/unit/notification'
# require 'test/unit/priority'
# require 'test/unit/data'
# require 'test/unit/testsuite'
# require 'test/unit/test-suite-creator'
# require 'test/unit/assertion-failed-error'
# require 'test/unit/auto-runner-loader'
# require 'test/unit/util/backtracefilter'
# require 'test/unit/util/output'
# require 'test/unit/util/method-owner-finder'


# class TestPrice < Test::Unit::TestCase

#     def price(goods)
#       co = CheckOut.new(RULES)
#       goods.split(//).each { |item| co.scan(item) }
#       co.total
#     end
  
#     def test_totals
#       assert_equal(  0, price(""))
#       assert_equal( 50, price("A"))
#       assert_equal( 80, price("AB"))
#       assert_equal(115, price("CDBA"))
  
#       assert_equal(100, price("AA"))
#       assert_equal(130, price("AAA"))
#       assert_equal(180, price("AAAA"))
#       assert_equal(230, price("AAAAA"))
#       assert_equal(260, price("AAAAAA"))
  
#       assert_equal(160, price("AAAB"))
#       assert_equal(175, price("AAABB"))
#       assert_equal(190, price("AAABBD"))
#       assert_equal(190, price("DABABA"))
#     end
  
#     def test_incremental
#       co = CheckOut.new(RULES)
#       assert_equal(  0, co.total)
#       co.scan("A");  assert_equal( 50, co.total)
#       co.scan("B");  assert_equal( 80, co.total)
#       co.scan("A");  assert_equal(130, co.total)
#       co.scan("A");  assert_equal(160, co.total)
#       co.scan("B");  assert_equal(175, co.total)
#     end
#   end
  

     # visit "https://wa.me/5581971059976?text=Teste%20Automação..."
        # find('#action-button').click
        # page.has_selector?('._35EW6')
        # find('._35EW6').click