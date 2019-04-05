open class Grade(q: Int, w: Int, e: Int){
    init {
        println("Total grade is ${q + w + e}")
        println("Average grade is ${(q + w + e)/3}")
    }
}
class CS(val java: Int, val python: Int, val web: Int): Grade(java, python, web){
	val arr = arrayOf(java, python, web)

	
	fun max(): Int{
		var max: Int
		
		max = arr[0]
		for(i in arr){
			if(i > max) max = i
            
            
		}
     
        println("The max grade is $max")
		return max
        
	}
}
class EE(val listening: Int, val writing: Int, val reading: Int): Grade(listening, writing, reading){
	val score = arrayListOf(listening, writing, reading)
	fun min(): Int{
		var min: Int
		
		min = score[0]
		for(i in score){
			if(i < min) min = i
		} 
        println("The min grade is $min")
		return min
	}
}
fun main(){
    val una = CS(100, 80 ,90)

    una.max()
    println("---------------------")
    
    val una1 = EE(80, 75, 90)
    una1.min()
}