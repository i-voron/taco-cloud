SET SCHEMA TEST;
--
-- -- delete from Taco_Order_Tacos;
-- -- delete from Taco_INGREDIENTs;
-- -- delete from Taco;
-- -- delete from Taco_Order;
-- 
-- delete from INGREDIENT;
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),0, 'FLTO', 'Flour Tortilla', 'WRAP');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),1, 'COTO', 'Corn Tortilla', 'WRAP');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),2, 'GRBF', 'Ground Beef', 'PROTEIN');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),3, 'CARN', 'Carnitas', 'PROTEIN');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),4, 'TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),5, 'LETC', 'Lettuce', 'VEGGIES');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),6, 'CHED', 'Cheddar', 'CHEESE');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),7, 'JACK', 'Monterrey Jack', 'CHEESE');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),8, 'SLSA', 'Salsa', 'SAUCE');
insert into INGREDIENT (uuid,id, code, name, type) values (random_uuid(),9, 'SRCR', 'Sour Cream', 'SAUCE');
