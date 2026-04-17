public class Atividade1 {
    public static void main(String[] args){
        Inserir insercao = new Inserir();
        int[] lista = new int[5];
        int n = 0;

        n = insercao.inserirOrdenacaoDecrescente(lista, n, 10);
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 50);
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 30);
        n = insercao.inserirOrdenacaoDecrescente(lista, n, 40);
        System.out.println("Vetor ordenado de forma decrescente:");
        for (int i = 0; i < n; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}

