import java.io.*;

public class Fifth {

	public static void main(String[] args) throws IOException {
		char n; 
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 

        System.out.println("������� �������, 'q'  ��� ������."); 	
        do { 
        n = (char)br.read(); // ������ ������� 
        System.out.println(n);
        }
        while(n != 'q');
}
}

