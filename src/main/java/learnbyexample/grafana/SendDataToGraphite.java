package learnbyexample.grafana;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendDataToGraphite {

    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("metrics.cartrawler.com", 2003);
        PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        String msg = "ota-contracts-sin-bin.sale.abg.ae.123 456 1532607013";
        out.println(msg);
        in.readLine();
        in.close();
        out.close();
        sock.close();
    }
}
