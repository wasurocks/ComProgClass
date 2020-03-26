import java.util.Scanner;

public class L05 {
	public static void main(String args[]) {
		var sc = new Scanner(System.in);
		System.out.print("Input your name: ");
		String username, password, confirmPassword;
		username = sc.nextLine();
		Boolean flag1 = false;
		Boolean flag2 = false;

		// Username check
		if(username.length() >= 4 && username.length() <= 255) {
			if((username.charAt(0) >= 'A' && username.charAt(0) <= 'Z')||(username.charAt(0) >= 'a' && username.charAt(0) <= 'z')) {
				if(!(username.contains(" ") || username.contains("\\") || username.contains(".."))) flag1 = true;
			}
		}

		if(flag1) {
			System.out.print("Enter your password: ");
			password = sc.nextLine();
			// Password check
			if(password.length() >= 4 && password.length() <= 255) {
				if(password.compareToIgnoreCase(username) != 0) {
					if(!(password.contains("*") || password.contains(" ") || password.contains("\\"))) {
						if(password.length() < 8) {
							if(password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%")) {
								for(int i=0, j=0; i<password.length(); i++) {
									if(password.charAt(i) >= '0' && password.charAt(i) <= '9') j++;
									if(j == 2) flag2 = true;
								}
							}
						} else {
							flag2 = true;
						}
					}
				} 
			}
			if(flag2) {
			System.out.print("Confirm your password: ");
			confirmPassword = sc.nextLine();
			// Confirm password
			if(confirmPassword.equals(password)) System.out.println("Account successfully created");
		}
		}
	}
}