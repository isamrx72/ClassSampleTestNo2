object Main {
  def main(args: Array[String]): Unit = {
    //Pointインスタンスが一個
    val ap = new Point(10, 20)
    ap.PrintPos
    println()
    //Sankakuインスタンスが一個
    val cpary = new Sankaku(new Point(0, 0), new Point(0, 5), new Point(4, 0))
    cpary.Print3
    println()
    printf("上の３点の面積 %f\n", cpary.Mensekikeisan)
  }
}