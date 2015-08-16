def bi = 10000g

println bi.class

def i = bi as int
println i.class

class Number {
  def i

  String toString(){
    return "Number i: ${i}"
  }
}

def x = new Number()

x.setI(100)

println(x.getI())
println(x.class)

println(x)
