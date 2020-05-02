
def daystonum(days:String):Any = days match{
  case "mon" | "monday" =>1
  case "tue" | "tuesday"=>2
  case "wed" | "wednesday"=>3
  case "thu" | "thursday"=>4
  case "fri" | "friday" =>5
  case "sat" | "saturday"=>6
  case "sun" | "sunday" =>7
}

daystonum("mon")

val age = 25
val res = age match{
  case x if(x>0 && x<=10) => "10% off"
  case x if(x>10 && x<=20) => "20% off"
  case x if(x>20 && x<=30) => "30% off"
  case _ =>"no offers"
}