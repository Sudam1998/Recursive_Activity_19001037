//Question_6
//19001037
package Recursive_activity

object Question_6 {
  def main(args:Array[String]){
    
    fsq(10)
  }
  def fsq(n:Int):Any={
    if(n>0)
      fsq(n-1)
    println(fibonacci(n))
      
  }
  def fibonacci(x:Int):Int=x match{
    case x if(x==0)=>0
    case x if(x==1)=>1
    case x => fibonacci(x-1)+fibonacci(x-2)
  }
}