//Question_4
//19001037
package Recursive_activity

object Question_4{
  def main(args:Array[String]){
    println(isEven(10),isOdd(10))
    println(isEven(7),isOdd(7))
    
    
  }
  def isEven(n:Int):Boolean=n match{
    case 0 => true
    case _ => isOdd(n-1)
    
  }
  def isOdd(n:Int):Boolean = !(isEven(n))
    
  
 
}
