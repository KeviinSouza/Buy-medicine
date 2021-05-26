INSERT INTO COMPRADOR(id, nome)
	VALUES(1, 'Danilo');
INSERT INTO COMPRADOR(id, nome)
	VALUES(2, 'Ediana');
INSERT INTO COMPRADOR(id, nome)
	VALUES(3, 'Dayane');

INSERT INTO UNIDADE(id, nome, comprador_unidade) 
	VALUES(1, 'Analia Franco',1);
INSERT INTO UNIDADE(id, nome, comprador_unidade) 
	VALUES(2, 'Itaim Bibi',1);
INSERT INTO UNIDADE(id, nome, comprador_unidade) 
	VALUES(3, 'Mocca',2);
	
INSERT INTO MEDICAMENTO(id,nome, tipo, quantidade_estoque,unidade_de_medida,unidade_medicamento) 
	VALUES(1,'dipirona ', 'analgesico ', '40','10/cx',1);
INSERT INTO MEDICAMENTO(id,nome, tipo, quantidade_estoque,unidade_de_medida,unidade_medicamento) 
	VALUES(2,'Cefazolina  ', 'antibiótico  ', '10','frasco',1);
INSERT INTO MEDICAMENTO(id,nome, tipo, quantidade_estoque,unidade_de_medida,unidade_medicamento) 
	VALUES(3,'Propofol ', 'anestesicos  ', '20','20/ml',2);



