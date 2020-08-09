case class Point(a:Int,b:Int){
  def x:Int = a;
  def y:Int = b;

  def +(that:Point) = Point(this.x+that.x,this.y + that.y)

  def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)

  def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))

  def invert() = Point(this.y,this.x)
}

val p1 = Point(2,3)
val p2 = Point(3,6)
val p3 = p1 + p2
val p4 = p1.move(3,5)
val p5 = p2.invert()
val dis = p1.distance(5,4)


println(p1)
println(p2)

print("Question 1")
println(p3)

print("Question 2")
println(p4)

print("Question 3")
println(dis)

print("Question 4")
println(p5)
