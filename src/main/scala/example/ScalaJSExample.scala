package example
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import dom.html
import org.scalajs.dom.html
import scala.util.Random
import scala.scalajs.js
import scalatags.JsDom.all._


@JSExport
object ScalaJSExample extends{
  @JSExport
  def main(target: html.Div) = {
    import dom.ext._
    import scala.scalajs.concurrent.JSExecutionContext.Implicits.runNow

    val url = "https://ghibliapi.herokuapp.com/films"

    Ajax.get(url).onSuccess{ case xhr =>
      target.appendChild(
        pre(
          js.JSON.stringify(
            js.JSON.parse(xhr.responseText),
            space=4
          )
        ).render
      )
    }
  }
}
