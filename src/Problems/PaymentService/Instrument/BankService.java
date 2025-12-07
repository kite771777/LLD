package Problems.PaymentService.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService{
    public InstrumentDO addInstrument(InstrumentDO instrumentDO){
        BankInstrument bankInstrument=new BankInstrument();
        bankInstrument.instrumentId=new Random().nextInt(100-10)-10;
        bankInstrument.bankAccountNumber=instrumentDO.bankAccountNumber;
        bankInstrument.ifscCode=instrumentDO.ifsc;
        bankInstrument.instrumentType=InstrumentType.BANK;
        bankInstrument.userId=instrumentDO.userId;
        List<Instrument> userInstrumentsList = userVsInstruments.computeIfAbsent(bankInstrument.userId, k -> new ArrayList<>());
        userInstrumentsList.add(bankInstrument);
        return mapInstrumentToInstrumentDO(bankInstrument);
    }
    public List<InstrumentDO> getInstrumentsByUserId(int userId){
        List<Instrument> userInstruments=userVsInstruments.get(userId);
        List<InstrumentDO> userInstrumentsFetched=new ArrayList<>();
        for (Instrument instrument : userInstruments) {
            if (instrument.getInstrumentType() == InstrumentType.BANK)
                userInstrumentsFetched.add(mapInstrumentToInstrumentDO((BankInstrument) instrument));
        }
        return userInstrumentsFetched;
    }
    public InstrumentDO mapInstrumentToInstrumentDO(BankInstrument bankInstrument){
        InstrumentDO instrumentDOObj=new InstrumentDO();
        instrumentDOObj.instrumentType=bankInstrument.instrumentType;
        instrumentDOObj.instrumentID=bankInstrument.instrumentId;
        instrumentDOObj.bankAccountNumber=bankInstrument.bankAccountNumber;
        instrumentDOObj.ifsc=bankInstrument.ifscCode;
        instrumentDOObj.userId =bankInstrument.userId;
        return instrumentDOObj;
    }
}
