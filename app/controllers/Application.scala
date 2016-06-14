package controllers
import javax.inject._
import play.api._
import play.api.libs.json._
import play.api.mvc._

//try hitting route at: /?name=kevin
@Singleton
class Application extends Controller {
  def index(name: String) = Action {
    Ok(views.html.hello(name))
  }
}