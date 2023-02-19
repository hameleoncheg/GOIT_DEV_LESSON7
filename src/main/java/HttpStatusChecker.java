import org.jsoup.Jsoup;
public class HttpStatusChecker {
    public String getStatusImage(int code) {
        String url = "https://http.cat/" + code + ".jpg";

        try {
            Jsoup.connect(url).ignoreContentType(true).timeout(10000).execute();
        } catch (Exception e) {
            try {
                throw new Exception("Image not found for status code: " + code);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return url;
    }
}
