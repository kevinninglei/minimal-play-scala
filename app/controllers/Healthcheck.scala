package controllers
import javax.inject._
import play.api._
import play.api.libs.json._
import play.api.mvc._

@Singleton
class Healthcheck extends Controller {
  def check = Action {
    Ok(Json.obj("status" -> "OK"))
  }
}