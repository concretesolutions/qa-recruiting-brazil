class CheckOut:

    rules = {}
    item = None
    totalprice = 0
    temp = 0
    a = 0
    b = 0

    discountA = 20
    discountB = 15
    ruA = 3
    ruB = 2

    def __init__(self, rule):
        self.rules = rule
        self.totalprice = 0


    def cart(self, flag):
        if(flag == 'A'):
            self.a = self.a +1
        elif(flag == 'B'):
            self.b = self.b +1



    def discount(self):
        c = 0
        i = 0
        if self.a >= 3:
            c = self.a / self.ruA
            c = int(c)
            c = c * self.discountA
            self.a = 0
        if self.b >= 2:
            i = self.b / self.ruB
            i = int(i)
            i = i * self.discountB
            self.b = 0

        a = i + c
        return a


    #soma
    def scan(self, item):
        if(item):
            self.item = item
            for x in self.item:
                self.temp = self.temp + self.rules[x]
                self.cart(x)

            # Check if discount should be applied
            # Static only to A and B
            if self.a >= 3 or self.b >= 2:

                disc = self.discount()
                self.temp = self.temp - disc
                self.totalprice = self.temp
            else:
                self.totalprice = self.temp
            print(self.totalprice)
        else:
            print("nao dentro")


    def totalprice(self):
        total = self.totalprice
        return total

