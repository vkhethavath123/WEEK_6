package state.tissue;



public class Test {

    public static void main(String[] args) {

        TissueBuilder Paper=new TissueBuilder();
        Tissue  tissues=Paper.Paper().Cutting().Pressing().build();


        tissues.tornTissue ();

        tissues.squeezedTissue ();

        tissues.wetTissue ();

        tissues.dryTissue ();

        tissues.tornTissue ();
        
    }

}

