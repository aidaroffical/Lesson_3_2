public class User {
    public static void main(String[] args) {
        BankAccount Optima = new BankAccount();
        Optima.deposit(15000.00);
        while (true) {
            try {
                Optima.withDraw(6000);
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                double balance = Optima.getBalance();

                System.out.println("У вас на счету: " + balance);
                System.out.println("Вы можете снять: " + remainingAmount);
                System.out.println("Вы сняли со счета: " + remainingAmount);

                try {
                    Optima.withDraw((int) remainingAmount);
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Остаток баланса: " + Optima.getBalance());

                break;
            }
        }
    }
}
