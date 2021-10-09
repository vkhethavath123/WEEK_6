package state.tissue;

public interface Builder {
    Builder Paper();
    Builder Cutting();
    Builder Pressing();
    Tissue  build();
}
