//Uuganbayar 2016168
fun main(args: Array<String>){
    val x = 5
    val y = 2
    val z = 3;
    
  val max = if (x > y){
        if (x > z)
            "x"
        else
        	"z"
    }
    else {
        if(y > z)
        	"x"
        else
        	"z"
    }
    
    print("$max is greater")
}
