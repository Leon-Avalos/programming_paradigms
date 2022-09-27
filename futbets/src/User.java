public class User {
    public String Id;
    public String name;
    public float account_balance;

    /**
     * Full constructor to create a User who bets to football matches
     * @param id A simple identifier, could be 123 for example
     * @param name Name of the person
     * @param account_balance Here will be reflected the balance of the account of the person, and it'll be altered
     *                        by winning or loosing a bet
     */
    public User(String id, String name) {
        Id = id;
        this.name = name;
        this.account_balance = 0;
    }

    @Override
    public String toString(){
        return this.name + " <ID>: " + this.Id;
    }
}
