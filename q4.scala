@main def main = println(wholeSaleCost(50))

def wholeSaleCost(copies:Int):Double = {
  discountedCost(copies) + shippingCost(copies)
}   

def shippingCost(copies:Int):Double = {
  if(copies<=50) 3*copies
  else 3*50 + (copies-50)*0.75
}

def discountedCost(copies:Int):Double = 24.95*copies*0.6
