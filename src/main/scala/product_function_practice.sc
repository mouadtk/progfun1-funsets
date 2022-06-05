import scala.math.Numeric


// sum of int from  A to B
def inteligenteProduct(func: Int => Int) (a: Int, b: Int): Int = {
    if (a>b) then 1 else func(a) * inteligenteProduct(func)(a+1, b)
}


// factorial ,

def facto(acc: Int): Int ={
  if(acc<1) then 1
  else acc * facto(acc -1)
}

// factorial in product
def factorial(a: Int) = inteligenteProduct(x => x)(1, a)
facto(4)
factorial(4)


def operation(func: Int => Int) (identity: Int ,a: Int, b: Int): Int = {
  if (a>b) then identity else func(a) * operation(func)(identity, a+1, b)

}

def f(a: String)(b:String)(c:Int): Int = {
  ???
}