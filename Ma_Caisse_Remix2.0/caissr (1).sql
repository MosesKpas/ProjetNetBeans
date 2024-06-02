-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 10 oct. 2022 à 18:08
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
-- Base de données : `caissr`
--

-- --------------------------------------------------------

--
-- Structure de la table `bilandollar`
--

CREATE TABLE `bilandollar` (
  `montant` double NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bilandollar`
--

INSERT INTO `bilandollar` (`montant`, `date`) VALUES
(0, '0'),
(950, '07/10/2022'),
(1950, '07/10/2022 08:21:50'),
(1900, '07/10/2022 09:08:39');

-- --------------------------------------------------------

--
-- Structure de la table `bilanfranc`
--

CREATE TABLE `bilanfranc` (
  `montant` double NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bilanfranc`
--

INSERT INTO `bilanfranc` (`montant`, `date`) VALUES
(0, '0'),
(900, '07/10/2022'),
(1900, '07/10/2022 08:21:27'),
(1885, '07/10/2022 09:01:02'),
(1800, '07/10/2022 09:09:02'),
(1880, '10/10/2022 04:51:14');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `nom` varchar(123) NOT NULL,
  `postnom` varchar(123) NOT NULL,
  `prenom` varchar(123) NOT NULL,
  `numero` varchar(123) NOT NULL,
  `commune` varchar(123) NOT NULL,
  `quartier` varchar(123) NOT NULL,
  `avenue` varchar(123) NOT NULL,
  `num` varchar(123) NOT NULL,
  `code` varchar(123) NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`nom`, `postnom`, `prenom`, `numero`, `commune`, `quartier`, `avenue`, `num`, `code`, `date`) VALUES
('kapend', 'mbav', 'moise', '123 456 789', 'LIMETE', 'residentiel', 'mobutu', '1', '1290', '07/10/202207:04:11');

-- --------------------------------------------------------

--
-- Structure de la table `dollar`
--

CREATE TABLE `dollar` (
  `nom` varchar(123) NOT NULL,
  `postnom` varchar(123) NOT NULL,
  `prenom` varchar(123) NOT NULL,
  `motif` varchar(123) NOT NULL,
  `montant` double NOT NULL,
  `total` double NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `dollar`
--

INSERT INTO `dollar` (`nom`, `postnom`, `prenom`, `motif`, `montant`, `total`, `date`) VALUES
('kapend', 'mbav', 'moise', 'enregistrement', 0, 0, '07/10/2022 07:04:11'),
('kapend', 'mbav', 'moise', 'depot', 1000, 950, '07/10/2022 07:04:39'),
('kapend', 'mbav', 'moise', 'depot', 1000, 1950, '07/10/2022 08:21:50'),
('kapend', 'mbav', 'moise', 'retrait', 50, 1805, '07/10/2022 08:22:05'),
('kapend', 'mbav', 'moise', 'retrait', 50, 1752.5, '07/10/2022 08:27:48'),
('kapend', 'mbav', 'moise', 'motif', 50, 1702.5, '07/10/2022 09:08:39');

-- --------------------------------------------------------

--
-- Structure de la table `franc`
--

CREATE TABLE `franc` (
  `nom` varchar(123) NOT NULL,
  `postnom` varchar(123) NOT NULL,
  `prenom` varchar(123) NOT NULL,
  `motif` varchar(123) NOT NULL,
  `montant` double NOT NULL,
  `total` double NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `franc`
--

INSERT INTO `franc` (`nom`, `postnom`, `prenom`, `motif`, `montant`, `total`, `date`) VALUES
('kapend', 'mbav', 'moise', 'enregistrement', 0, 0, '07/10/2022 07:04:11'),
('kapend', 'mbav', 'moise', 'depot', 1000, 900, '07/10/2022 08:19:56'),
('kapend', 'mbav', 'moise', 'depot', 1000, 1900, '07/10/2022 08:21:27'),
('kapend', 'mbav', 'moise', 'retrait', 100, 1620, '07/10/2022 08:34:52'),
('kapend', 'mbav', 'moise', 'retrait', 15, 1605, '07/10/2022 09:01:02'),
('kapend', 'mbav', 'moise', 'retrait', 85, 1520, '07/10/2022 09:09:02'),
('kapend', 'mbav', 'moise', 'depot', 80, 1600, '10/10/2022 04:51:14');

-- --------------------------------------------------------

--
-- Structure de la table `pourcentagedollar`
--

CREATE TABLE `pourcentagedollar` (
  `montant` double NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `pourcentagedollar`
--

INSERT INTO `pourcentagedollar` (`montant`, `date`) VALUES
(0, '0'),
(50, '07/10/2022 07:04:39'),
(95, '07/10/2022 08:22:05'),
(2.5, '07/10/2022 08:27:48');

-- --------------------------------------------------------

--
-- Structure de la table `pourcentagefranc`
--

CREATE TABLE `pourcentagefranc` (
  `montant` double NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `pourcentagefranc`
--

INSERT INTO `pourcentagefranc` (`montant`, `date`) VALUES
(0, '0'),
(100, '07/10/2022 08:19:56'),
(180, '07/10/2022 08:34:52');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `nom` varchar(123) NOT NULL,
  `code` varchar(123) NOT NULL,
  `commune` varchar(123) NOT NULL,
  `fraisDollar` double NOT NULL,
  `fraisFranc` double NOT NULL,
  `mode` int(1) NOT NULL,
  `date` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`nom`, `code`, `commune`, `fraisDollar`, `fraisFranc`, `mode`, `date`) VALUES
('a', 'a', 'a', 10, 10, 0, ''),
('b', 'b', 'b', 5, 5, 0, ''),
('moi', 'toi', 'ici', 5, 10, 1, '07/10/2022');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
