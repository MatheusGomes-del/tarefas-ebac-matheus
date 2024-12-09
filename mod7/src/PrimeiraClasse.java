/**
 * @author matheus
 * @
 */


public class PrimeiraClasse {

    public static void main(String args[]) {
        Cliente matheus = new Cliente();

         matheus.setAtividade("varejo");
         matheus.setCodigo(1);
         matheus.cadastrarEndereco("Rua Teste");

        System.out.println(matheus.getEndereco());
        System.out.println(matheus.getAtividade());
        System.out.println(matheus.getCodigo());

        // matheus.metodoDeprecated();
    }
}
