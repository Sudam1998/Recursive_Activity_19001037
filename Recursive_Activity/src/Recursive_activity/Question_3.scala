//Question_3
//19001037
package Recursive_activity

object Question_3 {
  def main(args:Array[String]){
    println(sum(5))
    println(sum(10))
  }
  def sum(n:Int):Int={
    if(n==1)
      return 1
    else
      return n+sum(n-1)
     
  }
}