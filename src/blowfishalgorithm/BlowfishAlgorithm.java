package blowfishalgorithm;

import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishAlgorithm {
	
		public static void main(String[] args) throws Exception {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("blowfish");
			SecretKey secretKey = keyGenerator.generateKey();
			Cipher cipher = Cipher.getInstance("blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the words want you to Encrypt : ");
			String inputText = sc.nextLine();
			byte[] encrypt = cipher.doFinal(inputText.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] decrypt = cipher.doFinal(encrypt);
			System.out.println("Words After Encryption : " + new String(encrypt));
			System.out.println("Words After Decryption : " + new String(decrypt));
		}
}
