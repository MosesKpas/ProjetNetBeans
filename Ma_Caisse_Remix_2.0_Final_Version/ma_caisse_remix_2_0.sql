-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 10 oct. 2022 à 17:12
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
-- Base de données : `ma_caisse_remix_2.0`
--

-- --------------------------------------------------------

--
-- Structure de la table `ajoutclient`
--

CREATE TABLE `ajoutclient` (
  `nom` varchar(15) NOT NULL,
  `postnom` varchar(15) NOT NULL,
  `prenom` varchar(15) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `code` varchar(50) NOT NULL,
  `commune` varchar(30) NOT NULL,
  `quartier` varchar(30) NOT NULL,
  `avenue` varchar(25) NOT NULL,
  `Num_parcelle` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ajoutclient`
--

INSERT INTO `ajoutclient` (`nom`, `postnom`, `prenom`, `sexe`, `telephone`, `code`, `commune`, `quartier`, `avenue`, `Num_parcelle`) VALUES
('d', 'd', 'd', 'Homme', '817 281 727', '1', 'Limete', 'resi', 'mobu', '1');

-- --------------------------------------------------------

--
-- Structure de la table `dollar`
--

CREATE TABLE `dollar` (
  `nom` varchar(20) NOT NULL,
  `postnom` varchar(20) NOT NULL,
  `code` varchar(50) NOT NULL,
  `motif` varchar(15) NOT NULL,
  `solde` double NOT NULL,
  `total` double NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `dollar`
--

INSERT INTO `dollar` (`nom`, `postnom`, `code`, `motif`, `solde`, `total`, `date`) VALUES
('d', 'd', '1', 'ENREGISTRER', 0, 0, 'Sun Oct 09 13:33:36 WAT 2022');

-- --------------------------------------------------------

--
-- Structure de la table `fraisdollar`
--

CREATE TABLE `fraisdollar` (
  `montant` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `fraisdollar`
--

INSERT INTO `fraisdollar` (`montant`) VALUES
(0);

-- --------------------------------------------------------

--
-- Structure de la table `fraisfranc`
--

CREATE TABLE `fraisfranc` (
  `montant` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `fraisfranc`
--

INSERT INTO `fraisfranc` (`montant`) VALUES
(0);

-- --------------------------------------------------------

--
-- Structure de la table `franc`
--

CREATE TABLE `franc` (
  `nom` varchar(15) NOT NULL,
  `postnom` varchar(15) NOT NULL,
  `code` varchar(10) NOT NULL,
  `motif` varchar(15) NOT NULL,
  `solde` double NOT NULL,
  `total` double NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `franc`
--

INSERT INTO `franc` (`nom`, `postnom`, `code`, `motif`, `solde`, `total`, `date`) VALUES
('d', 'd', '1', 'ENREGISTRER', 0, 0, 'Sun Oct 09 13:33:36 WAT 2022');

-- --------------------------------------------------------

--
-- Structure de la table `lesentreesdollar`
--

CREATE TABLE `lesentreesdollar` (
  `montant` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `lesentreesdollar`
--

INSERT INTO `lesentreesdollar` (`montant`) VALUES
(0);

-- --------------------------------------------------------

--
-- Structure de la table `lesentreesfranc`
--

CREATE TABLE `lesentreesfranc` (
  `montant` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `lesentreesfranc`
--

INSERT INTO `lesentreesfranc` (`montant`) VALUES
(0);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `nom` varchar(10) NOT NULL,
  `code` varchar(10) NOT NULL,
  `frais` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`nom`, `code`, `frais`) VALUES
('d', '1', '0.05');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
