delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;

delete from Ingredient;
insert into Ingredient (id, code, name, type)
                values (0, 'FLTO', 'Flour Tortilla', 'WRAP');
insert into Ingredient (id, code, name, type)
                values (1, 'COTO', 'Corn Tortilla', 'WRAP');
insert into Ingredient (id, code, name, type)
                values (2, 'GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingredient (id, code, name, type)
                values (3, 'CARN', 'Carnitas', 'PROTEIN');
insert into Ingredient (id, code, name, type)
                values (4, 'TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into Ingredient (id, code, name, type)
                values (5, 'LETC', 'Lettuce', 'VEGGIES');
insert into Ingredient (id, code, name, type)
                values (6, 'CHED', 'Cheddar', 'CHEESE');
insert into Ingredient (id, code, name, type)
                values (7, 'JACK', 'Monterrey Jack', 'CHEESE');
insert into Ingredient (id, code, name, type)
                values (8, 'SLSA', 'Salsa', 'SAUCE');
insert into Ingredient (id, code, name, type)
                values (9, 'SRCR', 'Sour Cream', 'SAUCE');
