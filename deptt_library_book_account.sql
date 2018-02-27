-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: deptt_library
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book_account`
--

DROP TABLE IF EXISTS `book_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_account` (
  `BOOK_ID` int(11) NOT NULL,
  `BOOK_NAME` varchar(45) DEFAULT NULL,
  `BOOK_AUTHOR` varchar(45) DEFAULT NULL,
  `PUBLISHING_HOUSE` varchar(45) DEFAULT NULL,
  `ISSUED_TO` int(11) DEFAULT '1',
  `STATUS` varchar(45) DEFAULT '0',
  PRIMARY KEY (`BOOK_ID`),
  KEY `ISSUED_TO_idx` (`ISSUED_TO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_account`
--

LOCK TABLES `book_account` WRITE;
/*!40000 ALTER TABLE `book_account` DISABLE KEYS */;
INSERT INTO `book_account` VALUES (1000,'Modern Operating Systems.','Tanenbaum,Andrew S.','Prentice Hall',NULL,NULL),(1001,'Database System Concepts.','Korth,Henry F.','N.York,McGraw-Hill Higher Education Ltd.,2006',NULL,NULL),(1002,'C++ The Complete Reference','Herbert Schildt','McGraw-Hill ',NULL,NULL),(1003,'Java The Complete Reference','Herbert Schildt','McGraw-Hill ',NULL,NULL),(1004,'C The Complete Reference','Herbert Schildt','McGraw-Hill ',NULL,NULL),(1005,'C# The Complete Reference','Herbert Schildt','McGraw-Hill ',NULL,NULL),(1006,'Java A Beginners guide.','Herbert Schildt','McGraw-Hill ',NULL,NULL),(1007,'Intro to Computation & Programming in Python','John V Guttag','MIT Press',NULL,NULL),(1008,'Data Structures through C and C++','Langsam,Augenstein,Tanenbaum','Pearson India',NULL,NULL),(1009,'Data Structures through C ','yashwant P kanetkar','BPB Publications',NULL,NULL),(1010,'Let Us Java ','yashwant P kanetkar','BPB Publications',NULL,NULL),(1011,'Digital electronics\n','William H Gothman','PHI Learning',NULL,NULL),(1012,'Wireless Communication','Theodore Rappaport','PHI Learning',NULL,NULL),(1013,'Discrete Mathematics ','Kenneth H Rosen.','Tata McGraw Hill Education.',NULL,NULL),(1014,'Digital Circuit and Logic Design \n','M.Morris Mano.','Pearson India.',NULL,NULL),(1015,'Java2','Ivor Horton.','Wrox.',NULL,NULL),(1016,'Operating System Concepts\n','William Stallings.','Pearson India.',NULL,NULL),(1017,'Data Communications and Networking \n','Bahroz A Farozan.','Pearson India.',NULL,NULL),(1018,'Database Systems','Ramez Elmasri,Shankar Navathe.','Pearson India.',NULL,NULL),(1019,'Database Systems','Thomas Connely,Carolyn Begg.','Addison Wesley.',NULL,NULL),(1020,'Algorithms','Robert Sedgewick, Kevin wayne.','Addison Wesley.',NULL,NULL),(1021,'Professional C++ ','Nicholas A. Solter,Scott J. Kleper','Wrox',NULL,NULL),(1022,'Computer Networks','Andrew S Tanenbaum.','Pearson India.',NULL,NULL),(1023,'Head First Java','Kathy Siera & Bert Bates','ORielly',NULL,NULL);
/*!40000 ALTER TABLE `book_account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-08 14:46:53
