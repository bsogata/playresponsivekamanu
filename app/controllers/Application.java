package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Pueo;
import views.html.About;
import views.html.Aukahi;
import views.html.KamanuV6;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the Pueo page.
   * @return The Result of OK from rendering the Pueo page.
   */
  public static Result pueo() {
    return ok(Pueo.render("Pueo"));
  }

  /**
   * Returns the Aukahi page.
   * @return The Result of OK from rendering the Aukahi page.
   */
  public static Result aukahi() {
    return ok(Aukahi.render("Aukahi"));
  }

  /**
   * Returns the Kamanu V6 page.
   * @return The Result of OK from rendering the Kamanu V6 page.
   */
  public static Result kamanuV6() {
    return ok(KamanuV6.render("Kamanu V6"));
  }

  /**
   * Returns the About page.
   * @return The Result of OK from rendering the About page.
   */
  public static Result about() {
    return ok(About.render("About"));
  }

}
