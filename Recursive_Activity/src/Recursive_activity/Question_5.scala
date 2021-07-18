
//Question_5
//19001037
package Recursive_activity
//This program produce the addition of all even numbers less than given n
object Question_5 {
  def main(args:Array[String]){
    println("Enter the number for n: ")
    var n = scala.io.StdIn.readInt()
    println("Sum of even numbers up to "+n+" is "+(sumOfEven(0,n)))
  }
  def sumOfEven(start:Int=0,end:Int):Int={
    if(start>=end)
      return 0
    else
      return (start+sumOfEven(start + 2, end))
  }
}