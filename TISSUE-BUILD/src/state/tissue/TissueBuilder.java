package state.tissue;


public class TissueBuilder implements Builder{

    TissueBuilder(){

    }

    @Override
    public Builder Paper() {
        System.out.println("Tissue is made of paper");
        return this;
    }

    @Override
    public Builder Cutting() {
        System.out.println("cutting paper gives tissues");
        return this;
    }

    @Override
    public Builder Pressing() {
        System.out.println("tissues are basically pressed papers ");
        return this;
    }

    @Override
    public Tissue  build() {
        Tissue  s=new Tissue ();
        System.out.println("New tissue  made!");
        return s;
    }
}


