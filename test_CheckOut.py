import CheckOut


def price(item):
  rule = {'A': 50, 'B': 30, "C": 20, 'D': 15}
  co = CheckOut.CheckOut(rule)
  co.scan(item)
  price = co.totalprice
  print(f"price: {price}")
  return price

def test_total():
  assert price("") == 0
  assert price("AB") == 80
  assert price("CDBA") == 115
  assert price("CDBA") == 115
  assert price("AA") == 100
  assert price("AAA") == 130
  assert price("AAAA") == 180
  assert price("AAAAA") == 230
  assert price("AAAAAA") == 260
  assert price("AAAB") == 160
  assert price("AAABB") == 175
  assert price("AAABBD") == 190
  assert price("DABABA") == 190


def test_incremental():
  rule = {'A': 50, 'B': 30, "C": 20, 'D': 15}
  co = CheckOut.CheckOut(rule)
  assert co.totalprice == 0
  co.scan("A")
  assert co.totalprice == 50
  co.scan("B")
  assert co.totalprice ==80
  co.scan("A")
  assert co.totalprice == 130
  co.scan("A")
  assert co.totalprice == 160
  co.scan("B")
  assert co.totalprice == 175
  co.scan("B")
  assert co.totalprice == 205
  co.scan("B")
  assert co.totalprice == 220
  co.scan("B")
  assert co.totalprice == 250
  co.scan("B")
  assert co.totalprice == 265
  co.scan("A")
  assert co.totalprice == 315
  co.scan("A")
  assert co.totalprice == 365
  co.scan("C")
  assert co.totalprice == 385
  co.scan("D")
  assert co.totalprice == 400
  co.scan("D")
  assert co.totalprice == 415
  co.scan("D")
  assert co.totalprice == 430




