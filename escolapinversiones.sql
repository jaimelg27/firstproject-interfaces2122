-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2021 a las 03:53:11
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `escolapinversiones`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `accounts`
--

CREATE TABLE `accounts` (
  `id` varchar(10) NOT NULL,
  `value` decimal(8,2) NOT NULL,
  `id_client` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `accounts`
--

INSERT INTO `accounts` (`id`, `value`, `id_client`) VALUES
('5694820442', '259.64', '3131231');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clients`
--

CREATE TABLE `clients` (
  `id` varchar(8) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `telephonenumb` varchar(9) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `postalcode` varchar(5) NOT NULL,
  `country` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telpassword` varchar(255) DEFAULT NULL,
  `accana` int(11) NOT NULL DEFAULT 0,
  `accaena` int(11) NOT NULL DEFAULT 0,
  `accfer` int(11) NOT NULL DEFAULT 0,
  `acciag` int(11) NOT NULL DEFAULT 0,
  `accmel` int(11) NOT NULL DEFAULT 0,
  `accrep` int(11) NOT NULL DEFAULT 0,
  `acctef` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clients`
--

INSERT INTO `clients` (`id`, `name`, `surname`, `telephonenumb`, `email`, `address`, `city`, `postalcode`, `country`, `password`, `telpassword`, `accana`, `accaena`, `accfer`, `acciag`, `accmel`, `accrep`, `acctef`) VALUES
('', '', '', '', '', '', '', '', '', '', '470227', 1, 1, 1, 1, 1, 1, 1),
('0000000L', 'Jaime', 'Lopez', '000000000', 'jaimelopezgutierrez@escolapiosdegetafe.es', 'Adios', 'Madrid', '28000', 'España', 'Escolap', NULL, 0, 0, 0, 0, 0, 0, 0),
('3131231', 'Hola', 'Hola', '13131', 'jaefe', 'fwefwe', 'fefe', '23901', 'España', 'hola', '429794', 7, 3, 0, 0, 2, 0, 1),
('4343443A', 'Hola', 'Hola', '4343134', 'jfejf', 'fergerg', 'gregerg', '28921', 'España', 'hola', '330086', 1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `markets`
--

CREATE TABLE `markets` (
  `id` varchar(4) NOT NULL,
  `name` varchar(15) NOT NULL,
  `value` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `markets`
--

INSERT INTO `markets` (`id`, `name`, `value`) VALUES
('aena', 'Aena', '0'),
('ana', 'Acciona', '0'),
('fer', 'Ferrovial', '0'),
('iag', 'IAG', '0'),
('mel', 'Melia', '0'),
('rep', 'Repsol', '0'),
('tef', 'Telefonica', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movements`
--

CREATE TABLE `movements` (
  `id` int(11) NOT NULL,
  `id_account` varchar(10) NOT NULL,
  `id_market` varchar(4) DEFAULT NULL,
  `value` decimal(8,2) NOT NULL,
  `concept` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `movements`
--

INSERT INTO `movements` (`id`, `id_account`, `id_market`, `value`, `concept`) VALUES
(1, '5694820442', NULL, '100.00', 'Ingreso mediante tarjeta bancaria'),
(4, 'default', 'ana', '27.34', 'Compra acciones'),
(5, 'default', 'ana', '6.46', 'Compra acciones'),
(6, 'default', 'aena', '116.10', 'Compra acciones');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `workers`
--

CREATE TABLE `workers` (
  `id` varchar(8) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `telephonenumb` varchar(9) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `postalcode` varchar(5) NOT NULL,
  `country` varchar(255) NOT NULL,
  `position` enum('operador','supervisor') DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `id_supervisor` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `workers`
--

INSERT INTO `workers` (`id`, `name`, `surname`, `telephonenumb`, `address`, `city`, `postalcode`, `country`, `position`, `password`, `id_supervisor`) VALUES
('0000000L', 'Jaime', 'López', '000000000', 'Calle Rio Turbio', 'Madrid', '28000', 'España', 'supervisor', 'escolap', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `accounts_ibfk_1` (`id_client`);

--
-- Indices de la tabla `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `markets`
--
ALTER TABLE `markets`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `movements`
--
ALTER TABLE `movements`
  ADD PRIMARY KEY (`id`),
  ADD KEY `movements_ibfk_1` (`id_account`),
  ADD KEY `movements_ibfk_2` (`id_market`);

--
-- Indices de la tabla `workers`
--
ALTER TABLE `workers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_supervisor` (`id_supervisor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `movements`
--
ALTER TABLE `movements`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `accounts`
--
ALTER TABLE `accounts`
  ADD CONSTRAINT `accounts_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clients` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `movements`
--
ALTER TABLE `movements`
  ADD CONSTRAINT `movements_ibfk_2` FOREIGN KEY (`id_market`) REFERENCES `markets` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `workers`
--
ALTER TABLE `workers`
  ADD CONSTRAINT `workers_ibfk_1` FOREIGN KEY (`id_supervisor`) REFERENCES `workers` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
