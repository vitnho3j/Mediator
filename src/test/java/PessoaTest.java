import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaTest {

    @Test
    public void deveChamarViatura(){
        Pessoa pessoa = new Pessoa();
        assertEquals("Uma viatura está sendo chamada pelo seguinte motivo: Briga Conjugal\n" +
                "Uma Viatura está dirigindo-se para a localização: Cidade: CidadeTestNumero1, Rua:RuaTestNumero1, Numero: 1", pessoa.pedirViatura("Briga Conjugal", "Cidade: CidadeTestNumero1, Rua:RuaTestNumero1, Numero: 1"));
    }


}
