package banking;

public class Bank {
    //    blank contructor
    public Bank() {

    }

    public void start_banking() {
        String fahad_pin = "1234";
        String esha_pin = "4321";
        Account fahad = new Account("Fahad", "01766610087", fahad_pin);
        Account esha = new Account("Esha", "01722453465", esha_pin);
        Account mehzabin = new Account("mehzabin", "018387465567");
        System.out.println(fahad);

        System.out.println(esha);

        fahad.add_money(1500);
        esha.add_money(2000);
        mehzabin.add_money(1000);

        fahad.cash_out(1000, esha_pin);
        mehzabin.cash_out(500, "12334");
        mehzabin.cash_out(500, "12334");

//        Fahad pin update
//        if (fahad.pin_update("1234", "1122"))
//            fahad_pin = "1122";
//        else
//            fahad_pin = fahad_pin;

        fahad_pin = fahad.pin_update("1234", "1122") ? "1122" : fahad_pin;

        fahad.cash_out(1200, fahad_pin);

    }
}
