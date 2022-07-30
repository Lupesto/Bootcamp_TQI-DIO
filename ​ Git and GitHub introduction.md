# Introdução ao Git e Github



## O que é Git & Github? 

**Git**

- Criador: Linus Torvalds (mesmo criador do linux)
- Serve para tornar o software algo colaborativo. 
- Há outros sistemas de versionamento



**GitHub**
GitHub é da Microsoft, complementa o Git.  

Há serviços similares ao GitHub.
A linguagem para fazer a documentação no GitHub é o markdown (um HTML mais humanizado). A extensão desse tipo de arquivo é o ".md".  

Você pode utilizar o programa typora para editar markdown.


#Para que serve o git?
controle de versões, pode ser usado para diversos fins, na academia por exemplo podemos trabalhar com a colaboração de outras pessoas


#Instalação git:
[pesquisar por instalação do Git]


## Iniciando com Git
Crie uma pasta que servirá de raiz para os repositórios (workspace)

botão direito > git bash here
git init (gerá pasta oculta git)
ls -a (para ver arquivos ocultos)

*caso seja a primeira vez com o Git será necessária algumas configurações 
git config -- global user.email "seu email"
git config --global user.name "nomeUser"




## Config e reset git
git config --list <-lista de configurações no git
setar mesmo email e email/ name no github

para resetar config
git config --global --unset user.email
git config --global --unset user.nickname ou name

para setar o autor
git config --global user.email
substituir author de um commit mudará o sha1,
aparecerá no github de maneira diferente o author

#Primeiro Commit
commits carregam mensagem de textos

Como gerar commit (após git clone)
git add *
git commit -m "commit inicial"
git branch -M main
git push -u



# Adicionar repositório remoto a uma pasta 
git remote add origin +URL
git remote -v <- listar repositórios remotos
git status mostrará que não tem nenhuma pendencia no repositório


#Principais terminologias

sha1 (secure hash algorithm)
criada pela agencia de segurança dos EUA
encriptação de saída com 40 dígitos chave
Geração de chaves conforme modificações

*no commit aparece os  primeiros caracteres do sha1




#Como funciona o Git (ciclo de vida)
Ciclo de vida no git
[como funciona git por de baixo dos panos: https://prnt.sc/wZ6Hm12NHxyz]

Para abrir Git em determinado diretório:
Botão direito> git bash here


[objeto commit, blobs, trees, commits]

-----------
ciclo de vida no git

git init <- inicializa um repositório dentro de uma pasta
tracked <- dividem-se em não modificados, modificados e staged (aqueles esperando para algo)
untracked <- arquivos que o git se quer tem ciencia deles
git add <- manda um arquivo que o git não conhecia para staged 
unmodified <- aqueles no repositório que não teve modificação


dar um git add para um arquivo modificado mandará ele para staged
remover um arquivo unmodfied o joga para untracked
depois de staged o arquivo vai para commit, colocamos mensagem em um commit com autor e data
depois de commit um arquivo vai para não modificado (unmodified)


local repository <- na sua máquina
git status <- ver em que posição está um arquivo

working tree clean significa repositório de trabalho sem alteração
nothing to commit <-nada para comitar




#Conectando Github ao Git
## Por SSH
SSH: configuração de chaves, não fica pedindo senha para o usuário. Torna uma máquina confiável
GitHub setting > SSH > Create new SSH 
O site pede a chave pública SSH criada 

comandos para criar chaves:
ssh-keygen -t ed25519 -C seuEmail



### O que é token?
Token de acesso pessoal: pedirá nickname e senha, todo commit exige.
Mantenha o token em um local seguro pois ele some

gera uma chave pública e uma privada
dar um cd para /user/nomeUsuário/ .ssh
dar um ls
dar um cat id... .pub para visualizar a chave que vai no github


GitHub, criando token
Settings > Developer Settings > personal acess token > generate new token



Comandos no Windows úteis:
cd - mudar de pasta
dir - lista arquivos
mkdir - criar diretório
rmdir - remover diretório
del - deleta dó arquivos
cls - limpar terminal



------------------------------------------------



Links úteis: 

[Documentação markdown](https://www.markdownguide.org/basic-syntax/)
