<h1>Projeto Spring Data JPA</h1>

<h2>🎯 Objetivo do Projeto</h2>
<p>Mostra os principais conceitos de mapeamento objeto relacional (ORM) usando o <strong>Spring Data JPA</strong>. Para isso, uma <strong>API RESTful</strong> foi desenvolvida com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.</p>

<h2>
🛑 Pré-requistos
</h2>

- [x] Fundamentos do Spring Boot

- [x] Noções de SQL

<h2> 🚦 Guia </h2>

<ol>
    <li> Apresentação do Projeto Base </li>
    <li> Configuração do banco de dados (SGBD <em>PostgreSQL</em>)</li>
    <li> Aplicando as <em>annotations</em></li>
    <li> Execução do fluxo back-end: <em>Controller - Service - Repository</em></li>
    <li> Validação - <em>Hibernate Validator</em> </li>
    <li> Consultas Avançadas - <em>Derived Query - Native Query</em></li>    
</ol>

<p>
O próprio Hibernate criará as tabelas ao inicialisar:
Hibernate: 

    create table tb_avaliacoes (
       id int8 generated by default as identity,
        altura float8 not null,
        cintura float8 not null,
        data_da_avaliacao timestamp,
        ombros float8 not null,
        peso float8 not null,
        quadril float8 not null,
        aluno_id int8,
        primary key (id)
    )
Hibernate:

    alter table if exists tb_avaliacoes 
       add constraint FK6tpnaiagpymhk20btjbsyldt3 
       foreign key (aluno_id) 
       references tb_alunos

</p>
<p>
As consultas Queries serão assim:<br>
Exemplo:<br>
    post http://localhost:8081/alunos
    delete http://localhost:8081/alunos/remover?nome=Antônio Veras
</p>
<p>
No Postman as consultas:
</p>
<p>
```json

    {
        "id": 1,
        "aluno": {
            "id": 1,
            "nome": "Antônio Veras",
            "cpf": "875.051.343-53",
            "bairro": "Joaquim Távora",
            "dataDeNascimento": "05/09/1977"
        },
        "dataDaAvaliacao": "04/08/2022 13:52:57",
        "peso": 66.5,
        "altura": 1.64,
        "quadril": 99.0,
        "cintura": 87.0,
        "ombros": 116.5
    }
</p>

<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
    <li>IDE IntelliJ</li>
    <li>Java 11</li>
    <li>Maven</li>
    <li><strong>Spring Web</strong></li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>PostgreSQL Driver</strong></li>
    <li><strong>Hibernate Validator</strong></li>
    <li>Lombok</li>
    <li>Postman</li>
</ul>


<h2><a href="https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/">
Anotações de Mapeamento </a></h2>

<strong>@Entity</strong>
Usada para especificar que a classe anotada atualmente representa um tipo de entidade.

<strong>@Table</strong>
Usada para especificar a tabela principal da entidade atualmente anotada.

<strong>@Id</strong>
Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.

<strong>@GeneratedValue</strong>
Especifica que o valor do identificador de entidade é gerado automaticamente.

<strong>@Column</strong>
Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.

<strong>@JoinColumn</strong>
Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.

<strong>@OneToMany</strong>
Usada para especificar um relacionamento de banco de dados um-para-muitos.

<strong>@OneToOne</strong>
Usada para especificar um relacionamento de banco de dados um-para-um.

<strong>@ManyToOne</strong>
Usada para especificar um relacionamento de banco de dados muitos-para-um.

<strong>cascade</strong>
Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.

<strong>mappedBy</strong>
Indica qual é o lado inverso ou não dominante da relação.

<h2>🔗 Links Úteis</h2>
<ul>
    <li><a href="https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok">Spring Initializr</a></li>
    <li><a href="https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html">Common application properties</a></li>
    <li><a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories">Spring Data JPA - Reference Documentation</a></li>
    <li><a href="https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted">Validation Reference Implementation: Reference Guide</a></li>

</ul>

<h2> Projeto Finalizado para Digital Innovation One </h2>

Disponibilizado por [Antônio JS Veras](https://www.linkedin.com/in/antônio-js-veras-b6896647 "Antônio JS Veras").



