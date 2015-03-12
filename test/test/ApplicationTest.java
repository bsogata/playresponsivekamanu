package test;

import org.junit.Test;
import play.twirl.api.Content;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest {

  /**
   * Tests that 1+1 equals 2.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Tests that the Index template renders correctly.
   */
  @Test
  public void renderTemplate() {
    Content html = views.html.Index.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("We Build Canoes");
  }

  /**
   * Tests that the Pueo template renders correctly.
   */
  @Test
  public void renderPueoTemplate() {
    Content html = views.html.Index.render("Pueo");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Pueo");
  }

  /**
   * Tests that the Aukahi template renders correctly.
   */
  @Test
  public void renderAukahiTemplate() {
    Content html = views.html.Aukahi.render("Aukahi");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Aukahi");
  }

  /**
   * Tests that the Kamanu V6 template renders correctly.
   */
  @Test
  public void renderKamanuV6Template() {
    Content html = views.html.KamanuV6.render("Kamanu V6");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Kamanu V6");
  }

  /**
   * Tests that the About template renders correctly.
   */
  @Test
  public void renderAboutTemplate() {
    Content html = views.html.About.render("About");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("About");
  }

}
