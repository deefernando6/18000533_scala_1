print("Question : 01")
def GCD(a:Int,b:Int):Int= b match {
  case 0=>a
  case x if x>a => GCD(x,a)
  case _ => GCD(b,a%b)
}
def prime(c:Int,n:Int=2):Boolean=n match {
  case x if(c==x)=>true
  case x if GCD(c,x)>1=>false
  case x =>prime(c,x+1)
}
prime(5)

print("Question : 02")
def GCD1(a:Int,b:Int):Int= b match {
  case 0=>a
  case x if x>a => GCD(x,a)
  case _ => GCD1(b,a%b)
}
def prime1(c:Int,n:Int=2):Boolean=n match {
  case x if(c==x)=>true
  case x if GCD(c,x)>1=>false
  case x =>prime1(c,x+1)
}

def printprime(n:Int):Int=n match {
  case 0 => 0
  case 1 => 0
  case x if (prime1(x)==true) => print(x+" ")
    printprime(x-1)
  case x if (prime1(x)==false) => printprime(x-1)
}

printprime(10)

print("Question : 03")
def sum(n:Int):Int= n match {
  case x if(x==1)=>1
  case _ => sum(n-1)+n
}
sum(5)

print("Question : 04")
def even(n:Int):Boolean=n match {
  case x if x==0 => true
  case x if x==1=> false
  case _ => even(n-2)
}
even(6)

print("Question : 05")
def even1(n:Int):Boolean=n match {
  case x if x==0 => true
  case x if x==1=> false
  case _ => even1(n-2)
}

def sum1(n:Int):Int=n match {
  case 0 => 0
  case 1 => 0
  case x if even(x)==true => sum1(n-2)+n
  case x if even(x)==false => sum1(n-2)+(n-1)

}

sum1(13)

print("Question : 06")
def fibonacci(n:Int):Int= n match {
  case x if x==0 => 0
  case x if x==1 => 1
  case _ => fibonacci(n-1)+fibonacci(n-2)
}

def printfibb(n:Int):Any= n match {
  case _ => print(fibonacci(n)+" ")
    printfibb(n-1)
}

printfibb(8)




