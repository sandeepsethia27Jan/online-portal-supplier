-- *********************************************************************
-- Nanesh Traders suppliers- v1.0 MYSQL Database Schema Creation Script
-- Run as Intended Database User
-- Create database and user before executing script
-- *********************************************************************

USE nanesh_traders_suppliers;

--
-- Table structure for table `supplier`
-- Used for storing registered customers
--
CREATE TABLE IF NOT EXISTS `supplier` (
c AUTO_INCREMENT,
`firstName` varchar(255) NOT NULL,
`lastName` varchar(255) DEFAULT NULL,
`firmName` varchar(255) NOT NULL,
`GSTN` varchar(20) DEFAULT NULL
PRIMARY KEY (`customerId`),
UNIQUE KEY `customerdata_u1` (`firmName`,`GSTN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table `customerAddress`
-- Used for storing customers address
--

CREATE TABLE IF NOT EXISTS `customerAddress` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`unitNo` varchar(255) DEFAULT NULL,
`blockNumber` varchar(255) DEFAULT NULL,
`streetName` varchar(255) DEFAULT NULL,
`district` varchar(255) DEFAULT NULL,
`state` varchar(255) DEFAULT NULL,
`postalCode` bigint(9) NOT NULL,
`customerId` bigint(20) NOT NULL
PRIMARY KEY (`id`),
INDEX `FK_customeraddress_customer` (`customerId`),
	CONSTRAINT `FK_customeraddress_customer` FOREIGN KEY (`customerId`) REFERENCES `supplier` (`customerid`) ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
