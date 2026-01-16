package Problems.Atm.ATMStates;

import Problems.Atm.ATMRoomComponents.ATM;
import Problems.Atm.ATMRoomComponents.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Card has inserted!");
        atm.setCurrentATMState(new HasCardState());
    }
}
