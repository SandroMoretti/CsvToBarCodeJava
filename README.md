Esse programa transforma uma entrada csv em uma página html, contendo um código de barras para cada entrada da lista csv
<br>


<h3>Forma de uso:</h3>
<br>
1 - Gere o jar (ou copie o que está na pasta dist)<br>
2 - Crie uma pasta com o seguinte conteúdo:<br>
	* jar gerado<br>
	* pasta lib gerada<br>
	* pasta imagens vazia (aqui será guardado todos os códigos de barras em png)<br>
	* arquivo.csv<br>
3 - Execute o jar gerado. Carregue o arquivo.csv. Será feito um arquivo em html com todos os códigos com a opção de imprimir.<br>
<br>
<h3>Arquivo csv</h3>

O jar está compilado para gerar o código de barras apartir de um concat do csv. Para funcionamento normal é necessário que o csv siga o seguinte padrão:


78787879,9,5,10809<br>
55222220,1,1,10118<br>
55222220,1,2,10018<br>
55222220,1,3,10018<br>
55222220,1,4,10018<br>
55222220,1,5,10018<br>
55222220,1,6,10018<br>
55222220,1,7,10018<br>
55222220,1,8,10018<br>
55222220,1,9,10018<br>

<b>Atenção: verifique se está usando ; ou \n como nova linha no csv. Isso deve ser adaptado no código. Esse exemplo assim está como \n.</b><br>
Você pode editar o código a qualquer momento para seguir outro padrão de gerar o código de barras.