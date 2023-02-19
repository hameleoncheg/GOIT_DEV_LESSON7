public class App {
    public static void main(String[] args) {
      HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        System.out.println("httpStatusChecker.getStatusImage(200) = " + httpStatusChecker.getStatusImage(2000));
        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        httpStatusImageDownloader.downloadStatusImage(200);
        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        httpImageStatusCli.askStatus();
    }
}
