package com;

public class Tes {

	public static void main(String[] args) {

		int ret = chk("Passs@123");
		System.out.println("Value :: " + ret);
		
	}

	public static int chk(String password) {


		int dupli = 0;
		for (int i = 0; i < password.length(); i++) {
			String s1 = String.valueOf(password.charAt(i));
			
			String s2="";
			if(i<= password.length()-2) {
				 s2 = String.valueOf(password.charAt(i+1));
			}
			else {
				 s2="";
			}
			

			if (s1.equalsIgnoreCase(s2)) {
				dupli++;
			}

		}
		
		return dupli;

	}

}
