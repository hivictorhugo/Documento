import java.util.ArrayList;
import java.util.List;

public abstract class Cargo {
    protected String nome;
    protected Cargo superior; // cargo acima na hierarquia
    protected List<TipoDocumento> documentosResponsaveis = new ArrayList<>();

    public Cargo(String nome) {
        this.nome = nome;
    }

    public void setSuperior(Cargo superior) {
        this.superior = superior;
    }

    public Cargo getSuperior() {
        return superior;
    }

    public void adicionarDocumento(TipoDocumento doc) {
        documentosResponsaveis.add(doc);
        doc.setCargoResponsavel(this);
    }

    public String getNome() {
        return nome;
    }

    public List<TipoDocumento> getDocumentosResponsaveis() {
        return documentosResponsaveis;
    }
}

