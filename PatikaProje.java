import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı Adınız: ");
		String userName = input.nextLine();
		
		System.out.print("Şifreniz: ");
		String password = input.nextLine();
		
		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş Yaptınız !");
		} 
		else if (userName.equals("patika")) {
			System.out.println("Şifren yanlış, sıfırlamak istermisin?: \n1) evet\n2) hayır");
			int secim = input.nextInt();
			if (secim == 1) {
				System.out.print("Yeni şifrenizi giriniz: ");
				Scanner input2 = new Scanner(System.in);
				String newPassword = input2.nextLine();
				if (newPassword.equals(password) || newPassword.equals("java123")) System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				else System.out.println("Şifre oluşturuldu");
			}
			else
				System.out.println("Giriş Yapılamadı !");
		}
		else {
			System.out.println("Bilgileriniz Yanlış !");
		}
	}

}
