package state.tissue;


public class Tissue
{
    DryState dryState;
    WetState wetState;
    TornState tornState;
    SqueezedState squeezedState;
    State state;

    Tissue ()
    {
        dryState = new DryState(this);
        wetState= new WetState(this);
        squeezedState = new SqueezedState(this);
        tornState=new TornState(this);
        state=tornState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public DryState getDryState() {
        return dryState;
    }

    public WetState getWetState() {
        return wetState;
    }

    public TornState getTornState() {
        return tornState;
    }

    public SqueezedState getSqueezedState() {
        return squeezedState;
    }

    public void tornTissue ()  {
        state.tornTissue ();
    }

    public void dryTissue ()  {
        state.dryTissue ();
    }

    public void wetTissue () {
        state.wetTissue ();
    }
    public void squeezedTissue () {
        state.squeezedTissue ();
    }

}
