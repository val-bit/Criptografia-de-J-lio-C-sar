package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String letra) {
        return descriptografeOuCriptografe(letra,int = 3));

    }

    @Override
    public String descriptografar(String letra) {
        return descriptografeOuCriptografe(letra, int = -3));
    }
}
private String descriptografeOuCriptografe(String letra,int valor) {

}
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    char charLetra = letra.charAt(0);
    int codigo = charLetra;
    codigo = codigo + valor;

    for (int i = 0; i < letra.length(); i++) {
        charLetra = letra.charAt(i);
        if (codigo.isLetter(valor)) {
            antigaPosicao = alfabeto.indexOf(digito);
            novaPosicao = antigaPosicao + numero;
            if (novaPosicao < 0) {
                novaPosicao = novaPosicao + 26; }
            if (novaPosicao > 25) {
                novaPosicao = novaPosicao - 26;
    return "" +(char) codigo;

public interface Criptografia {

    public String criptografar(String letra);
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    String textoNovo = "";
    Character digito;
    int antigaPosicao;
    int novaPosicao;

    for (int i = 0; i < letra.length(); i++) {
        digito = letra.charAt(i);
        if (Character.isLetter(digito)) {
            antigaPosicao = alfabeto.indexOf(digito);
            novaPosicao = antigaPosicao + numero;
            if (novaPosicao < 0) {
                novaPosicao = novaPosicao + 26; }
            if (novaPosicao > 25) {
                novaPosicao = novaPosicao - 26;
            }textoNovo = textoNovo.concat(String.valueOf(alfabeto.charAt(novaPosicao)));
        }else {
            textoNovo = textoNovo.concat(String.valueOf(digito)); }
    }
        return textoNovo;


}

}




