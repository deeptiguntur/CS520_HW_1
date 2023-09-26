
public class InputValidation {

    public enum Category {FOOD, TRAVEL, BILLS, ENTERTAINMENT, OTHER}

    /**
     * Validate amount input
     * @param amount - the amount to entered for transaction
     * @throws IllegalArgumentException - amount should be a number and greater than 0 and less than 1000
     */
    public double validateAmount(String amountInput) {
        double amount = 0;
        try {
            amount = Double.parseDouble(amountInput);
            System.out.println(amount);
        } catch(NumberFormatException error) {
            throw new NumberFormatException("Amount can only be a number");
        }
        return amount;
    }

    /**
     * Validate amount input
     * @param amount - the amount to entered for transaction
     * @throws IllegalArgumentException - amount should be a number and greater than 0 and less than 1000
     */
    public boolean validateCategory(String amount) {
        return true;
    }
}