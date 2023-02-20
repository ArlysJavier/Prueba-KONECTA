-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-02-2023 a las 15:29:53
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_productos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Referencia` varchar(50) NOT NULL,
  `Precio` int(11) NOT NULL,
  `Peso` int(11) NOT NULL,
  `Categoria` varchar(50) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Fecha` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`ID`, `Nombre`, `Referencia`, `Precio`, `Peso`, `Categoria`, `Stock`, `Fecha`) VALUES
(0, 'Cafe Americano', 'Ref001', 3400, 24, 'Premiun', 69, '2023-02-20 11:31:20'),
(2, 'Cafe Colombia', 'Ref002', 2850, 20, 'Premiun', 48, '2023-02-20 04:45:06'),
(4, 'Cafe del Campo', 'Ref003', 2500, 12, 'Gold', 22, '2023-02-20 07:59:24'),
(5, 'Cafe old 17', 'Ref004', 3300, 18, 'Gold', 9, '2023-02-20 08:00:33'),
(6, 'Cafe Juan V', 'Ref005', 1850, 9, 'Plata', 26, '2023-02-20 08:03:50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Referencia` varchar(50) NOT NULL,
  `Und_Vendidas` varchar(50) NOT NULL,
  `Fecha_de_venta` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`ID`, `Nombre`, `Referencia`, `Und_Vendidas`, `Fecha_de_venta`) VALUES
(1, 'Cafe Juan V', 'Ref005', '2', '2023-02-20 10:50:11'),
(2, 'Cafe Americano', 'Ref001', '1', '2023-02-20 11:17:56'),
(3, 'Cafe Colombia', 'Ref002', '7', '2023-02-20 11:20:29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
