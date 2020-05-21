-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2020 at 03:28 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiketkereta`
--

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `IdKereta` char(5) NOT NULL,
  `NamaKereta` varchar(59) NOT NULL,
  `Tujuan` varchar(50) NOT NULL,
  `Harga` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`IdKereta`, `NamaKereta`, `Tujuan`, `Harga`) VALUES
('1', 'KA Tanah Abang', 'Jakarta', 430000),
('12', 'KA Tanah Air', 'semarang', 500000),
('2', 'KA Surapati', 'Surabaya', 650000),
('22', 'KA Indonesia', 'Joja', 450000),
('3', 'KA Telepati', 'Solo', 300000),
('4', 'KA Mersurya', 'Bandung', 580000),
('5', 'KA Kalimalang', 'Malang', 480000),
('6', 'KA Bersinar', 'Bekasi', 620000);

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `IdPemesan` char(5) NOT NULL,
  `NamaP` varchar(50) NOT NULL,
  `AlamatP` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`IdPemesan`, `NamaP`, `AlamatP`) VALUES
('12', 'Misna', 'Kawuwu'),
('2', 'Bekil', 'Jombang Utara'),
('3', 'Jafar', 'Lante'),
('31', 'Burhan', 'Bima');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `IdPesanan` char(5) NOT NULL,
  `IdPemesan` char(5) NOT NULL,
  `idKereta` char(5) NOT NULL,
  `NoKursi` varchar(5) NOT NULL,
  `Kelas` varchar(80) NOT NULL,
  `Tgl` varchar(40) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Bayar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`IdPesanan`, `IdPemesan`, `idKereta`, `NoKursi`, `Kelas`, `Tgl`, `Status`, `Bayar`) VALUES
('1', '12', '12', '23', 'Kilat', '12-12-2010', 'Lunas', 70000),
('11', '31', '22', '21', 'kital', '22-08-2020', 'Lunas', 450000),
('2', '2', '2', '32', 'Kilat', '21-05-2020', 'Lunas', 650000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`IdKereta`);

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`IdPemesan`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`IdPesanan`),
  ADD KEY `fk_kereta` (`idKereta`),
  ADD KEY `fk_penumpang` (`IdPemesan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tiket`
--
ALTER TABLE `tiket`
  ADD CONSTRAINT `fk_kereta` FOREIGN KEY (`idKereta`) REFERENCES `kereta` (`IdKereta`),
  ADD CONSTRAINT `fk_penumpang` FOREIGN KEY (`IdPemesan`) REFERENCES `penumpang` (`IdPemesan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
