public class atv5 {
    public static void main(String[] args) {
        String nomeAluno = "Guedes";
        int idadeAluno = 19;
        int alturaAluno = 180;
        int nota = 10;
        String situacaoAluno = "Aprovado";

        System.out.println("""
        -- FICHA DO ALUNO --
        - Nome = %s
        - Idade = %d
        - Altura = %d
        - Nota = %d
        - Situacao = %s""".formatted(nomeAluno,idadeAluno,alturaAluno,nota,situacaoAluno));
    }
}