def attend(price:Int):Int= 120+(15-price)/5*20
def income(price:Int):Int = attend(price)*price
def totalcost(price:Int):Int = 500+attend(price)*3
def totalprofit(price:Int):Int = income(price)-totalcost(price)

totalprofit(25)