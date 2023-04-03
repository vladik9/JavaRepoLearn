package Summary.Pack;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class TEST_NETIPADRESS {

    public class TEST_NETIPADRESS {
        public static void main(String[] args) {
            try {
                InetAddress inetAddress = InetAddress.getLocalHost();
                String hostAddress = inetAddress.getHostAddress();
                System.out.println("API address: " + hostAddress);
            } catch (UnknownHostException e) {
                System.out.println("Could not find API address.");
            }
        }
    }
}
