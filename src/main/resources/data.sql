delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;

delete from Ingredient;
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),0, 'FLTO', 'Flour Tortilla', 'WRAP');
insert into Ingredient (uuid,id, code, name, type)
                values random_uuid(),1, 'COTO', 'Corn Tortilla', 'WRAP');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),2, 'GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),3, 'CARN', 'Carnitas', 'PROTEIN');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),4, 'TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),5, 'LETC', 'Lettuce', 'VEGGIES');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),6, 'CHED', 'Cheddar', 'CHEESE');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),7, 'JACK', 'Monterrey Jack', 'CHEESE');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),8, 'SLSA', 'Salsa', 'SAUCE');
insert into Ingredient (uuid,id, code, name, type)
                values (random_uuid(),9, 'SRCR', 'Sour Cream', 'SAUCE');
