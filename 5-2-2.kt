interface Grade {     

     fun total()                  

     fun ave()
}

class CS: Grade {
		val web: Int = 15
        val python: Int = 45
        val java: Int = 20
        val w = web + python + java
    override fun total(){

            println("Total grade is: $w")
	}

    override fun ave() {
			  	val numArray = arrayOf(15,45,20)
                var sum = 0.0

                for (num in numArray) {
                    sum += num
                }

                val average = sum / numArray.size
                println("Average is: %.2f".format(average))
                }
    fun max(vararg score: Int): Int{
		var max: Int
		
		max = score[0]
		for(a in score){
			if(a > max) max = a
		}
		return max
	}
}

class EE: Grade {
		val listen: Int = 14
        val read: Int = 74
        val write: Int = 15
        val q = listen + read + write
    override fun total(){

            println("Total is: $q")
	}

    override fun ave() {
			  	val numArray = arrayOf(14,75,15)
                var sum = 0.0

                for (num in numArray) {
                    sum += num
                }

                val average = sum / numArray.size
                println("Average is: %.2f".format(average))
                }
    fun min(vararg score: Int): Int{
		var min: Int
		
		min = score[0]
		for(e in score){
			if(e < min) min = e
		}
		return min
	}
}
fun main(args: Array<String>) {

    var una = CS()
    una.total()
    una.ave()
   
	
	println("Max is " + una.max(una.java, una.python, una.web))
    var una1 = EE()
    println("__________-!-____________")
    una1.total()
    una1.ave()
	println("Min is " + una1.min(una1.listen, una1.read, una1.write))
}