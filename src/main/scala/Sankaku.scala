class Sankaku(val x: Point, val y:Point, val z: Point) {
  def Print3: Point = {
    x.PrintPos; y.PrintPos; z.PrintPos
  }

  def Mensekikeisan: Double = {
    val wx = z.a
    val wy = z.b
    0.5 * ((x.a - wx) * (y.b - wy) - (x.b - wy) * (y.a - wx)).abs
  }
}
