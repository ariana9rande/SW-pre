package day230726;

public class AccountService
{
	Account[] accounts = new Account[100];
	int accountsIndex = 0;

	public void generateAccount()
	{
		int temp1, temp2;
		// 100 ~ 999 난수 생성
		temp1 = (int) (Math.random() * 900) + 100;
		temp2 = (int) (Math.random() * 900) + 100;

		String accountNum = temp1 + "-" + temp2;

		// 중복되는 계좌번호가 없고 배열의 인덱스를 초과하지 않으면 계좌 생성
		if (search(accountNum) == null && accountsIndex < accounts.length)
		{
			accounts[accountsIndex] = new Account(accountNum);
			accountsIndex++;
			System.out.println(accountNum + " 계좌 생성 완료");
		}
		else if (search(accountNum) != null)
			System.out.println("계좌 생성 실패. 중복 계좌번호");
		else
			System.out.println("계좌 생성 실패. 계좌 개수 제한 초과");
	}

	// 배열에서 계좌번호를 찾으면 Account, 못 찾으면 null 리턴
	public Account search(String accountNum)
	{
		Account account = new Account();

		for (int i = 0; i < accounts.length; i++)
		{
			if (accounts[i] != null && accounts[i].getAccountNum().equals(accountNum))
			{
				account = accounts[i];
				return account;
			}
		}
		return null;
	}

	// 배열에 있는 account의 정보를 출력, account가 없는 케이스는 따로 출력
	public void printAccounts()
	{
		boolean check = true;

		for (Account a : accounts)
		{
			if (a != null)
			{
				System.out.println("계좌번호 : " + a.getAccountNum() + ", 잔액 : " + a.getBalance());
				check = false;
			}
		}
		if (check)
		{
			System.out.println("Account가 존재하지 않습니다.");
		}
	}

	public void deposit(String accountNum, int money)
	{
		Account account = search(accountNum);

		// 예금 후 잔액이 범위를 초과하지 않을 경우 진행
		if (account.getBalance() + money <= 1000000)
		{
			account.setBalance(account.getBalance() + money);
			System.out.println(money + "원 예금 완료. 현재 잔액 : " + account.getBalance());
		}
		else
			System.out.println("예금 실패, 예금 후 잔액이 1,000,000원을 초과합니다.\n현재 잔액 : " + account.getBalance());
	}

	public void withdraw(String accountNum, int money)
	{
		Account account = search(accountNum);

		// 출금액이 잔고를 초과하지 않을 경우 진행
		if (account.getBalance() >= money)
			account.setBalance(account.getBalance() - money);
		else
			System.out.println("출금 실패, 잔액이 부족합니다.\n현재 잔액 : " + account.getBalance());
	}

	public void transfer(String accountNum, String accountNum2, int money)
	{
		Account account = search(accountNum);
		Account account2 = search(accountNum2);

		// 두 계좌를 모두 찾으면
		if (account != null && account2 != null)
		{
			// 출금 계좌의 잔액이 충분하고 이쳬 받을 계좌의 이체 후 잔액이 범위를 초과하지 않으면 진행
			if (account.getBalance() >= money && account2.getBalance() + money <= 1000000)
			{
				account.setBalance(account.getBalance() - money);
				account2.setBalance(account2.getBalance() + money);
				System.out.println(money + "원 이체 완료.");
				System.out.println(account.getAccountNum() + " 잔액 : " + account.getBalance());
				System.out.println(account2.getAccountNum() + " 잔액 : " + account2.getBalance());
			}
			// 출금 계좌의 잔액이 부족한 경우
			else if (account.getBalance() < money)
				System.out.println("이체 실패, 잔액이 부족합니다.\n" + account.getAccountNum() + " 현재 잔액 : " + account.getBalance());
			// 이체 후 잔액이 범위를 초과할 경우
			else if (account2.getBalance() + money > 1000000)
				System.out.println("이체 실패, 이체 후 잔액이 1,000,000원을 초과합니다.\n" + account2.getAccountNum() + " 현재 잔액 : "
						+ account2.getBalance());
		}
		// 계좌를 찾지 못한 경우
		else
			System.out.println("계좌번호를 제대로 입력해주세요.");
	}
}
