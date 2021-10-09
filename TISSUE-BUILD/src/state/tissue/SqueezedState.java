package state.tissue;



public class SqueezedState implements State {

    Tissue  tissue ;
    public SqueezedState(Tissue  tissue ) {
        this.tissue  = tissue ;
    }

    @Override
    public void tornTissue () {
        System.out.println("Tissue  got torn ");
        tissue .setState(tissue .getTornState());
    }

    @Override
    public void dryTissue () {
        System.out.println("the tissue is dry");
    }

    @Override
    public void wetTissue () {
        System.out.println("the tissue is wet due to cleaning");

    }

    @Override
    public void squeezedTissue () {
        System.out.println("post work, tissue is squeezed");

    }


}


