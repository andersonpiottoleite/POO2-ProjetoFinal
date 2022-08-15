# POO2-ProjetoFinal


"Melhorando o sistemas dos Correios"

Você foi contratado pelos Correios, para atuar na area de desenvolvimento de Software.

Eles querem que você melhore dois pontos na arquitetura e na escrita dos códigos atuais. 

Antes de realizar a implementação no projeto já existente, o Lider técnico pediu para você criar e entregar uma POC (Prova de Conceito),
contendo uma desmonstração do seu código (ele quer ver sua proposta para cada um dos dois pontos).


* O primeiro ponto de melhoria é na camada de persistência.

Atualmente eles trabalham com uma classe DAO (Data Access Object) para cada entidade da aplicação (Produto, Postagem, Carteiro, Entrega, etc).
Isso tem se tornado verboso para o time e pouco produtivo. Eles querem uma vida fácil, escrever pouco e ganhar produtividade...

Esperam que você proporcione isso à eles!

Sua primeira etapa será criar uma classe de Repository.

Essa classe deve ser genérica de modo que os metodos a seguir possam ser usados por qualquer entidade, para salvar, alterar, buscar e deletar.


* O Segundo ponto é o mecanismo de calculo do modo de entrega.

Para Entregas Comuns (de até 15 dias), é cobrado a taxa de 5 reais, para todo o Brasil.

Para Entregas Sedex 12 (12 horas do dia seguinte), é cobrado a taxa de 20 reais, para todo o Brasil.

Para Entregas Sedex Hoje (mesmo dia), é cobrado a taxa de 25 reais, para todo o Brasil.

Atualmente existe uma classe que gerencia esses calculos em um unico método, com alguns ifs. :(

Eles acham que isso no futuro pode gerar problemas, pois hoje todas essas regras estão em uma unica classe,  dificultando a manutenção.

Então pediram a você que aplique algum principio à esse código que gere desacoplamento e extensibilidade.

Mas à obra...
