fun main(args: Array<String>){  
  
    val hashMap:HashMap<String,String> = HashMap<String,String>() 
    hashMap.put("Name of superhero","Batman")  
    hashMap.put("Gender of batman","M")
    hashMap.put("Power of batman","92")
   
  
    println("---------Detail of Batman---------")  
    for(key in hashMap.keys){  
        println(" $key - ${hashMap[key]}")  
    }
val hashMap1:HashMap<String,String> = HashMap<String,String>() 
    hashMap1.put("Name of superhero","Superman")  
    hashMap1.put("Gender of Superman","M")
    hashMap1.put("Power of Superman","100")
   
  
    println("---------Detail of Hero---------")  
    for(key in hashMap1.keys){  
        println(" $key - ${hashMap1[key]}")  
    }} 