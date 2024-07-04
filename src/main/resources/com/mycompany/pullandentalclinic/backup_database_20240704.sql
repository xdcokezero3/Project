-- MySQL dump 10.13  Distrib 8.0.37, for Win64 (x86_64)
--
-- Host: localhost    Database: pullandentalclinic
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `appid` int NOT NULL,
  `apppatient` varchar(255) DEFAULT NULL,
  `apptime` varchar(255) DEFAULT NULL,
  `appdate` date DEFAULT NULL,
  PRIMARY KEY (`appid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (1,'Louie','3:53AM','2024-07-03'),(2,'dd','9:45AM','2024-07-18'),(3,'Louie','10:00AM','2024-07-04');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dentalchart`
--

DROP TABLE IF EXISTS `dentalchart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dentalchart` (
  `dcID` int NOT NULL,
  `dcpatname` varchar(255) DEFAULT NULL,
  `dcdoctor` varchar(255) DEFAULT NULL,
  `dcpcontact` varchar(255) DEFAULT NULL,
  `dcdentist` varchar(255) DEFAULT NULL,
  `dcdcontact` varchar(255) DEFAULT NULL,
  `dcvisit` varchar(255) DEFAULT NULL,
  `dcq1` varchar(255) DEFAULT NULL,
  `dcq2` varchar(255) DEFAULT NULL,
  `dcqe2` varchar(255) DEFAULT NULL,
  `dcq3` varchar(255) DEFAULT NULL,
  `dcqe3` varchar(255) DEFAULT NULL,
  `dcq4` varchar(255) DEFAULT NULL,
  `dcqe4` varchar(255) DEFAULT NULL,
  `dcq5` varchar(255) DEFAULT NULL,
  `dcqe5` varchar(255) DEFAULT NULL,
  `dcq6` varchar(255) DEFAULT NULL,
  `dcq7` varchar(255) DEFAULT NULL,
  `dcqe7` varchar(255) DEFAULT NULL,
  `dcq8` varchar(255) DEFAULT NULL,
  `dcqe8` varchar(255) DEFAULT NULL,
  `dcq9` varchar(255) DEFAULT NULL,
  `dcqe9` varchar(255) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`dcID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dentalchart`
--

LOCK TABLES `dentalchart` WRITE;
/*!40000 ALTER TABLE `dentalchart` DISABLE KEYS */;
/*!40000 ALTER TABLE `dentalchart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `invid` int NOT NULL,
  `invname` varchar(255) DEFAULT NULL,
  `invquantity` int DEFAULT NULL,
  `invdoe` date DEFAULT NULL,
  `invtype` varchar(255) DEFAULT NULL,
  `invremarks` varchar(255) DEFAULT NULL,
  `is_deleted` tinyint DEFAULT '0',
  PRIMARY KEY (`invid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,'Film',50,'2024-07-10','None','None',0),(2,'Films',10,'2024-07-10','None','None',1);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patients`
--

DROP TABLE IF EXISTS `patients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patients` (
  `patId` int NOT NULL,
  `patname` varchar(255) DEFAULT NULL,
  `patemail` varchar(255) DEFAULT NULL,
  `pataddress` varchar(255) DEFAULT NULL,
  `patcityzipcode` varchar(255) DEFAULT NULL,
  `patcontact` varchar(20) DEFAULT NULL,
  `patreligion` varchar(20) DEFAULT NULL,
  `patdob` date DEFAULT NULL,
  `patgender` varchar(10) DEFAULT NULL,
  `patage` int DEFAULT NULL,
  `patoccupation` varchar(255) DEFAULT NULL,
  `patallergies` varchar(255) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`patId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patients`
--

LOCK TABLES `patients` WRITE;
/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` VALUES (1,'Louie','louie@yahoo.com','MC','2222','2222222222','22','2024-07-04','Male',22,'22','22',0),(2,'Martin','martin@yahoo.com','MC','2222','2222222222','222','2024-07-05','Male',22,'22','22',0),(3,'Averion','averion@yahoo.com','MC','2222','2222222222','23','2001-06-11','Male',23,'23','23',0),(4,'Tintin','tintin@yahoo.com','MC','2222','2222222222','222','2001-06-11','Male',22,'22','22',0);
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reports`
--

DROP TABLE IF EXISTS `reports`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reports` (
  `repid` int NOT NULL,
  `reppatient` varchar(255) DEFAULT NULL,
  `repdate` date DEFAULT NULL,
  `repprescription` varchar(255) DEFAULT NULL,
  `repcleaning` int DEFAULT NULL,
  `repextraction` int DEFAULT NULL,
  `reprootcanal` int DEFAULT NULL,
  `repbraces` int DEFAULT NULL,
  `repdentures` int DEFAULT NULL,
  `repdentist` varchar(255) DEFAULT NULL,
  `repothers` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`repid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reports`
--

LOCK TABLES `reports` WRITE;
/*!40000 ALTER TABLE `reports` DISABLE KEYS */;
INSERT INTO `reports` VALUES (1,'Louie','2024-07-10','dd',0,0,0,0,0,'dd','ddd');
/*!40000 ALTER TABLE `reports` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_logs`
--

DROP TABLE IF EXISTS `user_logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_logs` (
  `log_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `action` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `details` text,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_logs`
--

LOCK TABLES `user_logs` WRITE;
/*!40000 ALTER TABLE `user_logs` DISABLE KEYS */;
INSERT INTO `user_logs` VALUES (1,1,'LOGIN','2024-07-02 08:02:51','User logged in successfully.'),(2,1,'LOGIN','2024-07-02 08:03:02','User logged in successfully.'),(3,0,'ADD_INVENTORY','2024-07-02 08:13:50','Inventory item added: Dba'),(4,1,'LOGIN','2024-07-02 08:29:49','User logged in successfully.'),(5,1,'LOGIN','2024-07-02 08:33:11','User logged in successfully.'),(6,1,'LOGIN','2024-07-02 08:42:12','User logged in successfully.'),(7,0,'ADD_INVENTORY','2024-07-02 08:44:32','Inventory item added: xx'),(8,0,'ADD_INVENTORY','2024-07-02 08:44:42','Inventory item added: Ethanol'),(9,0,'Edit_INVENTORY','2024-07-02 08:47:02','Inventory item edited: dd'),(10,0,'EDIT_INVENTORY','2024-07-03 05:45:28','Inventory item edited: cccccc'),(11,0,'ADD_INVENTORY','2024-07-03 05:51:28','Inventory item added: Film'),(12,0,'ADD_INVENTORY','2024-07-03 05:54:38','Inventory item added: Films'),(13,1,'LOGIN','2024-07-03 06:14:42','User logged in successfully.'),(14,1,'LOGIN','2024-07-03 06:19:32','User logged in successfully.'),(15,0,'EDIT_INVENTORY','2024-07-03 06:32:17','Inventory item edited: Film'),(16,0,'EDIT_INVENTORY','2024-07-03 06:32:42','Inventory item edited: Film'),(17,0,'EDIT_INVENTORY','2024-07-03 06:32:53','Inventory item edited: Film'),(18,0,'EDIT_INVENTORY','2024-07-03 06:32:57','Inventory item edited: Film'),(19,1,'LOGIN','2024-07-03 06:37:11','User logged in successfully.'),(20,2,'LOGIN','2024-07-03 06:40:11','User logged in successfully.'),(21,3,'LOGIN','2024-07-03 06:40:18','User logged in successfully.'),(22,2,'LOGIN','2024-07-03 06:40:36','User logged in successfully.'),(23,1,'LOGIN','2024-07-03 06:54:25','User logged in successfully.'),(24,1,'LOGIN','2024-07-03 07:56:34','User logged in successfully.'),(25,1,'LOGIN','2024-07-03 09:36:19','User logged in successfully.'),(26,1,'LOGIN','2024-07-03 14:19:49','User logged in successfully.'),(27,2,'LOGIN','2024-07-04 00:32:43','User logged in successfully.'),(28,1,'LOGIN','2024-07-04 01:01:59','User logged in successfully.'),(29,2,'LOGIN','2024-07-04 01:10:38','User logged in successfully.'),(30,2,'LOGIN','2024-07-04 01:11:08','User logged in successfully.'),(31,2,'LOGIN','2024-07-04 01:11:38','User logged in successfully.');
/*!40000 ALTER TABLE `user_logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `usersid` int NOT NULL AUTO_INCREMENT,
  `usersusername` varchar(255) NOT NULL,
  `userspassword` varchar(255) NOT NULL,
  `usersrealname` varchar(255) DEFAULT NULL,
  `usersemail` varchar(255) DEFAULT NULL,
  `usershomeaddress` varchar(255) DEFAULT NULL,
  `userscityzipcode` varchar(255) DEFAULT NULL,
  `userscontact` varchar(255) DEFAULT NULL,
  `usersreligion` varchar(255) DEFAULT NULL,
  `usersdob` date DEFAULT NULL,
  `usersgender` varchar(255) DEFAULT NULL,
  `usersage` int DEFAULT NULL,
  `usersoccupation` varchar(255) DEFAULT NULL,
  `usersaccess` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`usersid`),
  UNIQUE KEY `usersusername` (`usersusername`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'aa','aa','aa','aa@yahoo.com','aa','2222','2222222222','aa','2024-07-02','Male',22,'aa','Admin'),(2,'admin','admin123','Admin','admin@yahoo.com','MC','2222','2222222222','admin','2001-06-11','Male',23,'admin','Admin'),(3,'staff','staff123','Staff','staff@yahoo.com','MC','2222','2222222222','staff','2001-06-11','Male',23,'staff','Staff');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-04 10:11:00
