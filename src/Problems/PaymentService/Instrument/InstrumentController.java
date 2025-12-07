package Problems.PaymentService.Instrument;

public class InstrumentController {
    InstrumentServiceFactory instrumentServiceFactory;
    public InstrumentController(){
        this.instrumentServiceFactory=new InstrumentServiceFactory();
    }
    public InstrumentDO addInstrument(InstrumentDO  instrumentDO){
        InstrumentService instrumentController=instrumentServiceFactory.getInstrumentService(instrumentDO.instrumentType);
        return instrumentController.addInstrument(instrumentDO);
    }
}
