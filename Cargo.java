import java.util.ArrayList;
import java.util.List;

public abstract class Cargo {
    protected String nome;
    protected List<TipoDocumento> documentosResponsaveis = new ArrayList<>();

    public Cargo(String nome) {
        this.nome = nome;
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
