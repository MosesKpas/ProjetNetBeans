-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 25 août 2021 à 14:31
-- Version du serveur : 10.4.19-MariaDB
-- Version de PHP : 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `base`
--

-- --------------------------------------------------------

--
-- Structure de la table `bilan`
--

CREATE TABLE `bilan` (
  `Date` varchar(255) NOT NULL,
  `Montant` int(112) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bilan`
--

INSERT INTO `bilan` (`Date`, `Montant`) VALUES
('1234', 340),
('1234', 350),
('1234', 100),
('1234', 12500),
('1234', 5000),
('24-08-2021  02:02:36', 5000),
('1234', 27500),
('1234', 7500),
('24-08-2021  02:44:22', 7500);

-- --------------------------------------------------------

--
-- Structure de la table `bilan2`
--

CREATE TABLE `bilan2` (
  `Date` varchar(255) NOT NULL,
  `Montant2` int(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bilan2`
--

INSERT INTO `bilan2` (`Date`, `Montant2`) VALUES
('0IK9952', 20000),
('24-08-2021  01:52:50', 12500),
('24-08-2021  02:41:44', 27500);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `Nom` varchar(255) NOT NULL,
  `Postnom` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Code` int(11) NOT NULL,
  `Adresse` varchar(255) NOT NULL,
  `NumeroTel` int(9) NOT NULL,
  `Date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`Nom`, `Postnom`, `Prenom`, `Code`, `Adresse`, `NumeroTel`, `Date`) VALUES
('Diakanua', 'Yizila', 'Jean-Claude', 1234, 'Onl 2 numero 8 Salongo- Lemba', 974446901, '22-08-2021  08:04:57'),
('a', 'b', 'c', 1234, 'hkv', 2314, '22-08-2021  08:06:57'),
('a', 'b', 'c', 123456, 'ksadb', 2354, '22-08-2021  08:14:23');

-- --------------------------------------------------------

--
-- Structure de la table `dollar`
--

CREATE TABLE `dollar` (
  `Nom` varchar(255) NOT NULL,
  `Postnom` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Date` varchar(255) NOT NULL,
  `Montant` int(113) NOT NULL,
  `Motif` varchar(20) NOT NULL,
  `MontantTotal` int(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `dollar`
--

INSERT INTO `dollar` (`Nom`, `Postnom`, `Prenom`, `Date`, `Montant`, `Motif`, `MontantTotal`) VALUES
('a', 'b', 'c', 'd', 123, '', 0),
('a', 'b', 'c', '1234', 263, '', 0),
('a', 'b', 'c', '1234', 340, '', 0),
('a', 'b', 'c', '22-08-2021  08:14:23', 0, 'ENREGISTREMENT', 0),
('Diakanua', 'Yizila', 'Jean-Claude', '24-08-2021  02:02:36', 5000, 'Depot', 5000),
('Diakanua', 'Yizila', 'Jean-Claude', '24-08-2021  02:44:22', 2500, 'Depot', 7500);

-- --------------------------------------------------------

--
-- Structure de la table `franc`
--

CREATE TABLE `franc` (
  `Nom` varchar(255) NOT NULL,
  `Postnom` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Date` varchar(255) NOT NULL,
  `Montant` int(123) NOT NULL,
  `Motif` varchar(20) NOT NULL,
  `MontantTotal` int(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `franc`
--

INSERT INTO `franc` (`Nom`, `Postnom`, `Prenom`, `Date`, `Montant`, `Motif`, `MontantTotal`) VALUES
('a', 'b', 'c', '', 100, '', 0),
('a', 'b', 'c', '1234', 350, '', 0),
('a', 'b', 'c', '22-08-2021  08:14:23', 0, 'ENREGISTREMENT', 0),
('Diakanua', 'Yizila', 'Jean-Claude', '24-08-2021  01:52:50', 12500, 'Depot', 12500),
('Diakanua', 'Yizila', 'Jean-Claude', '24-08-2021  02:41:44', 15000, 'Depot', 27500);

-- --------------------------------------------------------

--
-- Structure de la table `logg`
--

CREATE TABLE `logg` (
  `Nom` varchar(125) NOT NULL,
  `Code` varchar(125) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `logg`
--

INSERT INTO `logg` (`Nom`, `Code`) VALUES
('mon', 'nom');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
