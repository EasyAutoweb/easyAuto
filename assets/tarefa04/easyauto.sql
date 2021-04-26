/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     26/04/2021 05:38:29                          */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_CARRINHO_REFERENCE_CLIENTE') then
    alter table CARRINHOCOMPRA
       delete foreign key FK_CARRINHO_REFERENCE_CLIENTE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ENDERECO_REFERENCE_FORNECED') then
    alter table ENDERECO
       delete foreign key FK_ENDERECO_REFERENCE_FORNECED
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ENDERECO_REFERENCE_CLIENTE') then
    alter table ENDERECO
       delete foreign key FK_ENDERECO_REFERENCE_CLIENTE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ESTOQUE_REFERENCE_FORNECED') then
    alter table ESTOQUE
       delete foreign key FK_ESTOQUE_REFERENCE_FORNECED
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ESTOQUE_REFERENCE_PRODUTO') then
    alter table ESTOQUE
       delete foreign key FK_ESTOQUE_REFERENCE_PRODUTO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ITEMPEDI_REFERENCE_CARRINHO') then
    alter table ITEMPEDIDO
       delete foreign key FK_ITEMPEDI_REFERENCE_CARRINHO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ITEMPEDI_REFERENCE_PRODUTO') then
    alter table ITEMPEDIDO
       delete foreign key FK_ITEMPEDI_REFERENCE_PRODUTO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ITEMPEDI_REFERENCE_PEDIDO') then
    alter table ITEMPEDIDO
       delete foreign key FK_ITEMPEDI_REFERENCE_PEDIDO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PAGAMENT_REFERENCE_TIPOFORM') then
    alter table PAGAMENTO
       delete foreign key FK_PAGAMENT_REFERENCE_TIPOFORM
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PEDIDO_REFERENCE_CLIENTE') then
    alter table PEDIDO
       delete foreign key FK_PEDIDO_REFERENCE_CLIENTE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PEDIDO_REFERENCE_PAGAMENT') then
    alter table PEDIDO
       delete foreign key FK_PEDIDO_REFERENCE_PAGAMENT
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PEDIDO_REFERENCE_TIPOFRET') then
    alter table PEDIDO
       delete foreign key FK_PEDIDO_REFERENCE_TIPOFRET
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PEDIDO_REFERENCE_FORNECED') then
    alter table PEDIDO
       delete foreign key FK_PEDIDO_REFERENCE_FORNECED
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PRODUTO_REFERENCE_CATEGORI') then
    alter table PRODUTO
       delete foreign key FK_PRODUTO_REFERENCE_CATEGORI
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_USUARIO_REFERENCE_FORNECED') then
    alter table USUARIO
       delete foreign key FK_USUARIO_REFERENCE_FORNECED
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_USUARIO_REFERENCE_CLIENTE') then
    alter table USUARIO
       delete foreign key FK_USUARIO_REFERENCE_CLIENTE
end if;

drop table if exists CARRINHOCOMPRA;

drop table if exists CATEGORIA;

drop table if exists CLIENTE;

drop table if exists ENDERECO;

drop table if exists ESTOQUE;

drop table if exists FORNECEDOR;

drop table if exists ITEMPEDIDO;

drop table if exists PAGAMENTO;

drop table if exists PEDIDO;

drop table if exists PRODUTO;

drop table if exists TIPOFORMAPAGAMENTO;

drop table if exists TIPOFRETE;

drop table if exists USUARIO;

/*==============================================================*/
/* Table: CARRINHOCOMPRA                                        */
/*==============================================================*/
create table CARRINHOCOMPRA 
(
   ID_CARRINHO_COMPRA   int                            not null,
   ID_CLIENTE           int                            not null,
   constraint PK_CARRINHOCOMPRA primary key clustered (ID_CARRINHO_COMPRA)
);

/*==============================================================*/
/* Table: CATEGORIA                                             */
/*==============================================================*/
create table CATEGORIA 
(
   ID_CATEGORIA         int                            not null,
   CODIGO_CATEGORIA     text                           null,
   NOME_CATEGORIA       text                           null,
   DESCRICAO_CATEGORIA  text                           null,
   constraint PK_CATEGORIA primary key clustered (ID_CATEGORIA)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE 
(
   ID_CLIENTE           int                            not null,
   NUMERO_CLIENTE       int                            null,
   NOME_CLIENTE         text                           null,
   EMAIL_CLIENTE        text                           null,
   TELEFONE_FIXO_CLIENTE text                           null,
   TELEFONE_CELULAR_CLIENTE text                           null,
   CPF_CLIENTE          text                           null,
   constraint PK_CLIENTE primary key clustered (ID_CLIENTE)
);

/*==============================================================*/
/* Table: ENDERECO                                              */
/*==============================================================*/
create table ENDERECO 
(
   ID_ENDERECO          int                            not null,
   TIPO_ENDERECO        text                           null,
   RUA_ENDERECO         text                           null,
   NUMERO_ENDERECO      text                           null,
   COMPLEMENTO_ENDERECO text                           null,
   BAIRRO_ENDERECO      text                           null,
   CEP_ENDERECO         text                           null,
   CIDADE_ENDERECO      text                           null,
   ID_CLIENTE           int                            not null,
   ID_FORNECEDOR        int                            not null,
   constraint PK_ENDERECO primary key clustered (ID_ENDERECO)
);

/*==============================================================*/
/* Table: ESTOQUE                                               */
/*==============================================================*/
create table ESTOQUE 
(
   ID_ESTOQUE           int                            not null,
   ID_FORNECEDOR        int                            not null,
   QUANTIDADE_ESTOQUE   int                            null,
   LOCAL_ESTOQUE        text                           null,
   ID_PRODUTO           int                            not null,
   constraint PK_ESTOQUE primary key clustered (ID_ESTOQUE)
);

/*==============================================================*/
/* Table: FORNECEDOR                                            */
/*==============================================================*/
create table FORNECEDOR 
(
   ID_FORNECEDOR        int                            not null,
   CODIGO_FORNECEDOR    text                           null,
   RAZAO_SOCIAL_FORNECEDOR text                           null,
   CNPJ_FORNECEDOR      text                           null,
   TELEFONE_FIXO_FORNECEDOR text                           null,
   TELEFONE_CELULAR_FORNECEDOR text                           null,
   EMAIL_FORNECEDOR     text                           null,
   constraint PK_FORNECEDOR primary key clustered (ID_FORNECEDOR)
);

/*==============================================================*/
/* Table: ITEMPEDIDO                                            */
/*==============================================================*/
create table ITEMPEDIDO 
(
   ID_ITEM_PEDIDO       int                            not null,
   ID_CARRINHO_COMPRA   int                            null,
   VALOR_UNITARIO_ITEM_PEDIDO float                          null,
   QUANTIDADE_ITEM_PEDIDO int                            null,
   ID_PEDIDO            int                            null,
   ID_PRODUTO           int                            not null,
   constraint PK_ITEMPEDIDO primary key clustered (ID_ITEM_PEDIDO)
);

/*==============================================================*/
/* Table: PAGAMENTO                                             */
/*==============================================================*/
create table PAGAMENTO 
(
   ID_PAGAMENTO         int                            not null,
   ID_TIPO_FORMA_PAGAMENTO int                            null,
   FORMA_PAGAMENTO      text                           null,
   DATA_PAGAMENTO       date                           null,
   STATUS_PAGAMENTO     text                           null,
   constraint PK_PAGAMENTO primary key clustered (ID_PAGAMENTO)
);

/*==============================================================*/
/* Table: PEDIDO                                                */
/*==============================================================*/
create table PEDIDO 
(
   ID_PEDIDO            int                            not null,
   ID_CLIENTE           int                            not null,
   NUMERO_PEDIDO        int                            null,
   STATUS_PEDIDO        text                           null,
   DATA_PEDIDO          date                           null,
   VALOR_TOTAL_PEDIDO   float                          null,
   ID_TIPO_FRETE        int                            not null,
   ID_PAGAMENTO         int                            not null,
   ID_FORNECEDOR        int                            not null,
   constraint PK_PEDIDO primary key clustered (ID_PEDIDO)
);

/*==============================================================*/
/* Table: PRODUTO                                               */
/*==============================================================*/
create table PRODUTO 
(
   ID_PRODUTO           int                            not null,
   CODIGO_PRODUTO       text                           null,
   NOME_PRODUTO         text                           null,
   DESCRICAO_PRODUTO    text                           null,
   PESO_PRODUTO         float                          null,
   ID_CATEGORIA         int                            not null,
   constraint PK_PRODUTO primary key clustered (ID_PRODUTO)
);

/*==============================================================*/
/* Table: TIPOFORMAPAGAMENTO                                    */
/*==============================================================*/
create table TIPOFORMAPAGAMENTO 
(
   ID_TIPO_FORMA_PAGAMENTO int                            not null,
   CODIGO_TIPO_FORMA_PAGAMENTO text                           null,
   NOME_TIPO_FORMA_PAGAMENTO text                           null,
   constraint PK_TIPOFORMAPAGAMENTO primary key clustered (ID_TIPO_FORMA_PAGAMENTO)
);

/*==============================================================*/
/* Table: TIPOFRETE                                             */
/*==============================================================*/
create table TIPOFRETE 
(
   ID_TIPO_FRETE        int                            not null,
   CODIGO_TIPO_FRETE    text                           null,
   NOME_TIPO_FRETE      text                           null,
   DESCRICAO_TIPO_FRETE text                           null,
   constraint PK_TIPOFRETE primary key clustered (ID_TIPO_FRETE)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO 
(
   ID_USUARIO           int                            not null,
   ID_FORNECEDOR        int                            not null,
   ID_CLIENTE           int                            not null,
   TIPO_USUARIO         char(10)                       null,
   SENHA_USUARIO        int                            null,
   LOGIN_USUARIO        text                           null,
   constraint PK_USUARIO primary key clustered (ID_USUARIO)
);

alter table CARRINHOCOMPRA
   add constraint FK_CARRINHO_REFERENCE_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

alter table ENDERECO
   add constraint FK_ENDERECO_REFERENCE_FORNECED foreign key (ID_FORNECEDOR)
      references FORNECEDOR (ID_FORNECEDOR)
      on update restrict
      on delete restrict;

alter table ENDERECO
   add constraint FK_ENDERECO_REFERENCE_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

alter table ESTOQUE
   add constraint FK_ESTOQUE_REFERENCE_FORNECED foreign key (ID_FORNECEDOR)
      references FORNECEDOR (ID_FORNECEDOR)
      on update restrict
      on delete restrict;

alter table ESTOQUE
   add constraint FK_ESTOQUE_REFERENCE_PRODUTO foreign key (ID_PRODUTO)
      references PRODUTO (ID_PRODUTO)
      on update restrict
      on delete restrict;

alter table ITEMPEDIDO
   add constraint FK_ITEMPEDI_REFERENCE_CARRINHO foreign key (ID_CARRINHO_COMPRA)
      references CARRINHOCOMPRA (ID_CARRINHO_COMPRA)
      on update restrict
      on delete restrict;

alter table ITEMPEDIDO
   add constraint FK_ITEMPEDI_REFERENCE_PRODUTO foreign key (ID_PRODUTO)
      references PRODUTO (ID_PRODUTO)
      on update restrict
      on delete restrict;

alter table ITEMPEDIDO
   add constraint FK_ITEMPEDI_REFERENCE_PEDIDO foreign key (ID_PEDIDO)
      references PEDIDO (ID_PEDIDO)
      on update restrict
      on delete restrict;

alter table PAGAMENTO
   add constraint FK_PAGAMENT_REFERENCE_TIPOFORM foreign key (ID_TIPO_FORMA_PAGAMENTO)
      references TIPOFORMAPAGAMENTO (ID_TIPO_FORMA_PAGAMENTO)
      on update restrict
      on delete restrict;

alter table PEDIDO
   add constraint FK_PEDIDO_REFERENCE_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

alter table PEDIDO
   add constraint FK_PEDIDO_REFERENCE_PAGAMENT foreign key (ID_PAGAMENTO)
      references PAGAMENTO (ID_PAGAMENTO)
      on update restrict
      on delete restrict;

alter table PEDIDO
   add constraint FK_PEDIDO_REFERENCE_TIPOFRET foreign key (ID_TIPO_FRETE)
      references TIPOFRETE (ID_TIPO_FRETE)
      on update restrict
      on delete restrict;

alter table PEDIDO
   add constraint FK_PEDIDO_REFERENCE_FORNECED foreign key (ID_FORNECEDOR)
      references FORNECEDOR (ID_FORNECEDOR)
      on update restrict
      on delete restrict;

alter table PRODUTO
   add constraint FK_PRODUTO_REFERENCE_CATEGORI foreign key (ID_CATEGORIA)
      references CATEGORIA (ID_CATEGORIA)
      on update restrict
      on delete restrict;

alter table USUARIO
   add constraint FK_USUARIO_REFERENCE_FORNECED foreign key (ID_FORNECEDOR)
      references FORNECEDOR (ID_FORNECEDOR)
      on update restrict
      on delete restrict;

alter table USUARIO
   add constraint FK_USUARIO_REFERENCE_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

