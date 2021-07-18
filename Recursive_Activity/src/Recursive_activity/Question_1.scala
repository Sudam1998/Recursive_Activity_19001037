//Question_1
//19001037
package Recursive_activity

object Question_1 {
  def main(args:Array[String]){
    
  }
  def prime(p:Int,n:Int=2):Boolean=n match{
    case x if(p==x)=>true
    case x if(gcd(p,x)>1)=>false
    case x => prime(p,x+1)
  }
  def gcd(x:Int,y:Int):Int=y match{
    case 0 => x
    case  y if(y>x) => gcd(y,x)
    case _ => gcd(y,x%y)
  }
  println(prime(2),prime(4))
  println(prime(5),prime(8))
}