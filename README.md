# Getting Started

Com base no vídeo de lançamento do iPhone, elaborei em uma ferramenta de UML (mermaidchart), a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, com a criação das classes e interfaces no formato de arquivos .java.

## Diagramação UML do IPHONE

```mermaid
classDiagram
    IPhone --> AparelhoTelefonico
    IPhone --> NavegadorInternet
    IPhone --> ReprodutorMusical
    class AparelhoTelefonico {
        +void ligar()
        +void atender()
        +void iniciarCorreioVoz()
    }
    class NavegadorInternet{
        +void exibirPagina()
        +void adicionarNovaAba()
        +void atualizarPagina()
    }
    class ReprodutorMusical{
        +void tocar()
        +void pausar()
        +void selecionarMusica()
    }

```

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
