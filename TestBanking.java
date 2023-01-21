package liveclass;

import java.util.Scanner;

public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Banking banking = new Banking();
		banking.setAccname("Arun");
		System.out.println("Account Name >>"+banking.getAccname());
		banking.setAccountno("9867437210");
		System.out.println("Account No >>"+banking.getAccountno());
		banking.setAccbalanace(8000);
		System.out.println("Account Balance >>"+banking.getAccbalanace());
		banking.setDepositamount(1000);
		System.out.println("Deposit Amount >>"+banking.getDepositamount());
		banking.setWithdrawamount(8000);
		System.out.println("Withdraw Amount >>"+banking.getWithdrawamount());

	}

}
