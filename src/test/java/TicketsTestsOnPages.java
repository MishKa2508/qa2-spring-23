import pages.BaseFunc;
import org.junit.jupiter.api.Test;

public class TicketsTestsOnPages {
    private final String URL = "http://gagguru.lv:8089/tickets";

    @Test
    public void successTicketsBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

    }
}
