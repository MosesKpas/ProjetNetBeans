-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 24 sep. 2022 à 00:09
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE `produit` (
  `nom` varchar(20) NOT NULL,
  `qte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`nom`, `qte`) VALUES
('Ordinateur', 50),
('Congelateur', 50),
('Television', 50),
('Micro_onde', 50),
('Machine_a_lavee', 50),
('Aspirateur', 50),
('Frigo', 50),
('Fer_a_repasser', 50),
('Iphone12', 50),
('Playstation4', 50),
('Cuisiniere', 50),
('Playstation5', 50),
('Iphone12', 51),
('Ordinateur', 49),
('Ordinateur', 48),
('Ordinateur', 47),
('Playstation5', 49),
('Fer_a_repasser', 49),
('Aspirateur', 49),
('Iphone12', 50),
('Iphone12', 48),
('Ordinateur', 46),
('Congelateur', 49),
('Ordinateur', 45),
('Congelateur', 48),
('Ordinateur', 44),
('Congelateur', 47),
('Ordinateur', 43);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `nom` varchar(30) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`nom`, `pass`) VALUES
('kapend', '123');

-- --------------------------------------------------------

--
-- Structure de la table `useradm`
--

CREATE TABLE `useradm` (
  `nom` varchar(30) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `useradm`
--

INSERT INTO `useradm` (`nom`, `pass`) VALUES
('Max', '45');

-- --------------------------------------------------------

--
-- Structure de la table `ventes`
--

CREATE TABLE `ventes` (
  `nom` varchar(30) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
