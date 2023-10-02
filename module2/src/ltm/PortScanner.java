package ltm;

import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
        checkPort("www.titv.vn"); // check port nào đang mở của server máy mình
    }
    public static void checkPort( String url){
        int startPort = 1;
        int endPort = 100000;
        for(int i = startPort ; i <= endPort ; i++){
            try {
                Socket socket = new Socket(url, i); // nếu tạo được socket ở cổng thứ i thì in ko thì catch exception
                System.out.println("Port " + i +" is open");
                socket.close();
            } catch (Exception e) {

            }
        }
    }
}