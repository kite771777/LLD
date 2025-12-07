package Problems.PaymentService.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService{
    public InstrumentDO addInstrument(InstrumentDO instrumentDO){
        CardInstrument cardInstrument=new CardInstrument();
        cardInstrument.instrumentId=new Random().nextInt(100-10)-10;
        cardInstrument.cardNumber=instrumentDO.cardNumber;
        cardInstrument.cvvNumber=instrumentDO.cvv;
        cardInstrument.instrumentType=InstrumentType.CARD;
        cardInstrument.userId=instrumentDO.userId;
        List<Instrument> userInstrumentsList = userVsInstruments.computeIfAbsent(cardInstrument.userId, k -> new ArrayList<>());
        userInstrumentsList.add(cardInstrument);
        return mapInstrumentToInstrumentDO(cardInstrument);
    }
    public List<InstrumentDO> getInstrumentsByUserId(int userId){
        List<Instrument> userInstruments=userVsInstruments.get(userId);
        List<InstrumentDO> userInstrumentsFetched=new ArrayList<>();
        for (Instrument instrument : userInstruments) {
            if (instrument.getInstrumentType() == InstrumentType.CARD)
                userInstrumentsFetched.add(mapInstrumentToInstrumentDO((CardInstrument) instrument));
        }
        return userInstrumentsFetched;
    }
    public InstrumentDO mapInstrumentToInstrumentDO(CardInstrument cardInstrument){
        InstrumentDO instrumentDOObj=new InstrumentDO();
        instrumentDOObj.instrumentType=cardInstrument.instrumentType;
        instrumentDOObj.instrumentID=cardInstrument.instrumentId;
        instrumentDOObj.cardNumber=cardInstrument.cardNumber;
        instrumentDOObj.cvv=cardInstrument.cvvNumber;
        instrumentDOObj.userId =cardInstrument.userId;
        return instrumentDOObj;
    }
}
