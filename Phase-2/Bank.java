package mobile_banking;

public class Bank {
    public void start_banking() {

        //Bkash System
        String mehzabin_pin = "3432";
        String mehzabin_mobile_number="01724267839";

        Bkash mehzabin = new Bkash("Mehzabin", mehzabin_mobile_number, mehzabin_pin);
        System.out.println("Initial info of Mehzabin:"+mehzabin.toString());

        mehzabin.add_money(10000);
        mehzabin.withdraw(1000,mehzabin_mobile_number,mehzabin_pin);

        System.out.println(mehzabin.getAccount_holder_name()+" "+ mehzabin.getAccount_phone_number()+" "+mehzabin.getbalance());

        //Nagad System
        String fahad_phone_number="01789232345";
        String fahad_pin="\0";

        Nagad fahad=new Nagad("Fahad",fahad_phone_number);
        System.out.println("Initial info of fahad:"+fahad.toString());

        fahad.add_money(10000);
        fahad.withdraw(1000,fahad_phone_number,fahad_pin);
        fahad_pin=fahad.pin_update(fahad_pin,"1234")?"1234":fahad_pin;
        fahad.withdraw(1000,fahad_phone_number,fahad_pin);

        System.out.println(fahad.getAccount_holder_name()+" "+ fahad.getAccount_phone_number()+" "+fahad.getbalance());

        //Rocket account
        String esha_pin = "3432";
        String esha_mobile_number="01724267839";

        Rocket esha = new Rocket("Esha", mehzabin_mobile_number, mehzabin_pin);
        System.out.println("Initial info of Adeb:"+mehzabin.toString());

        esha.add_money(10000);
        esha.withdraw(1000,esha_mobile_number,esha_pin);

        System.out.println(esha.getAccount_holder_name()+" "+esha.getAccount_phone_number()+" "+esha.getbalance());

    }
}