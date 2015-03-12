package test;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {

  /**
   * Check to see that the index page can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        browser.goTo("http://localhost:3333");
        assertThat(browser.pageSource()).contains("We Build Canoes");

        browser.goTo("http://localhost:3333/pueo");
        assertThat(browser.pageSource()).contains("Pueo");

        browser.goTo("http://localhost:3333/aukahi");
        assertThat(browser.pageSource()).contains("Aukahi");

        browser.goTo("http://localhost:3333/kamanu-v6");
        assertThat(browser.pageSource()).contains("Kamanu V6");

        browser.goTo("http://localhost:3333/about");
        assertThat(browser.pageSource()).contains("About");
      }
    });
  }

}
