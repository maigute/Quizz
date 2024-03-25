import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {
        String aluno = "Sérgio Marcos";
        String professor = "Brenno";
        String tema = "Energia Nuclear";
        String curso = "Segundo Período Engenharia de Software";
        String faculdade = "Faculdade Alfredo Nasser";

        System.out.println("Aluno: " + aluno);
        System.out.println("Professor: " + professor);
        System.out.println("Tema: " + tema);
        System.out.println("Curso: " + curso);
        System.out.println("Faculdade: " + faculdade);

        Scanner scanner = new Scanner(System.in);

        Questao[] questoes = new Questao[]{
                //1
                new Questao("Qual o principal elemento químico utilizado na energia nuclear?",
                        new String[]{"Oxigênio.", "Prata.", "Urânio.", "Ouro."}, "3"),
                //2
                new Questao("Conforme a classificação das fontes de energia, a fonte energética nuclear é enquadrada como",
                        new String[]{"fóssil.", "renovável.", "não renovável.", "poluente."}, "3"),
                //3
                new Questao("Qual o nome do principal processo envolvido na geração de calor nas usinas nucleares?",
                        new String[]{"Reator nuclear.", "Eletrólise.", "Bomba atômica.", "Fissão nuclear."}, "4"),
                //4
                new Questao("Qual das alternativas abaixo NÃO apresenta uma vantagem da energia nuclear?",
                        new String[]{"Emissão de grandes níveis de poluição.", "Pequena área territorial de instalação.", "Diminuto custo de operação das usinas.", "Elevado nível de produtividade."}, "1"),
                //5
                new Questao("Qual das alternativas abaixo apresenta uma desvantagem das usinas nucleares?",
                        new String[]{"Operação contínua das centrais locais.", "Geração de baixo volume de rejeitos.", "Elevado risco de acidente radioativo.", "Baixa utilização de água nas unidades."}, "3"),
                //6
                new Questao("Qual país é o maior produtor de energia nuclear do mundo?",
                        new String[]{"Países Baixos.", "Estados Unidos.", "Alemanha.", "Rússia."}, "2"),
                //7
                new Questao("Em qual estado brasileiro localizam-se as únicas centrais nucleares do Brasil?",
                        new String[]{"Rio de Janeiro.", "Pernambuco.", "São Paulo.", "Espírito Santo."}, "1"),
                //8
                new Questao("A geração de energia nuclear tem grande potencial de causar acidentes. O maior acidente em usina nuclear já registrado ocorreu no território atual da",
                        new String[]{"Alemanha.", "Ucrânia.", "Hungria.", "Itália."}, "2"),
                //9
                new Questao("A possibilidade de esgotamento das reservas mundiais de petróleo tornou-se uma preocupação mundial, e a busca por novas fontes de energia é um desafio para os cientistas. Sem elas, o mundo moderno não terá como manter seu arsenal tecnológico. Em relação a esse problema, pode-se considerar:",
                        new String[]{"A biomassa é uma alternativa sustentável de produção de energia por não ter relação com os recursos naturais utilizados na alimentação.",
                                "A energia nuclear tornou-se uma alternativa viável para o problema do aquecimento global, apesar de produzir lixo radioativo.",
                                "A produção de energia eólica não implica custos operacionais por ser obtida por meio do calor de combustão produzido pelo vento.",
                                "O custo da produção pela termoelétrica é compensado pela produção de energia limpa por não utilizar combustíveis fósseis."}, "2"),
                //10
                new Questao("No dia 26 de abril de 1986, à 1h23min58s, uma série de explosões destruiu o reator e o prédio do quarto bloco da Central Elétrica Atômica de Tchernóbil, na fronteira de Belarus. A catástrofe de Tchernóbil se converteu no mais grave acidente tecnológico do século XX. Para a pequena Belarus, o acidente representou uma desgraça nacional, levando-se em conta que ali não havia nenhuma central atômica. O evento ocorrido em Tchernóbil atesta e reforça incertezas, problemas e incongruências acerca do uso da energia nuclear. A esse respeito, assinale a alternativa correta.",
                        new String[]{"A biomassa é uma alternativa sustentável de produção de energia por não ter relação com os recursos naturais utilizados na alimentação.",
                                "A energia nuclear tornou-se uma alternativa viável para o problema do aquecimento global, apesar de produzir lixo radioativo.",
                                "A produção de energia eólica não implica custos operacionais por ser obtida por meio do calor de combustão produzido pelo vento.",
                                "O custo da produção pela termoelétrica é compensado pela produção de energia limpa por não utilizar combustíveis fósseis."}, "2"),
                //11
                new Questao("A adoção de usinas nucleares para gerar energia voltou ao debate no Brasil em função da anunciada crise energética. Entre as implicações mais graves que esse modelo de geração de energia cria, está",
                        new String[]{"o aumento do poder militar do Brasil, que ganhará um posto no Conselho de Segurança da ONU.",
                                "a obrigação do país de não produzir armas nucleares, o que mantém o status quo nuclear mundial.",
                                "a ameaça de explosão por ambientalistas radicais.",
                                "o lixo atômico, cuja atividade prolonga-se por gerações."}, "4"),
                //12
                new Questao("Um ano depois do terremoto seguido de tsunami que atingiu o Japão em 11 de março de 2011, causando o comprometimento da usina de Fukushima, a energia nuclear voltou a ser debatida pelos cientistas, ecologistas e pela sociedade civil que vêm destacando vantagens e desvantagens desse tipo de energia. Sobre a energia nuclear, é correto afirmar que:",
                        new String[]{"requer grandes espaços e estoques para seu funcionamento, mas sua tecnologia é barata e acessível a todos os países.",
                                "provoca grandes impactos sobre a biosfera e necessita de grandes estoques de combustível para produzir energia.",
                                "é considerada energia limpa e renovável, mas depende da sazonalidade climática e dos efeitos de fenômenos tectônicos.",
                                "apresenta mínima interferência no efeito estufa, mas um de seus maiores problemas é o destino final do lixo nuclear."}, "4"),
                //13
                new Questao("Qual é o principal objetivo do processo de fusão nuclear controlada?",
                        new String[]{"Produzir urânio enriquecido.", "Gerar eletricidade.", "Criar bombas nucleares.", "Desativar reatores nucleares."}, "2"),
                //14
                new Questao("Qual é o principal subproduto da fissão nuclear em reatores?",
                        new String[]{"Radioatividade.", "Urânio.", "Plutônio.", "Hélio."}, "1"),
                //15
                new Questao("Qual é o elemento mais comumente usado como combustível em reatores nucleares?",
                        new String[]{"Urânio.", "Plutônio.", "Tório.", "Césio."}, "1"),
        };

        for (Questao questao : questoes) {
            boolean respostaCorreta = false;
            do {
                System.out.println(questao.getEnunciado());
                String[] opcoes = questao.getOpcoes();
                for (int i = 0; i < opcoes.length; i++) {
                    System.out.println((i + 1) + ") " + opcoes[i]);
                }
                System.out.println("Digite sua resposta:");
                String resposta = scanner.nextLine();
                if (questao.verificarResposta(resposta)) {
                    System.out.println("Resposta Certa!");
                    respostaCorreta = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostaCorreta);
        }

        System.out.println("Parabéns, você completou o quiz!");
        scanner.close();
    }
}
