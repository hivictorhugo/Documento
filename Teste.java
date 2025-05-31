import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @Test
    public void testCriacaoDeCargos() {
        Cargo diretor = new Diretor();
        Cargo gerente = new Gerente();
        Cargo supervisor = new Supervisor();

        assertEquals("Diretor", diretor.getNome());
        assertEquals("Gerente", gerente.getNome());
        assertEquals("Supervisor", supervisor.getNome());
    }

    @Test
    public void testDefinicaoDeHierarquia() {
        Cargo diretor = new Diretor();
        Cargo gerente = new Gerente();
        Cargo supervisor = new Supervisor();

        gerente.setSuperior(diretor);
        supervisor.setSuperior(gerente);

        assertEquals(diretor, gerente.getSuperior());
        assertEquals(gerente, supervisor.getSuperior());
    }

    @Test
    public void testAssociarDocumentoACargo() {
        Cargo supervisor = new Supervisor();
        TipoDocumento contrato = new TipoDocumento("Contrato");

        supervisor.adicionarDocumento(contrato);

        assertEquals(supervisor, contrato.getCargoResponsavel());
        assertTrue(supervisor.getDocumentosResponsaveis().contains(contrato));
    }

    @Test
    public void testMultiplosDocumentos() {
        Cargo gerente = new Gerente();
        TipoDocumento relatorio = new TipoDocumento("Relatório");
        TipoDocumento ata = new TipoDocumento("Ata");

        gerente.adicionarDocumento(relatorio);
        gerente.adicionarDocumento(ata);

        assertEquals(2, gerente.getDocumentosResponsaveis().size());
        assertEquals(gerente, relatorio.getCargoResponsavel());
        assertEquals(gerente, ata.getCargoResponsavel());
    }

    @Test
    public void testAlterarSuperior() {
        Cargo supervisor = new Supervisor();
        Cargo diretor = new Diretor();

        supervisor.setSuperior(diretor);

        assertEquals(diretor, supervisor.getSuperior());
    }
}
