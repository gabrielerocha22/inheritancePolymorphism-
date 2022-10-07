package entities;

public class Account {

	private Integer number;
	private String holder; //titular
	protected Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

//	public void setBalance(Double balance) {
//		this.balance = balance;
//	} // Não é utilizado, pois não se pode  mudar livremente o saldo da conta
	
	
	public void withdraw (Double amount) {
		balance -= amount;
	}
	
	public void deposit (Double amount) {
		balance += amount;
	}
	
	
	
}
