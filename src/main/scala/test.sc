


// sum of int from  A to B

def inteligenteSum(func: Int => Int): (a:Int, b:Int) => Int = {
  def dummySum( a:Int, b:Int): Int ={
    if (a>b) then 0 else func(a) + dummySum(a+1, b)
  }
  dummySum
}


def sumOfInts(a:Int, b: Int): Int = {
  if (a>b) then 0 else a + sumOfInts(a+1, b)
}
// cub
def cube(a: Int): Int = {
  a * a * a
}

// sum of cubes
def sumOfCubes(a:Int, b: Int): Int = {
  if(a>b) then 0 else cube(a) + sumOfCubes(a+1, b)
}

def sumOfFunc(f: Int => Int, a:Int, b:Int): Int ={
  if(a>b) then 0 else f(a) + sumOfFunc(f, a+1, b)
}

println(sumOfInts(1,2))
println(cube(2))

println(sumOfCubes(1, 3 ))
println(inteligenteSum(cube) (1, 3 ))
//// linear recursion to tail recursion




def sum(f: Int => Int, a:Int, b:Int): Int ={
  def loopp( a:Int, acc:Int): Int ={
      if (a>b) then acc
     else loopp(a+1, acc+ f(a))
  }
  loopp(a, 0)
}
