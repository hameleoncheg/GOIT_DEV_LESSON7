import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HttpImageStatusCli2 {

    public void askStatus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HTTP status code: ");
        String statusCodeInput = scanner.nextLine();

        try {
            int statusCode = Integer.parseInt(statusCodeInput);

            URL url = new URL("https://http.cat/" + statusCode);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();

            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            FileOutputStream outputStream = new FileOutputStream(statusCode + ".jpg");

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();

            System.out.println("Image downloaded successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid number");
        } catch (IOException e) {
            System.out.println("There is no image for HTTP status " + statusCodeInput);
        }
    }

}
