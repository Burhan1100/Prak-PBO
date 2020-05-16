-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2020 at 09:09 AM
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
-- Database: `bayarkos`
--

-- --------------------------------------------------------

--
-- Table structure for table `databayar`
--

CREATE TABLE `databayar` (
  `Id` varchar(10) NOT NULL,
  `NoPesanan` char(16) NOT NULL,
  `kodeK` varchar(10) NOT NULL,
  `Tgl` varchar(50) NOT NULL,
  `Bulan` int(3) NOT NULL,
  `Bayar` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `databayar`
--

INSERT INTO `databayar` (`Id`, `NoPesanan`, `kodeK`, `Tgl`, `Bulan`, `Bayar`) VALUES
('2', '22', '45', '17-05-2020', 2, 80),
('11', '45', '44', '13-12-2017', 3, 500),
('12', '49', '44', '15-13-2019', 2, 600),
('14', '51', '55', '18-10-2009', 2, 1000),
('11', '56', '44', '12-9-2006', 1, 300),
('89', '88', '44', '16-05-2020', 3, 1000),
('90', '91', '55', '16-05-2020', 2, 500);

-- --------------------------------------------------------

--
-- Table structure for table `kos`
--

CREATE TABLE `kos` (
  `kodeK` char(10) NOT NULL,
  `NamaK` varchar(100) NOT NULL,
  `AlamatK` varchar(100) NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `Harga` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kos`
--

INSERT INTO `kos` (`kodeK`, `NamaK`, `AlamatK`, `jenis`, `Harga`) VALUES
('44', 'Kos Sahabat', 'Jl. Timbal_balik', 'Campuran', 300),
('45', 'Kos Men', 'Jl. Haliman', 'Kos Putra', 350),
('55', 'Kos Keindahn', 'Jl. Jalimanin', 'Kos Putri', 400);

-- --------------------------------------------------------

--
-- Table structure for table `pemesan`
--

CREATE TABLE `pemesan` (
  `Id` char(10) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `NoHp` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemesan`
--

INSERT INTO `pemesan` (`Id`, `Nama`, `Alamat`, `NoHp`) VALUES
('11', 'Burhan', 'Bima', '087710644505'),
('12', 'Jafar', 'Makasar', '0873628'),
('14', 'Misna', 'Medan', '0874672364'),
('2', 'Kendi', 'Semarang', '08787738489'),
('23', 'Jedo', 'Jl. Ladang', '08532640983'),
('89', 'Jarwo', 'Medan', '08656373'),
('9', 'Jiko', 'Bandung', '086734889'),
('90', 'Sopo', 'Ngawi', '08768498');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `databayar`
--
ALTER TABLE `databayar`
  ADD PRIMARY KEY (`NoPesanan`),
  ADD KEY `fkkos` (`Id`),
  ADD KEY `fkk` (`kodeK`);

--
-- Indexes for table `kos`
--
ALTER TABLE `kos`
  ADD PRIMARY KEY (`kodeK`);

--
-- Indexes for table `pemesan`
--
ALTER TABLE `pemesan`
  ADD PRIMARY KEY (`Id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `databayar`
--
ALTER TABLE `databayar`
  ADD CONSTRAINT `fkk` FOREIGN KEY (`kodeK`) REFERENCES `kos` (`kodeK`),
  ADD CONSTRAINT `fkkos` FOREIGN KEY (`Id`) REFERENCES `pemesan` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
