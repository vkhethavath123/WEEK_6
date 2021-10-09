package state.tissue;


public class TornState implements State {

    Tissue  tissue ;
    public TornState(Tissue  tissue ) {
        this.tissue  = tissue ;
    }

    @Override
    public void tornTissue () {
        System.out.println("Tissue  got torn");

    }

    @Override
    public void dryTissue () {
        System.out.println("the tissue is dry");
        tissue .setState(tissue .getDryState());

    }

    @Override
    public void wetTissue () {
        System.out.println("the tissue is wet due to cleaning ");
        tissue .setState(tissue .getWetState());
    }

    @Override
    public void squeezedTissue () {
        System.out.println("post work, tissue is squeezed");
        tissue .setState(tissue .getSqueezedState());
    }

}


