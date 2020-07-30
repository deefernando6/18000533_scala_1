println("Q1");

class rational(x: Int ,y:Int){
  def numer=x
  def denom = y
  def neg = new rational(-this.numer,this.denom);
  override def toString =numer+"/"+denom;
}

println("Q2");
class rational1(x: Int ,y:Int){
  def numer:Int=x/gcd(x,y);
  def denom:Int=y/gcd(x,y);
  def sub (r:rational1)= new rational1(numer*r.denom-r.numer*denom,denom*r.denom);
  private def gcd(a: Int,b: Int):Int= if(b==0) a else gcd (b,a%b)
  override def toString =numer+"/"+denom;
}

val x= new rational1(3,4);
val y= new rational1(5,8);
val z= new rational1(2,7);
print((x.sub(y)).sub(z));

println("Q3");
class acc(id:String,n:Int,b:Double){
  val nic:String=id;
  val accnumber:Int=n;
  var balance: Double = b;

  def transfer (a:acc,b:Int): Unit ={
    this.balance=this.balance-b;
    a.balance=a.balance+b;
  }
}

val x= new acc("001",1,4500);
val y=new acc("002",2,2000);

x.transfer(y,500);
print(x.balance);
print(y.balance);

println("Q4");
class acc1(id:String,n:Int,b:Double) {
  val nic: String = id;
  val accnumber: Int = n;
  var balance: Double = b;

  override def toString ="["+nic+" : "+accnumber+" : "+balance+"]"
}

var a = new acc1("001", 1, 4500);
var b = new acc1("002", 2, 5000);
var c = new acc1("003", 3, -250);
var d = new acc1("004", 4, -500);

var bank: List[acc1] = List(a, b, c, d);
val overdraft = (b: List[acc1]) => b.filter(x => x.balance < 0)
println("Overdraft accounts");
print(overdraft(bank))

val sum = (a: List[acc1]) => a.reduce((x, y) => (new acc1(x.nic, x.accnumber, x.balance + y.balance)))
println("Sum of the account balances");
print(sum(bank).balance)

val interest = (inter: List[acc1]) => inter.map(x => {
  if (x.balance < 0) (new acc1(x.nic, x.accnumber, x.balance * 1.05))
  else (new acc1(x.nic, x.accnumber, x.balance * 1.1))
})
println("Accounts after interest")
print(interest(bank))


