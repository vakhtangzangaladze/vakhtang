package ge.edu.btu.chat.client.server;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(1616);
        System.out.printf("სერვერი ჩაიტვირთა ");


        Socket socket= serverSocket.accept();
        System.out.println("კავშირი დამყარდა  . " );

        ObjectInputStream objectInput= new ObjectInputStream(socket.getInputStream());
        ObjectInputStream objectInputStream;
        String msg = (String) objectInputStream.readObject();
        System.out.printf("მიღებულია შეტყობინება : " + msg );

        objectInputStream.close();
        socket.close();


    }
}
/////araaaaaaaaaa