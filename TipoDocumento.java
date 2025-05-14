public class TipoDocumento {
    private String nome;
    private Cargo cargoResponsavel;

    public TipoDocumento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargoResponsavel() {
        return cargoResponsavel;
    }

    public void setCargoResponsavel(Cargo cargo) {
        this.cargoResponsavel = cargo;
    }
}
