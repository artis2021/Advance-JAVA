import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.youtube.com";
        InetAddress inetAddress = Inet4Address.getByName(url);
//        System.out.println(inetAddress);
        System.out.println("Address: "+ Arrays.toString(inetAddress.getAddress()));

        //Get Host Address Method
        System.out.println("Host Address: "+ inetAddress.getHostAddress());
        System.out.println(inetAddress.getCanonicalHostName());
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.hashCode());
        System.out.println(inetAddress.isAnyLocalAddress());
    }
}
