import java.io.*;

/**
 * Class Description . . . 
 *
 * @author: Autor
 * @version: 1.0 
 * Main Class File:  topAXX.java
 * File: Structure.java
 * Date: DD/MM/YYYY
 */


/*
    Deseja-se um aplicativo capaz de tomar os dados em um arquivo de 
textocontendo os PIBs por estado do Brasil (pib.txt) carregá-los na memória 
e executaros seguintes itens:

a-) Imprimir na tela a lista de PIB por estado em percentual em relação ao total.

b-) Gerar um arquivo de saída (saida.txt) sumarizando (somando) o PIB 
porregiões. Será fornecida uma lista de estados por regiões que deve ser lida 
doarquivo regioes.txt
*/

public class lab1 {
    public static void main(String [] args) {

        // nome do arquivo
        String nomeDoArquivo1 = "pib.txt";
//      String nomeDoArquivo2 = "regioes.txt";

        // linha temporaria
        String linha = null;
        
/*      ------------------------------------- */
/*      Abertura de arquivo e loop de leitura */
/*      ------------------------------------- */
        try {
            FileReader fileReader = new FileReader(nomeDoArquivo1);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // loop por cada linha do arquivo
            while((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }   

            // feche o arquivo
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeDoArquivo1 + "'");                
        }
        catch(IOException ex) {
            System.out.println("Erro lendo o arquivo '" + nomeDoArquivo1 + "'");                  
        }
        
        
/*      ------------------------------------- */
/*      Exemplo de escrita em arquivo         */
/*      ------------------------------------- */
        String arquivoDeSaida = "saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(arquivoDeSaida);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("pib da regiao X = $$$$");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao Y = $$$$");

            // feche o arquivo
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
        }    

    }
}
