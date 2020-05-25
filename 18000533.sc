println("Question 1")

def farrenh(x:Double):Double=x*1.8+32.00
farrenh(35)

println("Question 2")

val r=3.0
def volume(r:Double):Double=4.0/3.0*math.Pi*r*r*r
volume(5.0)

println("Question 3")

def bookprice(x:Int):Double=x*24.95
def discount(amount:Double):Double = amount*0.4
def shipping(x:Int):Double=if(x>50){3*50 + (x-50)*0.75}
else{3*x}

def totalcost(x:Int):Double = bookprice(x)-discount(bookprice(x))+shipping(x)
totalcost(60)