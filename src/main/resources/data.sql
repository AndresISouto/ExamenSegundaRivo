
-- =================================================ing
-- INSERTS PARA LA ENTIDAD PERSONA
-- =================================================
INSERT INTO persona (id, nombre, apellidos, dni) VALUES (1, "Juan", "Gómez", "12345678A");
INSERT INTO persona (id, nombre, apellidos, dni) VALUES (2, "María", "López", "87654321B");
INSERT INTO persona (id, nombre, apellidos, dni) VALUES (3, "Carlos", "Rodríguez", "11223344C");
INSERT INTO persona (id, nombre, apellidos, dni) VALUES (4, "Elena", "Sanz", "44332211D");

-- =================================================
-- INSERTS PARA LA ENTIDAD TRABAJO
-- =================================================
INSERT INTO trabajo (id, nombre_puesto, sector) VALUES (1, "Desarrollador Java", "IT");
INSERT INTO trabajo (id, nombre_puesto, sector) VALUES (2, "Analista de Datos", "IT");
INSERT INTO trabajo (id, nombre_puesto, sector) VALUES (3, "Gerente de Proyecto", "Gestión");
INSERT INTO trabajo (id, nombre_puesto, sector) VALUES (4, "Soporte Técnico", "IT");
INSERT INTO trabajo (id, nombre_puesto, sector) VALUES (5, "Diseñador UI/UX", "Diseño");
INSERT INTO trabajo (id, nombre_puesto, sector) VALUES (6, "Arquitecto de Sistemas", "IT");

-- =================================================
-- INSERTS PARA LA ENTIDAD VIDA_LABORAL (N:M)
-- Cumpliendo: 1 trabajo por año fiscal por persona
-- =================================================

-- Historial de Juan (Persona 1)
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (1, 1, 4, 2020, "Practicas", 18500.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (2, 1, 4, 2021, "Temporal", 21000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (3, 1, 1, 2022, "Indefinido", 28000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (4, 1, 1, 2023, "Indefinido", 30000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (5, 1, 1, 2024, "Indefinido", 32000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (6, 1, 6, 2025, "Indefinido", 45000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (7, 1, 6, 2026, "Indefinido", 48000.00);

-- Historial de María (Persona 2)
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (8, 2, 5, 2020, "Temporal", 22000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (9, 2, 5, 2021, "Indefinido", 25000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (10, 2, 2, 2022, "Indefinido", 35000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (11, 2, 2, 2023, "Indefinido", 37000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (12, 2, 3, 2024, "Indefinido", 50000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (13, 2, 3, 2025, "Indefinido", 52000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (14, 2, 3, 2026, "Indefinido", 55000.00);

-- Historial de Carlos (Persona 3)
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (15, 3, 1, 2020, "Indefinido", 40000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (16, 3, 1, 2021, "Indefinido", 42000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (17, 3, 6, 2022, "Indefinido", 55000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (18, 3, 6, 2023, "Indefinido", 58000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (19, 3, 6, 2024, "Indefinido", 60000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (20, 3, 3, 2025, "Indefinido", 65000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (21, 3, 3, 2026, "Indefinido", 68000.00);

-- Historial de Elena (Persona 4)
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (22, 4, 2, 2020, "Practicas", 15000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (23, 4, 2, 2021, "Temporal", 19000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (24, 4, 5, 2022, "Temporal", 24000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (25, 4, 5, 2023, "Indefinido", 27000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (26, 4, 1, 2024, "Indefinido", 33000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (27, 4, 1, 2025, "Indefinido", 35000.00);
INSERT INTO vida_laboral (id, persona_id, trabajo_id, anho_fiscal, tipo_contrato, salario_bruto_anual) VALUES (28, 4, 1, 2026, "Indefinido", 38000.00);
