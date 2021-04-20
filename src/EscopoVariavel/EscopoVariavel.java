package EscopoVariavel;

public class EscopoVariavel {

    public static void main(String[] args) {
        EscopoVariavel escopoVariavel = new EscopoVariavel();
        escopoVariavel.setValor(10);

        System.out.println(escopoVariavel.getValor());

        System.out.println(escopoVariavel.calculaValor(20));

        System.out.println(escopoVariavel.getValor());
    }

        private int valor;

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }
        public int calculaValor(int valor) {
            valor = valor + 10;
            return valor;
        }
}
