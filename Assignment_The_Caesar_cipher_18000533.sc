val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val e=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
val d=(c:Char,key:Int,a:String)=> if ((a.indexOf(c.toUpper)-key)>=0) a((a.indexOf(c.toUpper)-key)%a.size) else (a((a.indexOf(c.toUpper)-key)%a.size+26))

val cipher=(al:(Char,Int,String)=> Char,s:String,key:Int,a:String)=>s.map(al(_,key,a))
val s="Scala is awesome"
val ine=cipher(e,s,5,alphabet)
val ind=cipher(d,ine,5,alphabet)