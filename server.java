import java.io.*;
import java.net.*;

class server {
    public static void main(String Arg[]) throws Exception {
        System.out.println("server of marvellous chat messenger is running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is in listning mode at port no : 2100");

        Socket sobj = ssobj.accept();
        System.out.println("Client and server connection is successful..");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream())); 
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("Marvellous Chat messenger started...");

        String str1, str2;

        while((str1 = br1.readLine())!=null)
        {
            System.out.println("client says : "+str1);
            System.out.println("Enter message for client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
        System.out.println("thank you for using marvellous chat messenger...");
        ssobj.close();
    }

}