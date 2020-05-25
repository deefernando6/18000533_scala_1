printf("Question 01")

def normalhour(nhou:Int):Int = nhou*150
def othours(othou:Int):Int = othou*75
def totalincome(nhou:Int,othou:Int) = normalhour(nhou)+othours(othou)
def homasalary(nhou:Int,othou:Int):Double = totalincome(nhou,othou)*0.9

homasalary(40,20)

printf("Question 02")

def attend(price:Int):Int= 120+(15-price)/5*20
def income(price:Int):Int = attend(price)*price
def totalcost(price:Int):Int = 500+attend(price)*3
def totalprofit(price:Int):Int = income(price)-totalcost(price)

totalprofit(25)