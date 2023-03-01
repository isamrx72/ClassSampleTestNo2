class Point (val a:Double, val b:Double){
  def PrintPos:Point = {
    printf("( %7.3f, %7.3f )", a, b)
    this
  }
}
