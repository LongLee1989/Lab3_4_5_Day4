package Lab6_Day4;

interface Atm_Interface {
	boolean withDraw(int sotienrut, double tienlerut);
	boolean deposit(int sotiengui, double tienlegui);
	double queryBalance(int sotien);
	boolean login(String ten, String email);
	boolean logout(String xinchao);
}
