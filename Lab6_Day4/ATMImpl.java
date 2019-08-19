package Lab6_Day4;

public class ATMImpl implements Atm_Interface{
	
	private int idATM;
	private int accountId;

	@Override
	public boolean withDraw(int sotienrut, double tienlerut) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(int sotiengui, double tienlegui) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double queryBalance(int sotien) {
		// TODO Auto-generated method stub
		return sotien;
	}

	@Override
	public boolean login(String ten, String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String xinchao) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public static void main(String[] args) {
		ATMImpl atmImpl = new ATMImpl();
		
		System.out.println(atmImpl.queryBalance(100));
	}
}
