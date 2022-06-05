
import scala.annotation.tailrec

// new type : Rational
// constructor with 2 params to create Rational
class Rational(x:Int, y:Int):

  require(y!=0,"denominator should be != 0")


  //def this(x: Int) = this(x, 1)

  def numer:Int = x
  def denom:Int = y

  def add(a:Int, b:Int): Rational = {
      add(new Rational(a,b))
  }

  private def gdc(a:Int ,b:Int): Int ={
    if (b == 0) a else gdc(b, a  % b)
  }

  def substruct(r: Rational): Rational = {
      this add(r.neg)
  }

  def neg: Rational = this multiple (new Rational(-1, 1))

  def add(r: Rational): Rational = {
    new Rational(this.numer * r.denom + r.numer * this.denom,
    this.denom * r.denom);
  }

  def multiple(r: Rational): Rational = {
    new Rational(this.numer * r.numer, this.denom * r.denom)
  }

  override def toString = s"${numer/gdc(x.abs, y.abs)}/${denom/gdc(x.abs, y.abs)}"

end Rational



var t = Rational(234141234,234141234)
var e = Rational(456464465,356545)

val a = t substruct e

/*
 * 2.7  Evaluations and Operators
min 2:00 talking about  class/methods params substitition.
the rule is we start by substituting method params first,
then we substitut class params second, and the reference this later.

in the example on min 2:15,  we revert the two first steps, we start
by class params first, then methods params second.
am I missing  something, or  there was some mistake ?
lower priority
|
^
&
<>
= !
:
+ -
* / %
higher priority
*/

