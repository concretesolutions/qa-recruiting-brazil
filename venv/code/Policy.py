class Policy:

    rules = {}
    item = None
    totalprice = 0
    temp = 0
    a = 0
    b = 0
    ca = {}

    def __init__(self, rule):
        self.rules = rule

    def discount(self, a , b):
        print("to no discount")
        self.a = a
        self.b = b
