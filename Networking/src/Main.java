import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        String url = "www.google.com";

        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.printf("HOST ADDRESS: %s\n", inetAddress.getHostAddress());
        System.out.printf("ADDRESS: %s\n", Arrays.toString(inetAddress.getAddress()));

        System.out.printf("IsAnyLocalAddress: %b", inetAddress.isAnyLocalAddress());
        System.out.printf("\nIsLinkLocalAddress: %b", inetAddress.isLinkLocalAddress());
        System.out.printf("\nIsLoopBackAddress: %b", inetAddress.isLoopbackAddress());
        System.out.printf("\nIsSiteLocalAddress: %b", inetAddress.isSiteLocalAddress());

        System.out.printf("\nHashCode: %d", inetAddress.hashCode());
    }
}