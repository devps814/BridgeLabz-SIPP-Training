package Methods;
import java.util.*;

public class OTP_numbers {
	 private static final int OTP_LENGTH = 6;
	    private static final int OTP_COUNT = 10;

	    public static void main(String[] args) {
	        HashSet<String> uniqueOTPs = new HashSet<>();
	        while (uniqueOTPs.size() < OTP_COUNT) {
	            String otp = generateOTP();
	            uniqueOTPs.add(otp);
	        }
	        System.out.println("Generated unique OTPs: " + uniqueOTPs);
	    }

	    private static String generateOTP() {
	        int otp = (int) (Math.random() * 1000000);
	        return String.format("%06d", otp);
	    }

	    private static boolean areOTPUnique(String[] otps) {
	        HashSet<String> otpSet = new HashSet<>();
	        for (String otp : otps) {
	            if (!otpSet.add(otp)) {
	                return false;
	            }
	        }
	        return true;
	    }

}
