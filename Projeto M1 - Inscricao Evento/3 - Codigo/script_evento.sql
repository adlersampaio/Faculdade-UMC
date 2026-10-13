-- =====================================================================
-- Projeto: Inscrição para Evento - Atividade 1 - M1
-- Script do Banco de Dados (MySQL / MariaDB - XAMPP / phpMyAdmin)
-- Autores: Gabriel Gomes
--          Adler Augusto Vendramel Sampaio
--          Julia Nascimento Ignácio
-- =====================================================================

-- Cria o banco de dados (caso ainda não exista) e o seleciona
CREATE DATABASE IF NOT EXISTS `evento`
  DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `evento`;

-- Remove a tabela antiga, se existir, para recriar do zero
DROP TABLE IF EXISTS `inscricoes`;

-- ---------------------------------------------------------------------
-- Tabela de inscrições (12 campos)
-- ---------------------------------------------------------------------
CREATE TABLE `inscricoes` (
  `pk_id`          int(11)      NOT NULL AUTO_INCREMENT,            -- 1  Identificador (chave primária)
  `nome`           varchar(60)  NOT NULL,                           -- 2  Nome completo do participante
  `email`          varchar(80)  NOT NULL,                           -- 3  E-mail
  `telefone`       varchar(15)  NOT NULL,                           -- 4  Telefone / celular
  `cpf`            varchar(14)  NOT NULL,                           -- 5  CPF (000.000.000-00)
  `data_nasc`      date         NOT NULL,                           -- 6  Data de nascimento
  `empresa`        varchar(60)  NOT NULL,                           -- 7  Empresa / instituição
  `cargo`          varchar(40)  NOT NULL,                           -- 8  Cargo / função
  `cidade`         varchar(40)  NOT NULL,                           -- 9  Cidade
  `estado`         char(2)      NOT NULL,                           -- 10 UF
  `modalidade`     varchar(10)  NOT NULL,                           -- 11 Presencial ou Online
  `data_inscricao` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 12 Data/hora da inscrição (automática)
  PRIMARY KEY (`pk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ---------------------------------------------------------------------
-- Dados de teste
-- ---------------------------------------------------------------------
INSERT INTO `inscricoes`
  (`nome`, `email`, `telefone`, `cpf`, `data_nasc`, `empresa`, `cargo`, `cidade`, `estado`, `modalidade`)
VALUES
  ('Maria Silva',  'maria.silva@email.com',  '(11) 98888-1111', '111.222.333-44', '1998-03-15', 'Tech Soluções', 'Analista',       'Mogi das Cruzes', 'SP', 'Presencial'),
  ('João Pereira', 'joao.pereira@email.com', '(11) 97777-2222', '222.333.444-55', '2001-07-22', 'UMC',           'Estudante',      'Suzano',          'SP', 'Online'),
  ('Ana Costa',    'ana.costa@email.com',    '(21) 96666-3333', '333.444.555-66', '1995-11-02', 'Data Corp',     'Desenvolvedora', 'Rio de Janeiro',  'RJ', 'Presencial');

-- Consulta de conferência
SELECT * FROM `inscricoes`;
