def normalhour(nhou:Int):Int = nhou*150
def othours(othou:Int):Int = othou*75
def totalincome(nhou:Int,othou:Int) = normalhour(nhou)+othours(othou)
def homasalary(nhou:Int,othou:Int):Double = totalincome(nhou,othou)*0.9

homasalary(40,20)