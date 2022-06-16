public class Pessoa {

    public String pedirViatura(String mensagem, String localizacao){
        return PostoPolicial.getInstancia().receberChamadoViatura(mensagem, localizacao);
    }



}
