package malak;
import java.security.SecureRandom;
import java.util.Scanner;

public class Malak {

    // Generate OTP
    public static String generateOTP() {
        SecureRandom random = new SecureRandom();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    // Simulate QR Code
    public static String generateQR(String data) {
        return "[QR CODE DATA]: " + data;
    }

    // Validate OTP
    public static boolean validateOTP(String generated, String input) {
        return generated.equals(input);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("E Authentication System Using QR Code & OTP");

        // Step 1: Generate OTP
        String otp = generateOTP();

        // Step 2: QR Simulation
        String qr = generateQR(otp);

        System.out.println("\nGenerated QR Code:");
        System.out.println(qr);

        System.out.print("\nEnter OTP: ");
        String userOTP = sc.nextLine();

        // Step 3: Verify OTP
        if (validateOTP(otp, userOTP)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}

























