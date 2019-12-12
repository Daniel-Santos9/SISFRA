-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.2.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para sisfra
CREATE DATABASE IF NOT EXISTS `sisfra` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sisfra`;

-- Copiando estrutura para tabela sisfra.administrador
CREATE TABLE IF NOT EXISTS `administrador` (
  `Admin_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Admin_Nome` varchar(50) NOT NULL,
  `User_ID` int(11) NOT NULL,
  PRIMARY KEY (`Admin_ID`),
  UNIQUE KEY `User_ID` (`User_ID`),
  CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `usuario` (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.administrador: ~4 rows (aproximadamente)
DELETE FROM `administrador`;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` (`Admin_ID`, `Admin_Nome`, `User_ID`) VALUES
	(1, 'ADMIN', 1),
	(2, 'PEDRO', 18),
	(3, 'PAOI', 19),
	(4, 'ADMIN2', 20);
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.aula
CREATE TABLE IF NOT EXISTS `aula` (
  `Aula_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Aula_Dia` varchar(50) DEFAULT NULL,
  `Disc_ID` int(11) NOT NULL,
  `Hora_ID` int(11) NOT NULL,
  `Turma_ID` int(11) NOT NULL,
  PRIMARY KEY (`Aula_ID`),
  KEY `Turma_ID` (`Turma_ID`),
  KEY `aula_ibfk_2` (`Disc_ID`),
  KEY `aula_ibfk_3` (`Hora_ID`),
  CONSTRAINT `aula_ibfk_1` FOREIGN KEY (`Turma_ID`) REFERENCES `turma` (`Turma_ID`),
  CONSTRAINT `aula_ibfk_2` FOREIGN KEY (`Disc_ID`) REFERENCES `disciplina` (`Disc_ID`),
  CONSTRAINT `aula_ibfk_3` FOREIGN KEY (`Hora_ID`) REFERENCES `horario` (`Hora_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.aula: ~8 rows (aproximadamente)
DELETE FROM `aula`;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` (`Aula_ID`, `Aula_Dia`, `Disc_ID`, `Hora_ID`, `Turma_ID`) VALUES
	(1, 'SEGUNDA', 1, 5, 1),
	(2, 'SEGUNDA', 1, 6, 1),
	(3, 'SEGUNDA', 3, 7, 1),
	(4, 'SEGUNDA', 3, 8, 1),
	(5, 'TERÇA', 2, 9, 2),
	(6, 'TERÇA', 2, 10, 2),
	(7, 'TERÇA', 4, 11, 2),
	(8, 'TERÇA', 4, 12, 2);
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `Curso_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Curso_Nome` varchar(50) NOT NULL,
  `Curso_Sigla` varchar(3) NOT NULL,
  `Prof_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Curso_ID`),
  UNIQUE KEY `Prof_ID` (`Prof_ID`),
  CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`Prof_ID`) REFERENCES `professor` (`Prof_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.curso: ~1 rows (aproximadamente)
DELETE FROM `curso`;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` (`Curso_ID`, `Curso_Nome`, `Curso_Sigla`, `Prof_ID`) VALUES
	(1, 'SISTEMAS DE INFORMAÇÃO', 'SI', 1);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.disciplina
CREATE TABLE IF NOT EXISTS `disciplina` (
  `Disc_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Disc_Nome` varchar(50) NOT NULL,
  `Disc_CH` int(11) NOT NULL,
  `Disc_AS` int(11) NOT NULL,
  `Prof_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Disc_ID`),
  KEY `Prof_ID` (`Prof_ID`),
  CONSTRAINT `disciplina_ibfk_1` FOREIGN KEY (`Prof_ID`) REFERENCES `professor` (`Prof_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.disciplina: ~4 rows (aproximadamente)
DELETE FROM `disciplina`;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` (`Disc_ID`, `Disc_Nome`, `Disc_CH`, `Disc_AS`, `Prof_ID`) VALUES
	(1, 'BANCO DE DADOS', 80, 4, 1),
	(2, 'POO', 80, 4, 1),
	(3, 'PROGRAMAÇÃO WEB', 80, 4, 2),
	(4, 'POKEMON GO', 40, 2, 2);
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.falta
CREATE TABLE IF NOT EXISTS `falta` (
  `Falta_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Falta_Dt` date NOT NULL,
  `Falta_Obs` varchar(250) DEFAULT NULL,
  `Falta_Qtd` int(11) NOT NULL,
  `Falta_Status` varchar(3) NOT NULL,
  `Func_ID` int(11) NOT NULL,
  `Disc_ID` int(11) NOT NULL,
  PRIMARY KEY (`Falta_ID`),
  KEY `Func_ID` (`Func_ID`),
  KEY `Disc_ID` (`Disc_ID`),
  CONSTRAINT `falta_ibfk_1` FOREIGN KEY (`Func_ID`) REFERENCES `funcionario` (`Func_ID`),
  CONSTRAINT `falta_ibfk_2` FOREIGN KEY (`Disc_ID`) REFERENCES `disciplina` (`Disc_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.falta: ~10 rows (aproximadamente)
DELETE FROM `falta`;
/*!40000 ALTER TABLE `falta` DISABLE KEYS */;
INSERT INTO `falta` (`Falta_ID`, `Falta_Dt`, `Falta_Obs`, `Falta_Qtd`, `Falta_Status`, `Func_ID`, `Disc_ID`) VALUES
	(2, '2017-09-21', 'CAXUMBA', 2, 'ESP', 1, 1),
	(3, '2017-07-21', 'GRADUAÇÃO', 2, 'ACC', 1, 3),
	(4, '2017-09-22', NULL, 2, 'ESP', 1, 2),
	(5, '2017-09-22', NULL, 2, 'ACC', 1, 4),
	(6, '2017-09-21', NULL, 2, 'ACC', 1, 4),
	(7, '2014-11-15', 'CAGANEIRA', 2, 'ESP', 1, 1),
	(8, '2020-10-04', 'FALECEU', 3, 'ESP', 1, 1),
	(9, '2020-10-04', 'FALECEU', 3, 'ESP', 1, 1),
	(10, '2012-12-12', '', 1, 'ESP', 1, 4),
	(11, '2012-04-20', '', 5, 'ESP', 1, 1);
/*!40000 ALTER TABLE `falta` ENABLE KEYS */;

-- Copiando estrutura para view sisfra.faltas
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `faltas` (
	`Prof_ID` INT(11) NOT NULL,
	`PROFESSOR` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`Disc_ID` INT(11) NOT NULL,
	`DISCIPLINA` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`QUANTIDADE` INT(11) NOT NULL,
	`DIA` DATE NOT NULL,
	`OBSERVAÇÃO` VARCHAR(250) NULL COLLATE 'utf8_general_ci',
	`TURMA` VARCHAR(25) NOT NULL COLLATE 'utf8_general_ci',
	`TURNO` VARCHAR(1) NOT NULL COLLATE 'utf8_general_ci',
	`Periodo` VARCHAR(25) NOT NULL COLLATE 'utf8_general_ci',
	`Curso_ID` INT(11) NOT NULL,
	`CURSO` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`SITUACAO` VARCHAR(3) NOT NULL COLLATE 'utf8_general_ci',
	`Falta_ID` INT(11) NOT NULL,
	`Func_ID` INT(11) NOT NULL
) ENGINE=MyISAM;

-- Copiando estrutura para tabela sisfra.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `Func_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Func_Nome` varchar(50) NOT NULL,
  `User_ID` int(11) NOT NULL,
  PRIMARY KEY (`Func_ID`),
  UNIQUE KEY `User_ID` (`User_ID`),
  CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `usuario` (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.funcionario: ~1 rows (aproximadamente)
DELETE FROM `funcionario`;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`Func_ID`, `Func_Nome`, `User_ID`) VALUES
	(1, 'Pedro Porteiro', 3);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.horario
CREATE TABLE IF NOT EXISTS `horario` (
  `Hora_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Hora_Ini` time NOT NULL,
  `Hora_Fim` time NOT NULL,
  PRIMARY KEY (`Hora_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.horario: ~12 rows (aproximadamente)
DELETE FROM `horario`;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` (`Hora_ID`, `Hora_Ini`, `Hora_Fim`) VALUES
	(1, '07:20:00', '08:20:00'),
	(2, '08:20:00', '09:20:00'),
	(3, '09:40:00', '10:40:00'),
	(4, '10:40:00', '11:40:00'),
	(5, '13:00:00', '14:00:00'),
	(6, '14:00:00', '15:00:00'),
	(7, '15:20:00', '16:20:00'),
	(8, '16:20:00', '17:20:00'),
	(9, '18:00:00', '18:45:00'),
	(10, '18:45:00', '19:30:00'),
	(11, '19:45:00', '20:30:00'),
	(12, '20:30:00', '21:15:00');
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.professor
CREATE TABLE IF NOT EXISTS `professor` (
  `Prof_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Prof_Nome` varchar(50) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `Curso_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Prof_ID`),
  UNIQUE KEY `User_ID` (`User_ID`,`Curso_ID`),
  KEY `Curso_ID` (`Curso_ID`,`User_ID`),
  CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`User_ID`) REFERENCES `usuario` (`User_ID`) ON UPDATE CASCADE,
  CONSTRAINT `professor_ibfk_2` FOREIGN KEY (`Curso_ID`) REFERENCES `curso` (`Curso_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.professor: ~10 rows (aproximadamente)
DELETE FROM `professor`;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` (`Prof_ID`, `Prof_Nome`, `User_ID`, `Curso_ID`) VALUES
	(1, 'JOÃO MATEMÁTICO', 4, 1),
	(2, 'TEODORO SAMPAIO', 2, NULL),
	(7, 'PEDRO', 10, NULL),
	(8, 'PEDRO', 11, NULL),
	(9, 'PEDRO', 12, NULL),
	(10, 'PEDRO', 13, NULL),
	(11, 'PEDRO', 14, NULL),
	(12, 'PEDRO', 15, NULL),
	(13, 'PEDRO', 16, NULL),
	(14, '', 17, NULL);
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;

-- Copiando estrutura para view sisfra.rdt
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `rdt` (
	`Disc_ID` INT(11) NOT NULL,
	`Disc_Nome` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`Turma_ID` INT(11) NOT NULL
) ENGINE=MyISAM;

-- Copiando estrutura para tabela sisfra.reposicao
CREATE TABLE IF NOT EXISTS `reposicao` (
  `Rep_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Rep_Dt` date NOT NULL,
  `Rep_Qtd` int(11) NOT NULL,
  `Rep_Turno` varchar(1) NOT NULL,
  `Rep_Status` varchar(3) NOT NULL,
  `Disc_ID` int(11) NOT NULL,
  `Falta_ID` int(11) NOT NULL,
  PRIMARY KEY (`Rep_ID`),
  KEY `Disc_ID` (`Disc_ID`),
  KEY `reposicao_ibfk_2` (`Falta_ID`),
  CONSTRAINT `reposicao_ibfk_1` FOREIGN KEY (`Disc_ID`) REFERENCES `disciplina` (`Disc_ID`),
  CONSTRAINT `reposicao_ibfk_2` FOREIGN KEY (`Falta_ID`) REFERENCES `falta` (`Falta_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.reposicao: ~13 rows (aproximadamente)
DELETE FROM `reposicao`;
/*!40000 ALTER TABLE `reposicao` DISABLE KEYS */;
INSERT INTO `reposicao` (`Rep_ID`, `Rep_Dt`, `Rep_Qtd`, `Rep_Turno`, `Rep_Status`, `Disc_ID`, `Falta_ID`) VALUES
	(1, '2017-09-24', 2, 'N', 'ACC', 1, 2),
	(2, '2015-12-22', 2, 'M', 'ACC', 2, 4),
	(3, '2014-05-04', 2, 'M', 'ACC', 1, 2),
	(4, '2010-12-21', 2, 'M', 'ACC', 1, 2),
	(5, '2012-12-12', 2, 'T', 'ACC', 2, 4),
	(6, '2014-10-12', 2, 'N', 'ACC', 1, 2),
	(7, '2012-12-12', 2, 'M', 'ACC', 1, 2),
	(8, '2012-12-11', 2, 'M', 'CAN', 2, 4),
	(9, '2017-09-24', 2, 'T', 'CAN', 2, 4),
	(10, '2014-11-21', 2, 'M', 'CAN', 3, 3),
	(11, '2017-09-25', 2, 'T', 'ESP', 4, 5),
	(12, '2017-09-24', 2, 'M', 'ESP', 3, 3),
	(13, '2018-12-20', 2, 'M', 'ESP', 1, 2);
/*!40000 ALTER TABLE `reposicao` ENABLE KEYS */;

-- Copiando estrutura para view sisfra.reposicoes
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `reposicoes` (
	`Prof_ID` INT(11) NOT NULL,
	`PROFESSOR` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`Disc_ID` INT(11) NOT NULL,
	`DISCIPLINA` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`QUANTIDADE` INT(11) NOT NULL,
	`DIA` DATE NOT NULL,
	`TURNO` VARCHAR(1) NOT NULL COLLATE 'utf8_general_ci',
	`TURMA` VARCHAR(25) NOT NULL COLLATE 'utf8_general_ci',
	`PERIODO` VARCHAR(25) NOT NULL COLLATE 'utf8_general_ci',
	`Curso_ID` INT(11) NOT NULL,
	`CURSO` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`SITUACAO` VARCHAR(3) NOT NULL COLLATE 'utf8_general_ci',
	`Rep_ID` INT(11) NOT NULL
) ENGINE=MyISAM;

-- Copiando estrutura para tabela sisfra.turma
CREATE TABLE IF NOT EXISTS `turma` (
  `Turma_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Turma_Nome` varchar(25) NOT NULL,
  `Turma_Turno` varchar(1) NOT NULL,
  `Turma_Semestre` varchar(25) NOT NULL,
  `Curso_ID` int(11) NOT NULL,
  PRIMARY KEY (`Turma_ID`),
  KEY `Curso_ID` (`Curso_ID`),
  CONSTRAINT `turma_ibfk_1` FOREIGN KEY (`Curso_ID`) REFERENCES `curso` (`Curso_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.turma: ~2 rows (aproximadamente)
DELETE FROM `turma`;
/*!40000 ALTER TABLE `turma` DISABLE KEYS */;
INSERT INTO `turma` (`Turma_ID`, `Turma_Nome`, `Turma_Turno`, `Turma_Semestre`, `Curso_ID`) VALUES
	(1, 'S6', 'T', '2016.2', 1),
	(2, 'S5', 'N', '2016.2', 1);
/*!40000 ALTER TABLE `turma` ENABLE KEYS */;

-- Copiando estrutura para tabela sisfra.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `User_ID` int(11) NOT NULL AUTO_INCREMENT,
  `User_Login` varchar(15) NOT NULL,
  `User_Senha` varchar(15) NOT NULL,
  `User_Acesso` int(4) NOT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela sisfra.usuario: ~20 rows (aproximadamente)
DELETE FROM `usuario`;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`User_ID`, `User_Login`, `User_Senha`, `User_Acesso`) VALUES
	(1, 'ADMIN', 'ADMIN', 0),
	(2, 'PROF', 'PROF', 1),
	(3, 'FUNC', 'FUNC', 2),
	(4, 'COORD', 'COORD', 3),
	(5, 'PEDRO', 'PEDRO', 1),
	(6, '', '', 3),
	(7, 'PEDRO', 'PEDRO', 3),
	(8, 'PEDRO', 'PEDRO', 3),
	(9, 'PEDRO', 'PEDRO', 3),
	(10, 'PEDRO', 'PEDRO', 3),
	(11, 'PEDRO', 'PEDRO', 3),
	(12, 'PEDRO', 'PEDRO', 3),
	(13, 'PEDRO', 'PEDRO', 3),
	(14, 'PEDRO', 'PEDRO', 3),
	(15, 'PEDRO', 'PEDRO', 3),
	(16, 'PEDRO', 'PEDRO', 3),
	(17, 'PEDRO', 'PEDRO', 3),
	(18, 'PAULO', '123', 0),
	(19, 'PAI', '123', 0),
	(20, 'ADMIN', 'ADMIN', 0);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

-- Copiando estrutura para view sisfra.faltas
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `faltas`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `faltas` AS SELECT DISTINCT p.Prof_ID, p.Prof_Nome AS PROFESSOR,
d.Disc_ID, d.Disc_Nome AS DISCIPLINA,
f.Falta_Qtd AS QUANTIDADE,
f.Falta_Dt AS DIA,
f.Falta_Obs AS OBSERVAÇÃO,
t.Turma_Nome AS TURMA,
t.Turma_Turno AS TURNO,
t.Turma_Semestre AS Periodo,
c.Curso_ID, c.Curso_nome AS CURSO,
f.Falta_Status AS SITUACAO, f.Falta_ID,
fu.Func_ID

FROM PROFESSOR p
INNER JOIN DISCIPLINA d ON p.Prof_ID = d.Prof_ID
INNER JOIN FALTA f ON d.Disc_ID = f.Disc_ID
INNER JOIN AULA a ON d.Disc_ID = a.Disc_ID
INNER JOIN TURMA t ON t.Turma_ID = a.Turma_ID
INNER JOIN CURSO c ON c.Curso_ID = t.Curso_ID
INNER JOIN FUNCIONARIO fu ON fu.Func_ID = f.Func_ID ;

-- Copiando estrutura para view sisfra.rdt
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `rdt`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `rdt` AS SELECT DISTINCT d.Disc_ID, d.Disc_Nome, t.Turma_ID
FROM TURMA t 
INNER JOIN AULA a ON a.Turma_ID = t.Turma_ID
INNER JOIN DISCIPLINA d ON d.Disc_ID = a.Disc_ID ;

-- Copiando estrutura para view sisfra.reposicoes
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `reposicoes`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `reposicoes` AS SELECT DISTINCT p.Prof_ID, p.Prof_Nome AS PROFESSOR,
d.Disc_ID, d.Disc_Nome AS DISCIPLINA,
r.Rep_Qtd AS QUANTIDADE,
r.Rep_Dt AS DIA,
r.Rep_Turno AS TURNO,
t.Turma_Nome AS TURMA,
t.Turma_Semestre AS PERIODO,
c.Curso_ID, c.Curso_nome AS CURSO,
r.Rep_Status AS SITUACAO, r.Rep_ID

FROM PROFESSOR p
INNER JOIN DISCIPLINA d ON p.Prof_ID = d.Prof_ID
INNER JOIN REPOSICAO r ON d.Disc_ID = r.Disc_ID
INNER JOIN AULA a ON d.Disc_ID = a.Disc_ID
INNER JOIN TURMA t ON t.Turma_ID = a.Turma_ID
INNER JOIN CURSO c ON c.Curso_ID = t.Curso_ID ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
