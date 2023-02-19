import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code");
        String input = scanner.nextLine();
        try {
            int imageCode = Integer.parseInt(input);
            HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
            httpStatusImageDownloader.downloadStatusImage(imageCode);
            System.out.println("Image downloaded successfully");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid number");
        } catch (IllegalArgumentException e) {
            System.out.println("There is no image for HTTP status " + input);
        }
    }
}
