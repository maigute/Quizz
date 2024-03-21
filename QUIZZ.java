import java.util.Scanner;

public class QUIZZ {
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

//questão1
        String questao1 = "Qual o principal elemento químico utilizado na energia nuclear?";
        boolean respostacerta1 = false;

        do {
            System.out.println(questao1);
            
            System.out.println("1) Oxigênio.");
            System.out.println("2) Prata.");
            System.out.println("3) Urânio.");
            System.out.println("4) Ouro.");

            System.out.println("Digite sua resposta:");
            String resposta1 = scanner.nextLine();

            if (resposta1.equals("3")) {
                System.out.println("Resposta Certa!");
                respostacerta1 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta1);

        //questão2
        String questao2 = "Conforme a classificação das fontes de energia, a fonte energética nuclear é enquadrada como";
        boolean respostacerta2 = false;

        do {
            System.out.println(questao2);
            
            System.out.println("1) fóssil.");
            System.out.println("2) renovável.");
            System.out.println("3) não renovável.");
            System.out.println("4) poluente.");

            System.out.println("Digite sua resposta:");
            String resposta2 = scanner.nextLine();

            if (resposta2.equals("3")) {
                System.out.println("Resposta Certa!");
                respostacerta2 = true;
            } else {
                System.out.println("Resposta Errada! Tente Novamente.");
            }
        } while (!respostacerta2);

                //questão3
                String questao3 = "Qual o nome do principal processo envolvido na geração de calor nas usinas nucleares?";
                boolean respostacerta3 = false;
        
                do {
                    System.out.println(questao3);
                    
                    System.out.println("1) Reator nuclear.");
                    System.out.println("2) Eletrólise.");
                    System.out.println("3) Bomba atômica.");
                    System.out.println("4) Fissão nuclear.");
        
                    System.out.println("Digite sua resposta:");
                    String resposta3 = scanner.nextLine();
        
                    if (resposta3.equals("4")) {
                        System.out.println("Resposta Certa!");
                        respostacerta3 = true;
                    } else {
                        System.out.println("Resposta Errada! Tente Novamente.");
                    }
                } while (!respostacerta3);

            //questão4
            String questao4 = "Qual das alternativas abaixo NÃO apresenta uma vantagem da energia nuclear?";
            boolean respostacerta4 = false;
        
            do {
                System.out.println(questao4);
                    
                System.out.println("1) Emissão de grandes níveis de poluição.");
                System.out.println("2) Pequena área territorial de instalação.");
                System.out.println("3) Diminuto custo de operação das usinas.");
                System.out.println("4) Elevado nível de produtividade.");
        
                System.out.println("Digite sua resposta:");
                String resposta4 = scanner.nextLine();
        
                if (resposta4.equals("1")) {
                    System.out.println("Resposta Certa!");
                    respostacerta4 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta4);


            //questão5
            String questao5 = "Qual das alternativas abaixo apresenta uma desvantagem das usinas nucleares?";
            boolean respostacerta5 = false;
        
            do {
                System.out.println(questao5);
                    
                System.out.println("1) Operação contínua das centrais locais.");
                System.out.println("2) Geração de baixo volume de rejeitos.");
                System.out.println("3) Elevado risco de acidente radioativo.");
                System.out.println("4) Baixa utilização de água nas unidades.");
        
                System.out.println("Digite sua resposta:");
                String resposta5 = scanner.nextLine();
        
                if (resposta5.equals("3")) {
                    System.out.println("Resposta Certa!");
                    respostacerta5 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta5);    


            //questão6
            String questao6 = "Qual país é o maior produtor de energia nuclear do mundo?";
            boolean respostacerta6 = false;
        
            do {
                System.out.println(questao6);
                    
                System.out.println("1) Países Baixos.");
                System.out.println("2) Estados Unidos.");
                System.out.println("3) Alemanha.");
                System.out.println("4) Rússia.");
        
                System.out.println("Digite sua resposta:");
                String resposta6 = scanner.nextLine();
        
                if (resposta6.equals("2")) {
                    System.out.println("Resposta Certa!");
                    respostacerta6 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta6);


            //questão7
            String questao7 = "Em qual estado brasileiro localizam-se as únicas centrais nucleares do Brasil?";
            boolean respostacerta7 = false;
        
            do {
                System.out.println(questao7);
                    
                System.out.println("1) Rio de Janeiro.");
                System.out.println("2) Pernambuco.");
                System.out.println("3) São Paulo.");
                System.out.println("4) Espírito Santo.");
        
                System.out.println("Digite sua resposta:");
                String resposta7 = scanner.nextLine();
        
                if (resposta7.equals("1")) {
                    System.out.println("Resposta Certa!");
                    respostacerta7 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta7);  


            //questão8
            String questao8 = "A geração de energia nuclear tem grande potencial de causar acidentes. O maior acidente em usina nuclear já registrado ocorreu no território atual da";
            boolean respostacerta8 = false;
        
            do {
                System.out.println(questao8);
                    
                System.out.println("1) Alemanha.");
                System.out.println("2) Ucrânia.");
                System.out.println("3) Hungria.");
                System.out.println("4) Itália.");
        
                System.out.println("Digite sua resposta:");
                String resposta8 = scanner.nextLine();
        
                if (resposta8.equals("2")) {
                    System.out.println("Resposta Certa!");
                    respostacerta8 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta8);


            //questão9
            String questao9 = "A possibilidade de esgotamento das reservas mundiais de petróleo tornou-se uma preocupação mundial, e a busca por novas fontes de energia é um desafio para os cientistas. Sem elas, o mundo moderno não terá como manter seu arsenal tecnológico. Em relação a esse problema, pode-se considerar:";
            boolean respostacerta9 = false;
        
            do {
                System.out.println(questao9);
                    
                System.out.println("1) A biomassa é uma alternativa sustentável de produção de energia por não ter relação com os recursos naturais utilizados na alimentação.");
                System.out.println("2) A energia nuclear tornou-se uma alternativa viável para o problema do aquecimento global, apesar de produzir lixo radioativo.");
                System.out.println("3) A produção de energia eólica não implica custos operacionais por ser obtida por meio do calor de combustão produzido pelo vento");
                System.out.println("4) O custo da produção pela termoelétrica é compensado pela produção de energia limpa por não utilizar combustíveis fósseis.");
        
                System.out.println("Digite sua resposta:");
                String resposta9 = scanner.nextLine();
        
                if (resposta9.equals("2")) {
                    System.out.println("Resposta Certa!");
                    respostacerta9 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta9);


            //questão10
            String questao10 = "No dia 26 de abril de 1986, à 1h23min58s, uma série de explosões destruiu o reator e o prédio do quarto bloco da Central Elétrica Atômica de Tchernóbil, na fronteira de Belarus. A catástrofe de Tchernóbil se converteu no mais grave acidente tecnológico do século XX. Para a pequena Belarus, o acidente representou uma desgraça nacional, levando-se em conta que ali não havia nenhuma central atômica.";
            boolean respostacerta10 = false;
        
            do {
                System.out.println(questao10);
                System.out.println("O evento ocorrido em Tchernóbil atesta e reforça incertezas, problemas e incongruências acerca do uso da energia nuclear. A esse respeito, assinale a alternativa correta.");
                    
                System.out.println("1) A biomassa é uma alternativa sustentável de produção de energia por não ter relação com os recursos naturais utilizados na alimentação.");
                System.out.println("2) A energia nuclear tornou-se uma alternativa viável para o problema do aquecimento global, apesar de produzir lixo radioativo.");
                System.out.println("3) A produção de energia eólica não implica custos operacionais por ser obtida por meio do calor de combustão produzido pelo vento");
                System.out.println("4) O custo da produção pela termoelétrica é compensado pela produção de energia limpa por não utilizar combustíveis fósseis.");
        
                System.out.println("Digite sua resposta:");
                String resposta10 = scanner.nextLine();
        
                if (resposta10.equals("2")) {
                    System.out.println("Resposta Certa!");
                    respostacerta10 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta10);


            //questão11
            String questao11 = "A adoção de usinas nucleares para gerar energia voltou ao debate no Brasil em função da anunciada crise energética. Entre as implicações mais graves que esse modelo de geração de energia cria, está";
            boolean respostacerta11 = false;
        
            do {
                System.out.println(questao11);
   
                System.out.println("1) o aumento do poder militar do Brasil, que ganhará um posto no Conselho de Segurança da ONU.");
                System.out.println("2) a obrigação do país de não produzir armas nucleares, o que mantém o status quo nuclear mundial");
                System.out.println("3) a ameaça de explosão por ambientalistas radicais.");
                System.out.println("4) o lixo atômico, cuja atividade prolonga-se por gerações.");
        
                System.out.println("Digite sua resposta:");
                String resposta11 = scanner.nextLine();
        
                if (resposta11.equals("4")) {
                    System.out.println("Resposta Certa!");
                    respostacerta11 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta11);


            //questão12
            String questao12 = "Um ano depois do terremoto seguido de tsunami que atingiu o Japão em 11 de março de 2011, causando o comprometimento da usina de Fukushima, a energia nuclear voltou a ser debatida pelos cientistas, ecologistas e pela sociedade civil que vêm destacando vantagens e desvantagens desse tipo de energia. Sobre a energia nuclear, é correto afirmar que";
            boolean respostacerta12 = false;
        
            do {
                System.out.println(questao12);
   
                System.out.println("1) requer grandes espaços e estoques para seu funcionamento, mas sua tecnologia é barata e acessível a todos os países.");
                System.out.println("2) provoca grandes impactos sobre a biosfera e necessita de grandes estoques de combustível para produzir energia.");
                System.out.println("3) é considerada energia limpa e renovável, mas depende da sazonalidade climática e dos efeitos de fenômenos tectônicos.");
                System.out.println("4) apresenta mínima interferência no efeito estufa, mas um de seus maiores problemas é o destino final do lixo nuclear.");
        
                System.out.println("Digite sua resposta:");
                String resposta12 = scanner.nextLine();
        
                if (resposta12.equals("4")) {
                    System.out.println("Resposta Certa!");
                    respostacerta12 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta12);


            //questão13
            String questao13 = "Qual é o principal objetivo do processo de fusão nuclear controlada?";
            boolean respostacerta13 = false;
        
            do {
                System.out.println(questao13);
   
                System.out.println("1) Produzir urânio enriquecido");
                System.out.println("2) Gerar eletricidade");
                System.out.println("3) Criar bombas nucleares");
                System.out.println("4) Desativar reatores nucleares");
        
                System.out.println("Digite sua resposta:");
                String resposta13 = scanner.nextLine();
        
                if (resposta13.equals("2")) {
                    System.out.println("Resposta Certa!");
                    respostacerta13 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta13);


            //questão14
            String questao14 = "Qual é o principal subproduto da fissão nuclear em reatores?";
            boolean respostacerta14 = false;
        
            do {
                System.out.println(questao13);
   
                System.out.println("1) Radioatividade");
                System.out.println("2) Urânio");
                System.out.println("3) Plutônio");
                System.out.println("4) Hélio");
        
                System.out.println("Digite sua resposta:");
                String resposta14 = scanner.nextLine();
        
                if (resposta14.equals("1")) {
                    System.out.println("Resposta Certa!");
                    respostacerta14 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta14);


            //questão15
            String questao15 = "Qual é o elemento mais comumente usado como combustível em reatores nucleares?";
            boolean respostacerta15 = false;
        
            do {
                System.out.println(questao13);
   
                System.out.println("1) Urânio");
                System.out.println("2) Plutônio");
                System.out.println("3) Tório");
                System.out.println("4) Césio");
        
                System.out.println("Digite sua resposta:");
                String resposta15 = scanner.nextLine();
        
                if (resposta15.equals("1")) {
                    System.out.println("Resposta Certa!");
                    respostacerta15 = true;
                } else {
                    System.out.println("Resposta Errada! Tente Novamente.");
                }
            } while (!respostacerta15);

            System.out.println("Parabéns, você completou o quiz!");
            scanner.close();
    }
}
