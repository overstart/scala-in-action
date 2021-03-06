case class Time(hours: Int = 0, minutes: Int = 0) {

  val asMinutes: Int =
    hours * 60 + minutes

  def minus(that: Time): Int =
    this.asMinutes - that.asMinutes

  def -(that: Time): Int =
    minus(that)

  override lazy val toString: String =
    f"$hours%02d:$minutes%02d"
}
