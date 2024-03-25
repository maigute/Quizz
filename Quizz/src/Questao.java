class Questao {
    private final String enunciado;
    private final String[] opcoes;
    private final String respostaCorreta;

    public Questao(String enunciado, String[] opcoes, String respostaCorreta) {
        this.enunciado = enunciado;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public boolean verificarResposta(String resposta) {
        return resposta.equals(respostaCorreta);
    }
}
