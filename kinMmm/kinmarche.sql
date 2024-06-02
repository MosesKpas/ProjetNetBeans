-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 30 nov. 2021 à 06:35
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
-- Base de données : `kinmarche`
--

-- --------------------------------------------------------

--
-- Structure de la table `achat`
--

CREATE TABLE `achat` (
  `quantite` double NOT NULL,
  `prix` double NOT NULL,
  `produit` varchar(123) NOT NULL,
  `montant` double NOT NULL,
  `client` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `achat`
--

INSERT INTO `achat` (`quantite`, `prix`, `produit`, `montant`, `client`) VALUES
(100, 2500, ' a', 2500, ''),
(200, 2500, ' a', 5000, ''),
(100, 3000, ' b', 3000, ''),
(300, 3000, ' c', 9000, ''),
(500, 2500, ' a', 12500, ''),
(8, 14, '45k', 7, ''),
(1, 5, '', 0, ''),
(1.5, 2.3, '45', 8, ''),
(3, 5, 'pain', 1500, 'ax'),
(7, 200, 'biscuit', 1400, 'ax'),
(1, 500, 'pain', 500, 'ax'),
(4, 3000, ' b', 120, ''),
(4, 3000, ' b', 120, 'marie');

-- --------------------------------------------------------

--
-- Structure de la table `achat1`
--

CREATE TABLE `achat1` (
  `Quantité` double NOT NULL,
  `prix` int(11) NOT NULL,
  `produit` varchar(123) NOT NULL,
  `montant` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `achat1`
--

INSERT INTO `achat1` (`Quantité`, `prix`, `produit`, `montant`) VALUES
(4, 3000, 'b', 120),
(4, 3000, 'b', 120);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `nom` varchar(132) NOT NULL,
  `num` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`nom`, `num`) VALUES
('a', 1),
('JGNFKJROE', 78556),
('SARAH', 821074424),
('az', 3),
('az', 5),
('marie', 1);

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE `commande` (
  `nomProduit` varchar(123) NOT NULL,
  `quantite` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `commande`
--

INSERT INTO `commande` (`nomProduit`, `quantite`) VALUES
('saucisse', 10);

-- --------------------------------------------------------

--
-- Structure de la table `total`
--

CREATE TABLE `total` (
  `montant` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `total`
--

INSERT INTO `total` (`montant`) VALUES
(0),
(5000),
(8000),
(17000),
(29500);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
