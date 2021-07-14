package exercises.chapter14;

import exercises.chapter4.base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ExerciseCookieTests extends BaseTest {


    private Cookie buildCookie(String name, String value){
        Cookie cookie  = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        return cookie;
    }

    private void deleteCookie(Cookie cookie) {
        driver.manage().deleteCookie(cookie);
    }

    private Boolean cookieExists(Cookie cookie) {
        Cookie newCookie = driver.manage().getCookieNamed(cookie.getName());
        return newCookie != null;
    }

    @Test
    public void testDeleteCookie() {
        Cookie cookie = buildCookie("optimizelyBuckets", "%7B%TD");
        deleteCookie(cookie);
        assertTrue(!cookieExists(cookie));
    }
}
