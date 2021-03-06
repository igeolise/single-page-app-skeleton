package client.components

import japgolly.scalajs.react.vdom.{Attrs, Base, TagMod, Tags}


import scalacss.ScalaCssReact._
import scalacss.Defaults._

object AllTags extends Base {
  @inline def < = CombinedTags
  @inline def ^ = Attrs
}

object CombinedTags extends Tags with CustomTags

trait CustomTags {
  def < = Tags

  @inline private def divWith(style: StyleA, xs: Seq[TagMod]) = <.div(xs :+ styleaToTagMod(style): _*)
}
