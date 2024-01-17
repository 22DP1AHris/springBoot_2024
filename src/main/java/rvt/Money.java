package rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }


    public Money plus(Money addition) {
        int newEuro = this.euros + addition.euros;
        int newCent = this.cents + addition.cents;
        if (newCent >= 100){
            newCent -= 100;
            newEuro++;
        }
        Money newMoney = new Money(newEuro, newCent); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros){
            return true;
        }
        else if (this.euros == compared.euros){
            if (this.cents < compared.cents){
                return true;
            }else { return false;}

        }else {return false;}
    }

    public Money minuss(Money decreaser) {
        int newEuro = this.euros - decreaser.euros;
        int newCent = this.cents - decreaser.cents;

        if (newCent < 0){
            newCent += 100;
            newEuro--;
        }
        if (newEuro < 0){
            newCent = 0;
            newEuro = 0;
        }
    
        Money newMoney = new Money(newEuro, newCent);
        // return the new Money object
        return newMoney;
    }
}
