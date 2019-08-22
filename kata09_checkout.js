const io = require('console-read-write');

class Checkout {
    constructor(A, aVal, B, bVal, C, cVal, D, dValq, aSpec, aSpecVal, bSpec, bSpecVal, cSpec, cSpecVal, dSpec, dSpecVal, ) {
        this.A = A;
        this.aVal = aVal;
        this.B = B;
        this.C = C;
        this.cVal = cVal;
        this.D = D;
        this.dVal = dVal;
        this.aSpecVal = aSpecVal;
        this.bSpecVal = bSpecVal;
        this.cSpecVal = cSpecVal;
        this.dSpecVal = dSpecVal;
        this.aSpec = aSpec;
        this.bSpec = bSpec;
        this.cSpec = cSpec;
        this.dSpec = dSpec;
    }

    scan() {
        //io.write('Scanning item: ');
        var items = []
            //var inputItem = io.write(await io.read());
        var inputItem = prompt('Scanning item: ');
        while (inputItem != EOF) {
            var i;
            for (i = 0; i < items.lenght; i++) {
                items[i] + inputItem;
            }
            inputItem = prompt('Scanning item: ');
        }
        return this.items;
    }

    total(items) {
        var i;
        var countA = 0;
        var countB = 0;
        var countC = 0;
        var countD = 0;
        for (i = 0; i < items.length; i++) {
            if (items[i] == 'A') countA++;
            if (items[i] == 'B') countB++;
            if (items[i] == 'C') countC++;
            if (items[i] == 'D') countD++;
        }
        if ((countA / parseToInt(this.aSpec[0])) >= 1) {
            var priceA = (countA / parseToInt(this.aSpec[0]));
            priceA = this.aSpecVal * priceA;
            var priceARest = (countA % parseToInt(this.aSpec[0]));
            priceA = this.aVal * priceARest + priceA;
        }
        if ((countB / parseToInt(this.bSpec[0])) >= 1) {
            var priceB = (countB / parseToInt(this.bSpec[0]));
            priceB = this.bSpecVal * priceB;
            var priceBRest = (countB % parseToInt(this.bSpec[0]));
            priceB = this.bVal * priceBRest + priceB;
        }
        if ((countC / parseToInt(this.cSpec[0])) >= 1) {
            var priceC = (countC / parseToInt(this.cSpec[0]));
            priceC = this.cSpecVal * priceC;
            var priceCRest = (countC % parseToInt(this.cSpec[0]));
            priceC = this.cVal * priceCRest + priceC;
        }
        if ((countD / parseToInt(this.dSpec[0])) >= 1) {
            var priceD = (countD / parseToInt(this.dSpec[0]));
            priceD = this.dSpecVal * priceD;
            var priceDRest = (countD % parseToInt(this.dSpec[0]));
            priceD = this.dVal * priceDRest + priceD;
        }
        return priceA + priceB + priceC + priceD;
    }

};

var co = new Checkout("A", 50, "B", 30, "C", 20, "D", 15, "3A", 130, "2B", 145, "1C", 20, "1D", 15);

co.scan();

print(co.total());