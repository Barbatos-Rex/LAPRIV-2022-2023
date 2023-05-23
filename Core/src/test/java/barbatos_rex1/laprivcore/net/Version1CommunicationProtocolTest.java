package barbatos_rex1.laprivcore.net;

import barbatos_rex1.laprivcore.net.version1.Version1CommunicationProtocol;
import barbatos_rex1.laprivcore.net.version1.Version1Packet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.ToString;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.ServerSocket;
import java.net.Socket;

import static org.junit.Assert.assertTrue;

class Version1CommunicationProtocolTest {

    static ServerSocket server;
    static Integer obj1 = 10;
    static Integer obj2 = 20;

    static Double obj3 = 10e20;

    @AllArgsConstructor
    @Getter
    @ToString
    private class TestObject {
        private String str1;
        private String str2;
    }

    private class ServerListener implements Runnable {

        private ServerSocket serverSocket;

        public ServerListener(ServerSocket serverSocket) {
            this.serverSocket = serverSocket;
        }

        @SneakyThrows
        @Override
        public void run() {
            Socket s = serverSocket.accept();
            LAPRIVCommunicationProtocol com = new Version1CommunicationProtocol(s);
            PacketPair p1 = com.recieve();
            PacketPair p2 = com.recieve();
            PacketPair p3 = com.recieve();
            PacketPair p4 = com.recieve();
            Integer i1 = ((Integer) p1.getObject());
            System.out.println(i1);
            Integer i2 = ((Integer) p2.getObject());
            System.out.println(i2);
            Double d1 = ((Double) p3.getObject());
            System.out.println(d1);
            TestObject to = ((TestObject) p4.getObject());
            System.out.println(to);
            server.close();
        }
    }

    @Test
    @SneakyThrows
    void send() {
        server = new ServerSocket(7979);
        Thread t = new Thread(new ServerListener(server));
        t.start();
        Socket s = new Socket("127.0.0.1", 7878);
        LAPRIVCommunicationProtocol com = new Version1CommunicationProtocol(s);
        assertTrue(com.send(obj1,ProtocolOption.COMMTEST));
        assertTrue(com.send(obj2,ProtocolOption.COMMTEST));
        assertTrue(com.send(obj3,ProtocolOption.COMMTEST));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<256*256;i++){
            sb.append("@");
        }
        assertTrue(com.send(new TestObject(sb.toString(), sb.toString()),ProtocolOption.COMMTEST));
    }

    @Test
    void recieve() {
    }

    @Test
    void connection() {
    }
}